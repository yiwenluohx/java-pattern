package com.study.pattern.service.composite03.logic;

import com.study.pattern.model.TreeNodeLink;

import java.util.List;
import java.util.Map;

/**
 * ClassName: LogicFilter
 * Description: 定义适配过滤器，让每一个提供决策能力的节点都必须实现此接口，保证统一性
 *
 * @Author: luohx
 * Date: 2022/2/17 下午5:11
 * History:
 * <author>          <time>          <version>          <desc>
 * luohx            修改时间           1.0           定义适配过滤器
 */
public interface LogicFilter {
    /**
     * 逻辑决策器
     *
     * @param matterValue          决策值
     * @param treeNodeLineInfoList 决策节点
     * @return 下一个节点Id
     */
    Long filter(String matterValue, List<TreeNodeLink> treeNodeLineInfoList);

    /**
     * 获取决策值
     *
     * @param treeId
     * @param userId
     * @param decisionMatter 决策物料
     * @return 决策值
     */
    String matterValue(Long treeId, String userId, Map<String, String> decisionMatter);
}
