package com.study.pattern.model;

import com.google.common.collect.Maps;
import com.study.pattern.model.dto.msg.DataMsg;

import java.util.List;
import java.util.Map;

/**
 * 配置信息
 *
 * @author luohx
 * @version 1.0.0
 * @date: 2023/8/11 上午11:34
 * @menu 配置信息
 */
public class ConfigInfo {

    DataMsg iotCheckDataMsg;

    /**
     * 实例对应的规则质检项数据
     */
    Map<Long, List<ProductionProjectItemRuleBo>> projectGroup;


    /**
     * 所以实测值数据
     */
    Map<String, List<IotCheckResult>> checkCodeValueDic;

    /**
     * 追溯信息
     */
    TraceCodeInfoBo traceCodeInfo = new TraceCodeInfoBo();

    /**
     * 附加信息
     */
    Map<Long, List<ItemExtInfo>> extDic = Maps.newHashMap();

    /**
     * 附加信息实测值数据
     */
    Map<String, List<IotCheckResult>> checkCodeExtValueDic = Maps.newHashMap();
}
