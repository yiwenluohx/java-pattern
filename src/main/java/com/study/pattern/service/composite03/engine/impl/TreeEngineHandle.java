package com.study.pattern.service.composite03.engine.impl;

import com.study.pattern.model.EngineResult;
import com.study.pattern.model.TreeNode;
import com.study.pattern.model.aggregates.TreeRich;
import com.study.pattern.service.composite03.engine.EngineBase;

import java.util.Map;

/**
 * ClassName: TreeEngineHandle
 * Description:
 * Author: luohx
 * Date: 2022/2/18 上午9:28
 * History:
 * <author>          <time>          <version>          <desc>
 * luohx            修改时间           1.0
 */
public class TreeEngineHandle extends EngineBase {

    @Override
    public EngineResult process(Long treeId, String userId, TreeRich treeRich, Map<String, String> decisionMatter) {
        // 决策流程
        TreeNode treeNode = engineDecisionMaker(treeRich, treeId, userId, decisionMatter);
        // 决策结果
        return new EngineResult(userId, treeId, treeNode.getTreeNodeId(), treeNode.getNodeValue());
    }

}