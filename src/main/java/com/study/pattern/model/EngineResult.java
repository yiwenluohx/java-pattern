package com.study.pattern.model;

/**
 * ClassName: EngineResult
 * Description:  决策结果
 * Author: luohx
 * Date: 2022/2/16 下午6:04
 * History:
 * <author>          <time>          <version>          <desc>
 * luohx            修改时间           1.0           决策结果
 */
public class EngineResult {
    private boolean isSuccess; //执行结果
    private String userId;   //用户ID
    private Long treeId;     //规则树ID
    private Long nodeId;   //果实节点ID
    private String nodeValue;//果实节点值

    public EngineResult() {
    }

    public EngineResult(boolean isSuccess) {
        this.isSuccess = isSuccess;
    }

    public EngineResult(String userId, Long treeId, Long nodeId, String nodeValue) {
        this.isSuccess = true;
        this.userId = userId;
        this.treeId = treeId;
        this.nodeId = nodeId;
        this.nodeValue = nodeValue;
    }

    public boolean isSuccess() {
        return isSuccess;
    }

    public void setSuccess(boolean success) {
        isSuccess = success;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public Long getTreeId() {
        return treeId;
    }

    public void setTreeId(Long treeId) {
        this.treeId = treeId;
    }

    public Long getNodeId() {
        return nodeId;
    }

    public void setNodeId(Long nodeId) {
        this.nodeId = nodeId;
    }

    public String getNodeValue() {
        return nodeValue;
    }

    public void setNodeValue(String nodeValue) {
        this.nodeValue = nodeValue;
    }
}
