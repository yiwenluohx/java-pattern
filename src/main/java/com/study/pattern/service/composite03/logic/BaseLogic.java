package com.study.pattern.service.composite03.logic;

import com.study.pattern.model.TreeNodeLink;

import java.util.List;
import java.util.Map;

/**
 * ClassName: BaseLogic
 * Description: 决策抽象类
 *
 * @Author: luohx
 * Date: 2022/2/17 下午5:16
 * History:
 * <author>          <time>          <version>          <desc>
 * luohx            修改时间           1.0           决策抽象类
 */
public abstract class BaseLogic implements LogicFilter {
    /**
     * 逻辑决策器
     *
     * @param matterValue      决策值
     * @param treeNodeLinkList
     * @return
     */
    @Override
    public Long filter(String matterValue, List<TreeNodeLink> treeNodeLinkList) {
        for (TreeNodeLink nodeLine : treeNodeLinkList) {
            if (decisionLogic(matterValue, nodeLine)) return nodeLine.getNodeIdTo();
        }
        return 0L;
    }

    /**
     * 获取决策值
     *
     * @param treeId
     * @param userId
     * @param decisionMatter 决策物料
     * @return
     */
    @Override
    public abstract String matterValue(Long treeId, String userId, Map<String, String> decisionMatter);

    private boolean decisionLogic(String matterValue, TreeNodeLink nodeLink) {
        switch (nodeLink.getRuleLimitType()) {
            case 1:
                return matterValue.equals(nodeLink.getRuleLimitValue());
            case 2:
                return Double.parseDouble(matterValue) > Double.parseDouble(nodeLink.getRuleLimitValue());
            case 3:
                return Double.parseDouble(matterValue) < Double.parseDouble(nodeLink.getRuleLimitValue());
            case 4:
                return Double.parseDouble(matterValue) <= Double.parseDouble(nodeLink.getRuleLimitValue());
            case 5:
                return Double.parseDouble(matterValue) >= Double.parseDouble(nodeLink.getRuleLimitValue());
            default:
                return false;
        }
    }
}
