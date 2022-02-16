package com.study.pattern.repository;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.study.pattern.entity.TraceMetadata;
import com.study.pattern.model.MetaInfoVo;
import com.study.pattern.model.MetaTypeVo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * ClassName: TraceMetadataMapper
 * Description:
 * @Author: luohx
 * Date: 2022/2/14 下午6:33
 * History:
 * <author>          <time>          <version>          <desc>
 * luohx            修改时间           1.0
 */
@Mapper
public interface TraceMetadataMapper extends BaseMapper<TraceMetadata> {
    /**
     * 查询所有的元数据分类信息
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
    List<MetaInfoVo> getMetaInfoByCode(@Param("classCode") String classCode);

    /**
     * 查询是否存在该code
     *
     * @param nodeCode code
     * @param level    分类级别
     * @return
     */
    TraceMetadata getMetaDataByCode(@Param("nodeCode") String nodeCode, @Param("level") Integer level);
}
