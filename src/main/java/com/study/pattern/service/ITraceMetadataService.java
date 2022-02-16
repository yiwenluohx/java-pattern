package com.study.pattern.service;

import com.study.pattern.entity.TraceMetadata;
import com.study.pattern.model.MetaInfoVo;
import com.study.pattern.model.MetaTypeVo;

import java.util.List;

/**
 * ClassName: ITraceMetadataService
 * Description: 追溯元数据
 * @Author: luohx
 * Date: 2022/2/15 上午10:11
 * History:
 * <author>          <time>          <version>          <desc>
 * luohx            修改时间           1.0           追溯元数据
 */
public interface ITraceMetadataService {
    /**
     * 查询元数据分类列表
     *
     * @return
     */
    List<MetaTypeVo> getMetaTypeList();

    /**
     * 根据元数据分类code获取元数据信息
     *
     * @param classCode 元数据分类code
     * @return
     */
    List<MetaInfoVo> getMetaInfoByCode(String classCode);

    /**
     * 查询是否存在该code
     *
     * @param nodeCode code
     * @param level    分类级别
     * @return
     */
    TraceMetadata getMetaDataByCode(String nodeCode, Integer level);
}
