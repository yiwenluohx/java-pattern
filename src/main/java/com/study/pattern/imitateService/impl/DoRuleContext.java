package com.study.pattern.imitateService.impl;

import com.study.pattern.Enum.CheckNodeTypeEnum;
import com.study.pattern.model.GoodsAttr;
import com.study.pattern.model.IotCheckResult;
import com.study.pattern.model.ItemExecuteRuleDetail;
import com.study.pattern.model.ProductionProjectItemRuleBo;
import com.study.pattern.model.dto.msg.DataMsg;

import java.util.List;
import java.util.Map;
import java.util.function.BiFunction;
import java.util.function.Function;

/**
 * @author luohx
 * @version 1.0.0
 * @date: 2023/8/11 下午2:30
 * @menu
 */
public class DoRuleContext {
    /**
     * 报文信息
     */
    DataMsg iotCheckDataMsg;

    /**
     * 检测项数据
     */
    ProductionProjectItemRuleBo itemRule;
    /**
     * 实测值
     */
    Map<String, List<IotCheckResult>> checkCodeValueDic;

    /**
     * 生产计划
     */
    BiFunction<Long, String, List<String>> planFunction;

    /**
     * 商品属性值
     */
    Function<String, GoodsAttr> goodsAttr;

    /**
     * 单个过程数据
     */
    ItemExecuteRuleDetail traceInfo;

    /**
     *执行类型
     */
    CheckNodeTypeEnum checkNodeTypeEnum;
}
