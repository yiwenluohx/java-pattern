package com.study.pattern.repository;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.study.pattern.entity.TraceStandardSettings;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * ClassName: TraceStandardSettingsMapper
 * Description:
 * @Author: luohx
 * Date: 2022/2/14 下午6:34
 * History:
 * <author>          <time>          <version>          <desc>
 * luohx            修改时间           1.0
 */
@Mapper
public interface TraceStandardSettingsMapper extends BaseMapper<TraceStandardSettings> {
    /**
     * 查询设置的所有追溯信息
     *
     * @return
     */
    List<TraceStandardSettings> getTraceTree();

    /**
     * 根据code获取设置信息
     *
     * @param nodeCode 节点code
     * @return 追溯信息实体
     */
    TraceStandardSettings getTraceSettingByCode(@Param("nodeCode") String nodeCode, @Param("level") Integer level, @Param("pid") Long pid);

    /**
     * 根据nodeId获取设置信息
     *
     * @param nodeId 节点id
     * @return 追溯信息实体
     */
    TraceStandardSettings getTraceSettingById(@Param("nodeId") Long nodeId);

    /**
     * 根据nodeId获取设置的所有子信息
     *
     * @param nodeId 节点id
     * @return 追溯集合
     */
    List<TraceStandardSettings> getTraceSettingByPid(@Param("nodeId") Long nodeId);
}
