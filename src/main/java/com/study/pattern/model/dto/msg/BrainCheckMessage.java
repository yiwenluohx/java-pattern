package com.study.pattern.model.dto.msg;

import java.io.Serializable;
import java.util.Date;

/**
 * @author luohx
 * @version 1.0.0
 * @date: 2023/8/11 上午11:10
 * @menu
 */
public class BrainCheckMessage implements Serializable {
    private Long brainCheckMessageId;
    private String categoryUniqueCode;
    private Long enterpriseId;
    /**
     * 消息唯一ID
     * Code generator automatic generation
     */
    private String uuid;
    /**
     * 公司名称
     * Code generator automatic generation
     */
    private String companyName;
    /**
     * key值
     * Code generator automatic generation
     */
    private String checkKeyValue;
    /**
     * key值
     * Code generator automatic generation
     */
    private String checkKeyType;
    /**
     * 0未执行 1成功 2失败
     * Code generator automatic generation
     */
    private Integer successFlag;
    /**
     * 执行补偿次数
     * Code generator automatic generation
     */
    private Integer jobCount;
    /**
     * 错误信息
     * Code generator automatic generation
     */
    private String errorMsg;
    /**
     * 删除标志：0：未删除，1：已删除
     * Code generator automatic generation
     */
    private Integer deleteFlag;
    /**
     * 创建时间
     * Code generator automatic generation
     */
    private Date createTime;
    /**
     * 更新时间
     * Code generator automatic generation
     */
    private Date updateTime;
    /**
     * 创建人用户ID
     * Code generator automatic generation
     */
    private Long createByUserId;
    /**
     * 创建人企业ID
     * Code generator automatic generation
     */
    private Long createByEnterpriseId;
    /**
     * 更新人用户ID
     * Code generator automatic generation
     */
    private Long updateByUserId;
    /**
     * 更新人企业ID
     * Code generator automatic generation
     */
    private Long updateByEnterpriseId;

    /**
     * Gets the value of brainCheckMessageId.
     *
     * @return the value of brainCheckMessageId
     */
    public Long getBrainCheckMessageId() {
        return brainCheckMessageId;
    }

    /**
     * Sets the brainCheckMessageId. *
     * <p>You can use getBrainCheckMessageId() to get the value of brainCheckMessageId</p>
     * * @param brainCheckMessageId brainCheckMessageId
     */
    public void setBrainCheckMessageId(Long brainCheckMessageId) {
        this.brainCheckMessageId = brainCheckMessageId;
    }

    /**
     * Gets the value of categoryUniqueCode.
     *
     * @return the value of categoryUniqueCode
     */
    public String getCategoryUniqueCode() {
        return categoryUniqueCode;
    }

    /**
     * Sets the categoryUniqueCode. *
     * <p>You can use getCategoryUniqueCode() to get the value of categoryUniqueCode</p>
     * * @param categoryUniqueCode categoryUniqueCode
     */
    public void setCategoryUniqueCode(String categoryUniqueCode) {
        this.categoryUniqueCode = categoryUniqueCode;
    }

    /**
     * Gets the value of enterpriseId.
     *
     * @return the value of enterpriseId
     */
    public Long getEnterpriseId() {
        return enterpriseId;
    }

    /**
     * Sets the enterpriseId. *
     * <p>You can use getEnterpriseId() to get the value of enterpriseId</p>
     * * @param enterpriseId enterpriseId
     */
    public void setEnterpriseId(Long enterpriseId) {
        this.enterpriseId = enterpriseId;
    }

    /**
     * Gets the value of uuid.
     *
     * @return the value of uuid
     */
    public String getUuid() {
        return uuid;
    }

    /**
     * Sets the uuid. *
     * <p>You can use getUuid() to get the value of uuid</p>
     * * @param uuid uuid
     */
    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    /**
     * Gets the value of companyName.
     *
     * @return the value of companyName
     */
    public String getCompanyName() {
        return companyName;
    }

    /**
     * Sets the companyName. *
     * <p>You can use getCompanyName() to get the value of companyName</p>
     * * @param companyName companyName
     */
    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    /**
     * Gets the value of checkKeyValue.
     *
     * @return the value of checkKeyValue
     */
    public String getCheckKeyValue() {
        return checkKeyValue;
    }

    /**
     * Sets the checkKeyValue. *
     * <p>You can use getCheckKeyValue() to get the value of checkKeyValue</p>
     * * @param checkKeyValue checkKeyValue
     */
    public void setCheckKeyValue(String checkKeyValue) {
        this.checkKeyValue = checkKeyValue;
    }

    /**
     * Gets the value of checkKeyType.
     *
     * @return the value of checkKeyType
     */
    public String getCheckKeyType() {
        return checkKeyType;
    }

    /**
     * Sets the checkKeyType. *
     * <p>You can use getCheckKeyType() to get the value of checkKeyType</p>
     * * @param checkKeyType checkKeyType
     */
    public void setCheckKeyType(String checkKeyType) {
        this.checkKeyType = checkKeyType;
    }

    /**
     * Gets the value of successFlag.
     *
     * @return the value of successFlag
     */
    public Integer getSuccessFlag() {
        return successFlag;
    }

    /**
     * Sets the successFlag. *
     * <p>You can use getSuccessFlag() to get the value of successFlag</p>
     * * @param successFlag successFlag
     */
    public void setSuccessFlag(Integer successFlag) {
        this.successFlag = successFlag;
    }

    /**
     * Gets the value of jobCount.
     *
     * @return the value of jobCount
     */
    public Integer getJobCount() {
        return jobCount;
    }

    /**
     * Sets the jobCount. *
     * <p>You can use getJobCount() to get the value of jobCount</p>
     * * @param jobCount jobCount
     */
    public void setJobCount(Integer jobCount) {
        this.jobCount = jobCount;
    }

    /**
     * Gets the value of errorMsg.
     *
     * @return the value of errorMsg
     */
    public String getErrorMsg() {
        return errorMsg;
    }

    /**
     * Sets the errorMsg. *
     * <p>You can use getErrorMsg() to get the value of errorMsg</p>
     * * @param errorMsg errorMsg
     */
    public void setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
    }

    /**
     * Gets the value of deleteFlag.
     *
     * @return the value of deleteFlag
     */
    public Integer getDeleteFlag() {
        return deleteFlag;
    }

    /**
     * Sets the deleteFlag. *
     * <p>You can use getDeleteFlag() to get the value of deleteFlag</p>
     * * @param deleteFlag deleteFlag
     */
    public void setDeleteFlag(Integer deleteFlag) {
        this.deleteFlag = deleteFlag;
    }

    /**
     * Gets the value of createTime.
     *
     * @return the value of createTime
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * Sets the createTime. *
     * <p>You can use getCreateTime() to get the value of createTime</p>
     * * @param createTime createTime
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * Gets the value of updateTime.
     *
     * @return the value of updateTime
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * Sets the updateTime. *
     * <p>You can use getUpdateTime() to get the value of updateTime</p>
     * * @param updateTime updateTime
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * Gets the value of createByUserId.
     *
     * @return the value of createByUserId
     */
    public Long getCreateByUserId() {
        return createByUserId;
    }

    /**
     * Sets the createByUserId. *
     * <p>You can use getCreateByUserId() to get the value of createByUserId</p>
     * * @param createByUserId createByUserId
     */
    public void setCreateByUserId(Long createByUserId) {
        this.createByUserId = createByUserId;
    }

    /**
     * Gets the value of createByEnterpriseId.
     *
     * @return the value of createByEnterpriseId
     */
    public Long getCreateByEnterpriseId() {
        return createByEnterpriseId;
    }

    /**
     * Sets the createByEnterpriseId. *
     * <p>You can use getCreateByEnterpriseId() to get the value of createByEnterpriseId</p>
     * * @param createByEnterpriseId createByEnterpriseId
     */
    public void setCreateByEnterpriseId(Long createByEnterpriseId) {
        this.createByEnterpriseId = createByEnterpriseId;
    }

    /**
     * Gets the value of updateByUserId.
     *
     * @return the value of updateByUserId
     */
    public Long getUpdateByUserId() {
        return updateByUserId;
    }

    /**
     * Sets the updateByUserId. *
     * <p>You can use getUpdateByUserId() to get the value of updateByUserId</p>
     * * @param updateByUserId updateByUserId
     */
    public void setUpdateByUserId(Long updateByUserId) {
        this.updateByUserId = updateByUserId;
    }

    /**
     * Gets the value of updateByEnterpriseId.
     *
     * @return the value of updateByEnterpriseId
     */
    public Long getUpdateByEnterpriseId() {
        return updateByEnterpriseId;
    }

    /**
     * Sets the updateByEnterpriseId. *
     * <p>You can use getUpdateByEnterpriseId() to get the value of updateByEnterpriseId</p>
     * * @param updateByEnterpriseId updateByEnterpriseId
     */
    public void setUpdateByEnterpriseId(Long updateByEnterpriseId) {
        this.updateByEnterpriseId = updateByEnterpriseId;
    }
}
