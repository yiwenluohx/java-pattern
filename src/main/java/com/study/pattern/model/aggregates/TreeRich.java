package com.study.pattern.model.aggregates;

import com.study.pattern.model.TreeNode;
import com.study.pattern.model.TreeRoot;

import java.util.Map;

/**
 * ClassName: TreeRich
 * Description: 聚合对象，包含组织树信息
 * @Author: luohx
 * Date: 2022/2/16 下午6:02
 * History:
 * <author>          <time>          <version>          <desc>
 * luohx            修改时间           1.0         聚合对象，包含组织树信息
 */
public class TreeRich {
    private TreeRoot treeRoot;                          //树根信息
    private Map<Long, TreeNode> treeNodeMap;        //树节点ID -> 子节点

    public TreeRich(TreeRoot treeRoot, Map<Long, TreeNode> treeNodeMap) {
        this.treeRoot = treeRoot;
        this.treeNodeMap = treeNodeMap;
    }

    public TreeRoot getTreeRoot() {
        return treeRoot;
    }

    public void setTreeRoot(TreeRoot treeRoot) {
        this.treeRoot = treeRoot;
    }

    public Map<Long, TreeNode> getTreeNodeMap() {
        return treeNodeMap;
    }

    public void setTreeNodeMap(Map<Long, TreeNode> treeNodeMap) {
        this.treeNodeMap = treeNodeMap;
    }
}
