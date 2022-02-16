package com.study.pattern.service;

import com.study.pattern.model.CategoryVo;
import com.study.pattern.model.TraceSceneVo;
import com.study.pattern.model.TraceTreeVo;
import com.study.pattern.model.param.MetaClassParam;
import com.study.pattern.model.param.MetaInfoParam;
import com.study.pattern.model.param.SceneParam;

import java.util.List;

/**
 * ClassName: ITraceStandardSettingsService
 * Description: 追溯标准设置
 * @Author: luohx
 * Date: 2022/2/15 上午10:13
 * History:
 * <author>          <time>          <version>          <desc>
 * luohx            修改时间           1.0           追溯标准设置
 */
public interface ITraceStandardSettingsService {
    /**
     * 查询设置的所有追溯信息
     *
     * @return
     */
    List<TraceTreeVo> getTraceTree();

    /**
     * 获取枚举中的所有追溯场景
     *
     * @return
     */
    List<TraceSceneVo> getSceneList();

    /**
     * 获取追溯平台类目列表
     *
     * @param pid 父类id
     * @return 集合列表
     */
    List<CategoryVo> getCategoryList(Long pid);

    /**
     * 追溯场景创建
     *
     * @param sceneParam 添加追溯场景参数
     * @param userId     当前操作人
     * @return 主键ID
     */
    int sceneCreate(SceneParam sceneParam, Long userId);

    /**
     * 追溯分类创建
     *
     * @param classParam 添加追溯分类参数
     * @param userId     当前操作人
     * @return 主键ID
     */
    int metaTypeCreate(MetaClassParam classParam, Long userId);

    /**
     * 追溯元数据创建
     *
     * @param infoParam 添加追溯分类参数
     * @param userId    当前操作人
     * @return 主键ID
     */
    int metaDataCreate(MetaInfoParam infoParam, Long userId);

    /**
     * 追溯场景更新
     *
     * @param sceneParam 添加追溯场景参数
     * @param userId     当前操作人
     * @return > 0 执行成功
     */
    int sceneUpdate(SceneParam sceneParam, Long userId);

    /**
     * 追溯分类更新
     *
     * @param classParam 添加追溯分类参数
     * @param userId     当前操作人
     * @return > 0 执行成功
     */
    Integer metaTypeUpdate(MetaClassParam classParam, Long userId);

    /**
     * 追溯元数据更新
     *
     * @param infoParam 添加追溯分类参数
     * @param userId    当前操作人
     * @return > 0 执行成功
     */
    Integer metaDataUpdate(MetaInfoParam infoParam, Long userId);

    /**
     * 删除追溯设置节点
     *
     * @param nodeId       需要删除的节点id
     * @param enterpriseId 企业id
     * @param userId       当前操作人
     * @param version      版本号
     * @return > 0 执行成功
     */
    Integer NodeDelete(Long nodeId, Long enterpriseId, Long userId, Long version);
}
