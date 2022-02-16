package com.study.pattern.service.impl;

import com.study.pattern.Enum.LimitTypeEnum;
import com.study.pattern.Enum.OperateEnum;
import com.study.pattern.Enum.TraceLevelEnum;
import com.study.pattern.Enum.TraceSceneEnum;
import com.study.pattern.entity.TraceMetadata;
import com.study.pattern.entity.TraceStandardSettings;
import com.study.pattern.handler.CategoryHandler;
import com.study.pattern.model.CategoryVo;
import com.study.pattern.model.TraceSceneVo;
import com.study.pattern.model.TraceTreeVo;
import com.study.pattern.model.dto.CategoryResDto;
import com.study.pattern.model.param.MetaClassParam;
import com.study.pattern.model.param.MetaInfoParam;
import com.study.pattern.model.param.SceneParam;
import com.study.pattern.repository.TraceStandardSettingsMapper;
import com.study.pattern.service.ITraceMetadataService;
import com.study.pattern.service.ITraceStandardSettingsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.*;
import java.util.stream.Collectors;

/**
 * ClassName: TraceStandardSettingsServiceImpl
 * Description:
 *
 * @Author: luohx
 * Date: 2022/2/15 上午10:17
 * History:
 * <author>          <time>          <version>          <desc>
 * luohx            修改时间           1.0
 */
@Service
public class TraceStandardSettingsServiceImpl implements ITraceStandardSettingsService {

    @Autowired
    private TraceStandardSettingsMapper settingsMapper;

    @Autowired
    private ITraceMetadataService metadataService;

    @Autowired
    private CategoryHandler categoryHandler;

    @Override
    public List<TraceTreeVo> getTraceTree() {
        List<TraceStandardSettings> traceSettingsList = settingsMapper.getTraceTree();
        List<TraceTreeVo> treeVoList = new ArrayList<>();
        if (traceSettingsList != null) {
            //递归操作获取树形结构
            treeVoList = recursion(traceSettingsList, 0L);
        }
        return treeVoList;
    }

    @Override
    public List<TraceSceneVo> getSceneList() {
        //获取TraceSceneEnum枚举数组
        TraceSceneEnum[] sceneArr = (TraceSceneEnum.class).getEnumConstants();
        List<TraceSceneVo> sceneList = new ArrayList<>();
        if (sceneArr.length > 0) {
            for (TraceSceneEnum item : sceneArr) {
                TraceSceneVo sceneVo = new TraceSceneVo();
                sceneVo.setSceneCode(Integer.valueOf(item.getCode()));
                sceneVo.setSceneName(item.getName());
                sceneList.add(sceneVo);
            }
        }
        return sceneList;
    }

    @Override
    public List<CategoryVo> getCategoryList(Long pid) {
        List<CategoryVo> categoryVoList = new ArrayList<>();
        List<CategoryResDto> resDtos = categoryHandler.platformCategoryList(pid, null);
        if (resDtos != null) {
            categoryVoList = resDtos.stream().map(k -> new CategoryVo(k.getCategoryId(), k.getCategoryName())).collect(Collectors.toList());
        }
        return categoryVoList;
    }

    @Override
    public int sceneCreate(SceneParam sceneParam, Long userId) {
        //验证参数code是否真实存在
        TraceSceneEnum sceneEnum = this.verifySceneCode(sceneParam.getSceneCode());
        //验证code参数是否已经添加
        verifyCode(sceneParam.getSceneCode(), TraceLevelEnum.TRACE_SCENE_LEVEL, 0L);
        TraceStandardSettings settings = this.getSettingEntity(Long.valueOf(TraceLevelEnum.TRACE_SCENE_LEVEL.getCode()), sceneParam.getSceneCode(), sceneEnum.getName(), 0L, "", 0, 0L, TraceLevelEnum.TRACE_SCENE_LEVEL.getCode());
        return settingsMapper.insert(settings);
    }

    @Override
    public int metaTypeCreate(MetaClassParam classParam, Long userId) {
        //验证参数code是否真实存在
        TraceMetadata classMeta = this.verifyMetaCode(classParam.getClassCode(), TraceLevelEnum.TRACE_CLASS_LEVEL);
        //验证parentId是否存在
        TraceStandardSettings parentSettings = getParentSettings(classParam.getParentId());
        //验证code是否已经添加
        verifyCode(classParam.getClassCode(), TraceLevelEnum.TRACE_CLASS_LEVEL, classParam.getParentId());
        TraceStandardSettings settings = this.getSettingEntity(parentSettings.getRootId(), classParam.getClassCode(), classMeta.getMetadataClassName(), classParam.getParentId(), "", 0, 0L, TraceLevelEnum.TRACE_CLASS_LEVEL.getCode());
        return settingsMapper.insert(settings);
    }

    @Override
    public int metaDataCreate(MetaInfoParam infoParam, Long userId) {
        //验证参数code是否真实存在
        TraceMetadata classMeta = this.verifyMetaCode(infoParam.getInfoCode(), TraceLevelEnum.TRACE_METAINFO_LEVEL);
        //验证parentId是否存在
        TraceStandardSettings parentSettings = getParentSettings(infoParam.getParentId());
        //验证code是否已经添加
        verifyCode(infoParam.getInfoCode(), TraceLevelEnum.TRACE_METAINFO_LEVEL, infoParam.getParentId());
        //验证平台类目是否存在
        Integer limitType = LimitTypeEnum.LIMIT_TYPE_PUBLIC.getCode();
        if (!(TraceSceneEnum.TRACE_SCENE_RAW_MATERIAL.getCode().equals(parentSettings.getNodeCode()))) {
            verifyCategory(infoParam.getCategoryId());
            limitType = LimitTypeEnum.LIMIT_TYPE_CATEGORY.getCode();
        }
        TraceStandardSettings settings = this.getSettingEntity(parentSettings.getRootId(), infoParam.getInfoCode(), classMeta.getMetadataName(), infoParam.getParentId(), classMeta.getMetadataUicode(), limitType, infoParam.getCategoryId(), TraceLevelEnum.TRACE_METAINFO_LEVEL.getCode());
        return settingsMapper.insert(settings);
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
    public int sceneUpdate(SceneParam sceneParam, Long userId) {
        TraceSceneEnum sceneEnum = this.verifySceneCode(sceneParam.getSceneCode());
        //验证需要更新的数据是否存在,并组装数据
        TraceStandardSettings settings = getTraceSettings(sceneParam.getSettingsId(), userId, sceneParam.getEnterpriseId());
        //如果存在，判断code是否相同
        if (settings.getNodeCode().equals(sceneParam.getSceneCode())) {
            return settingsMapper.updateById(settings);
        } else {
            //验证code是否已经添加
            verifyCode(sceneParam.getSceneCode(), TraceLevelEnum.TRACE_SCENE_LEVEL, 0L);
            //判断是否有子节点，如果有则全部删除
            deleteOperate(settings, OperateEnum.OPERATE_UPDATE.getCode());
            //更新操作
            settings.setRootId(Long.valueOf(sceneEnum.getCode()));
            settings.setNodeCode(sceneEnum.getCode());
            settings.setNodeName(sceneEnum.getName());
            return settingsMapper.updateById(settings);
        }
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
    public Integer metaTypeUpdate(MetaClassParam classParam, Long userId) {
        //验证参数code是否真实存在
        TraceMetadata classMeta = this.verifyMetaCode(classParam.getClassCode(), TraceLevelEnum.TRACE_CLASS_LEVEL);
        //验证需要更新的数据是否存在,并组装数据
        TraceStandardSettings settings = this.getTraceSettings(classParam.getSettingsId(), userId, classParam.getEnterpriseId());
        //如果存在，判断code是否相同
        if (settings.getNodeCode().equals(classParam.getClassCode())) {
            return settingsMapper.updateById(settings);
        } else {
            //验证code是否已经添加
            verifyCode(classParam.getClassCode(), TraceLevelEnum.TRACE_CLASS_LEVEL, settings.getPid());
            //判断是否有子节点，如果有则全部删除,但不删除该节点
            deleteOperate(settings, OperateEnum.OPERATE_UPDATE.getCode());
            //更新操作
            settings.setNodeCode(classMeta.getMetadataClassCode());
            settings.setNodeName(classMeta.getMetadataClassName());
            return settingsMapper.updateById(settings);
        }
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
    public Integer metaDataUpdate(MetaInfoParam infoParam, Long userId) {
        //验证参数code是否真实存在
        TraceMetadata classMeta = this.verifyMetaCode(infoParam.getInfoCode(), TraceLevelEnum.TRACE_METAINFO_LEVEL);
        //验证需要更新的数据是否存在,并组装数据
        TraceStandardSettings settings = getTraceSettings(infoParam.getSettingsId(), userId, infoParam.getEnterpriseId());
        //如果存在，判断code是否相同
        if (settings.getNodeCode().equals(infoParam.getInfoCode())) {
            return settingsMapper.updateById(settings);
        } else {
            //验证code是否已经添加
            verifyCode(infoParam.getInfoCode(), TraceLevelEnum.TRACE_METAINFO_LEVEL, settings.getPid());
            //进行更新操作
            settings.setNodeCode(classMeta.getMetadataClassCode());
            settings.setNodeName(classMeta.getMetadataClassName());
            return settingsMapper.updateById(settings);
        }
    }

    @Override
    public Integer NodeDelete(Long nodeId, Long enterpriseId, Long userId, Long version) {
        //验证需要删除的数据是否存在
        TraceStandardSettings settings = settingsMapper.getTraceSettingById(nodeId);
        if (null == settings) {
            throw new UnsupportedOperationException("不存在需要删除的数据");
        }
        settings.setUpdateByUserId(userId);
        settings.setUpdateByEnterpriseId(enterpriseId);
        settings.setUpdateTime(new Date());
        //删除操作
        return deleteOperate(settings, OperateEnum.OPERATE_DELETE.getCode());
    }

    /**
     * 判断平台类目是否存在
     *
     * @param categoryId 公共类目id
     */
    private void verifyCategory(Long categoryId) {
        CategoryResDto resDto = categoryHandler.platformCategory(categoryId);
        if (null == resDto) {
            throw new UnsupportedOperationException("该平台类目不存在");
        }
    }

    /**
     * 判断参数parentId是否真实存在
     *
     * @param parentId 入参父id
     * @return 返回父类实体
     */
    private TraceStandardSettings getParentSettings(Long parentId) {
        TraceStandardSettings settings = settingsMapper.getTraceSettingById(parentId);
        if (settings == null) {
            throw new UnsupportedOperationException("该节点父节点不存在");
        }
        return settings;
    }

    /**
     * 验证追溯标准中是否已设置过该code
     *
     * @param code      待验证code
     * @param levelEnum 等级枚举
     * @param parentId  所属父id
     */
    private void verifyCode(String code, TraceLevelEnum levelEnum, Long parentId) {
        TraceStandardSettings standardSettings = settingsMapper.getTraceSettingByCode(code, levelEnum.getCode(), parentId);
        if (standardSettings != null) {
            throw new UnsupportedOperationException("该" + levelEnum.getMessage() + "已经存在，请勿重复添加");
        }
    }

    /**
     * 验证是否存在该场景code
     *
     * @param sceneCode 场景code
     * @return 返回场景枚举
     */
    private TraceSceneEnum verifySceneCode(String sceneCode) {
        TraceSceneEnum sceneEnum = TraceSceneEnum.getByCode(sceneCode);
        if (sceneEnum == null) {
            throw new UnsupportedOperationException("不存在该场景");
        }
        return sceneEnum;
    }

    /**
     * 根据节点等级类型和code获取元数据信息，判断code参数是否存在
     *
     * @param code      参数code
     * @param levelEnum 等级枚举
     * @return 如果存在，返回TraceMetadata实体
     */
    private TraceMetadata verifyMetaCode(String code, TraceLevelEnum levelEnum) {
        TraceMetadata metaData = metadataService.getMetaDataByCode(code, levelEnum.getCode());
        if (metaData == null) {
            throw new UnsupportedOperationException("不存在该" + levelEnum.getMessage());
        }
        return metaData;
    }

    /**
     * 验证需要更新的数据是否存在，如果存在，则组装实体返回
     *
     * @param settingsId settingsId 节点id
     * @param userId     当前操作人
     * @param eid        企业id
     * @return 返回组装后需要更新的节点实体
     */
    private TraceStandardSettings getTraceSettings(Long settingsId, Long userId, Long eid) {
        TraceStandardSettings settings = settingsMapper.getTraceSettingById(settingsId);
        if (null == settings) {
            throw new UnsupportedOperationException("不存在需要更新的数据");
        }
        settings.setUpdateByUserId(userId);
        settings.setUpdateByEnterpriseId(eid);
        settings.setUpdateTime(new Date());
        return settings;
    }

    /**
     * 判断是否有子节点, 如果有则获取需要删除的集合，进行删除
     *
     * @param settings 需要删除的节点信息
     * @return 返回删除结构 > 0, 删除成功
     */
    @Transactional(propagation = Propagation.SUPPORTS, rollbackFor = Exception.class)
    public Integer deleteOperate(TraceStandardSettings settings, Integer operateCode) {
        List<TraceStandardSettings> settingsList = settingsMapper.getTraceSettingByPid(settings.getTraceStandardSettingsId());
        if (null == settingsList) {
            settingsList = new ArrayList<>();
        }
        if (OperateEnum.OPERATE_DELETE.getCode().equals(operateCode)) {
            settingsList.add(settings);
        }
        return settingsMapper.deleteBatchIds(settingsList.stream().map(TraceStandardSettings::getTraceStandardSettingsId).collect(Collectors.toList()));
    }

    /**
     * 根据入参组装Map进行转换
     *
     * @param nodeCode   元数据code
     * @param pid        父id
     * @param uiCode     uiCode
     * @param limitType  限制类型
     * @param categoryId 公共类目id
     * @return 组装map
     */
    private TraceStandardSettings getSettingEntity(Long rootId, String nodeCode, String nodeName, Long pid, String uiCode, Integer limitType, Long categoryId, Integer level) {
        TraceStandardSettings settings = new TraceStandardSettings();
        settings.setRootId(rootId);
        settings.setPid(pid);
        settings.setLevel(level);
        settings.setNodeCode(nodeCode);
        settings.setNodeName(nodeName);
        settings.setMetadataUicode(uiCode);
        settings.setLimitType(limitType);
        settings.setCategoryId(categoryId);
        settings.setCreateByUserId(124L);
        settings.setCreateByEnterpriseId(1L);
//        Map<String, Object> paramMap = new HashMap<>(16);
//        paramMap.put("nodeCode", nodeCode);
//        paramMap.put("enterpriseId", enterpriseId);
//        paramMap.put("parentId", pid);
//        paramMap.put("uiCode", uiCode);
//        paramMap.put("limitType", limitType);
//        paramMap.put("categoryId", categoryId);

        return settings;
    }

    /**
     * 递归求追溯标准树形结构
     *
     * @param settingsList 所有设置的标准列表
     * @param pid          父id
     * @return
     */
    private List<TraceTreeVo> recursion(List<TraceStandardSettings> settingsList, Long pid) {
        List<TraceTreeVo> treeVoList = new ArrayList<>();
        List<TraceStandardSettings> traceList = null;
        settingsList.stream().filter(m -> m.getPid().equals(pid)).collect(Collectors.toList());
        traceList.forEach(k -> {
            TraceTreeVo treeVo = new TraceTreeVo();
            treeVo.setNodeId(k.getTraceStandardSettingsId());
            treeVo.setNodeCode(k.getNodeCode());
            treeVo.setNodeName(k.getNodeName());
            treeVo.setChildrenTree(recursion(settingsList, k.getTraceStandardSettingsId()));
            treeVoList.add(treeVo);
        });
        return treeVoList;
    }

}
