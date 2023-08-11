package com.study.pattern.model;

import java.util.Date;

/**
 * @author luohx
 * @version 1.0.0
 * @date: 2023/8/11 下午2:34
 * @menu
 */
public class ItemExecuteRuleDetail {
    private Long projectItemRuleId;
    private String dataUuid = "";
    private String messageUuId = "";
    private String executeExpress;

    private String snCode = "";

    private String ruleConfig;

    private String actualValue = "";

    private String planValue = "";

//    private ItemResultCodeEnum resultCode;

    private Date iotCheckTime;

    private String itemRuleName = "";

    private String detectSourceType = "";

    private String ruleConditionCode = "";

    private String qCode = "";

    private String macCode = "";
    private String ipAddress = "";

    /**
     * 原材料批次号
     */
    private String rawMaterialBatchNo = "";

    /**
     * Gets the value of projectItemRuleId.
     *
     * @return the value of projectItemRuleId
     */
    public Long getProjectItemRuleId() {
        return projectItemRuleId;
    }

    /**
     * Sets the projectItemRuleId. *
     * <p>You can use getProjectItemRuleId() to get the value of projectItemRuleId</p>
     * * @param projectItemRuleId projectItemRuleId
     */
    public void setProjectItemRuleId(Long projectItemRuleId) {
        this.projectItemRuleId = projectItemRuleId;
    }

    /**
     * Gets the value of dataUuid.
     *
     * @return the value of dataUuid
     */
    public String getDataUuid() {
        return dataUuid;
    }

    /**
     * Sets the dataUuid. *
     * <p>You can use getDataUuid() to get the value of dataUuid</p>
     * * @param dataUuid dataUuid
     */
    public void setDataUuid(String dataUuid) {
        this.dataUuid = dataUuid;
    }

    /**
     * Gets the value of messageUuId.
     *
     * @return the value of messageUuId
     */
    public String getMessageUuId() {
        return messageUuId;
    }

    /**
     * Sets the messageUuId. *
     * <p>You can use getMessageUuId() to get the value of messageUuId</p>
     * * @param messageUuId messageUuId
     */
    public void setMessageUuId(String messageUuId) {
        this.messageUuId = messageUuId;
    }

    /**
     * Gets the value of executeExpress.
     *
     * @return the value of executeExpress
     */
    public String getExecuteExpress() {
        return executeExpress;
    }

    /**
     * Sets the executeExpress. *
     * <p>You can use getExecuteExpress() to get the value of executeExpress</p>
     * * @param executeExpress executeExpress
     */
    public void setExecuteExpress(String executeExpress) {
        this.executeExpress = executeExpress;
    }

    /**
     * Gets the value of snCode.
     *
     * @return the value of snCode
     */
    public String getSnCode() {
        return snCode;
    }

    /**
     * Sets the snCode. *
     * <p>You can use getSnCode() to get the value of snCode</p>
     * * @param snCode snCode
     */
    public void setSnCode(String snCode) {
        this.snCode = snCode;
    }

    /**
     * Gets the value of ruleConfig.
     *
     * @return the value of ruleConfig
     */
    public String getRuleConfig() {
        return ruleConfig;
    }

    /**
     * Sets the ruleConfig. *
     * <p>You can use getRuleConfig() to get the value of ruleConfig</p>
     * * @param ruleConfig ruleConfig
     */
    public void setRuleConfig(String ruleConfig) {
        this.ruleConfig = ruleConfig;
    }

    /**
     * Gets the value of actualValue.
     *
     * @return the value of actualValue
     */
    public String getActualValue() {
        return actualValue;
    }

    /**
     * Sets the actualValue. *
     * <p>You can use getActualValue() to get the value of actualValue</p>
     * * @param actualValue actualValue
     */
    public void setActualValue(String actualValue) {
        this.actualValue = actualValue;
    }

    /**
     * Gets the value of planValue.
     *
     * @return the value of planValue
     */
    public String getPlanValue() {
        return planValue;
    }

    /**
     * Sets the planValue. *
     * <p>You can use getPlanValue() to get the value of planValue</p>
     * * @param planValue planValue
     */
    public void setPlanValue(String planValue) {
        this.planValue = planValue;
    }

    /**
     * Gets the value of iotCheckTime.
     *
     * @return the value of iotCheckTime
     */
    public Date getIotCheckTime() {
        return iotCheckTime;
    }

    /**
     * Sets the iotCheckTime. *
     * <p>You can use getIotCheckTime() to get the value of iotCheckTime</p>
     * * @param iotCheckTime iotCheckTime
     */
    public void setIotCheckTime(Date iotCheckTime) {
        this.iotCheckTime = iotCheckTime;
    }

    /**
     * Gets the value of itemRuleName.
     *
     * @return the value of itemRuleName
     */
    public String getItemRuleName() {
        return itemRuleName;
    }

    /**
     * Sets the itemRuleName. *
     * <p>You can use getItemRuleName() to get the value of itemRuleName</p>
     * * @param itemRuleName itemRuleName
     */
    public void setItemRuleName(String itemRuleName) {
        this.itemRuleName = itemRuleName;
    }

    /**
     * Gets the value of detectSourceType.
     *
     * @return the value of detectSourceType
     */
    public String getDetectSourceType() {
        return detectSourceType;
    }

    /**
     * Sets the detectSourceType. *
     * <p>You can use getDetectSourceType() to get the value of detectSourceType</p>
     * * @param detectSourceType detectSourceType
     */
    public void setDetectSourceType(String detectSourceType) {
        this.detectSourceType = detectSourceType;
    }

    /**
     * Gets the value of ruleConditionCode.
     *
     * @return the value of ruleConditionCode
     */
    public String getRuleConditionCode() {
        return ruleConditionCode;
    }

    /**
     * Sets the ruleConditionCode. *
     * <p>You can use getRuleConditionCode() to get the value of ruleConditionCode</p>
     * * @param ruleConditionCode ruleConditionCode
     */
    public void setRuleConditionCode(String ruleConditionCode) {
        this.ruleConditionCode = ruleConditionCode;
    }

    /**
     * Gets the value of qCode.
     *
     * @return the value of qCode
     */
    public String getqCode() {
        return qCode;
    }

    /**
     * Sets the qCode. *
     * <p>You can use getqCode() to get the value of qCode</p>
     * * @param qCode qCode
     */
    public void setqCode(String qCode) {
        this.qCode = qCode;
    }

    /**
     * Gets the value of macCode.
     *
     * @return the value of macCode
     */
    public String getMacCode() {
        return macCode;
    }

    /**
     * Sets the macCode. *
     * <p>You can use getMacCode() to get the value of macCode</p>
     * * @param macCode macCode
     */
    public void setMacCode(String macCode) {
        this.macCode = macCode;
    }

    /**
     * Gets the value of ipAddress.
     *
     * @return the value of ipAddress
     */
    public String getIpAddress() {
        return ipAddress;
    }

    /**
     * Sets the ipAddress. *
     * <p>You can use getIpAddress() to get the value of ipAddress</p>
     * * @param ipAddress ipAddress
     */
    public void setIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
    }

    /**
     * Gets the value of rawMaterialBatchNo.
     *
     * @return the value of rawMaterialBatchNo
     */
    public String getRawMaterialBatchNo() {
        return rawMaterialBatchNo;
    }

    /**
     * Sets the rawMaterialBatchNo. *
     * <p>You can use getRawMaterialBatchNo() to get the value of rawMaterialBatchNo</p>
     * * @param rawMaterialBatchNo rawMaterialBatchNo
     */
    public void setRawMaterialBatchNo(String rawMaterialBatchNo) {
        this.rawMaterialBatchNo = rawMaterialBatchNo;
    }
}
