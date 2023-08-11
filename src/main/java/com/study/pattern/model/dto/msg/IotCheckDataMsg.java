package com.study.pattern.model.dto.msg;

import java.io.Serializable;

/**
 * @author luohx
 * @version 1.0.0
 * @date: 2023/8/11 上午11:05
 * @menu
 */
public class IotCheckDataMsg implements DataMsg, Serializable {

    /**
     * 企业编码
     */
    private Long enterpriseId;
    /**
     * 企业名称
     */
    private String companyName;
    /**
     * 类目编码
     */
    private String categoryCode;
    /**
     * 检测key的值
     */
    private String checkKeyValue;
    /**
     * 检测key的类型：enn_code
     、schedule_batch_number
     、raw_material_batchno
     */
    private String checkKeyType;

    private String uuid;

    /**
     * Gets the value of enterpriseId.
     *
     * @return the value of enterpriseId
     */
    @Override
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
     * Gets the value of companyName.
     *
     * @return the value of companyName
     */
    @Override
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
     * Gets the value of categoryCode.
     *
     * @return the value of categoryCode
     */
    @Override
    public String getCategoryCode() {
        return categoryCode;
    }

    /**
     * Sets the categoryCode. *
     * <p>You can use getCategoryCode() to get the value of categoryCode</p>
     * * @param categoryCode categoryCode
     */
    public void setCategoryCode(String categoryCode) {
        this.categoryCode = categoryCode;
    }

    /**
     * Gets the value of checkKeyValue.
     *
     * @return the value of checkKeyValue
     */
    @Override
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
    @Override
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
     * Gets the value of uuid.
     *
     * @return the value of uuid
     */
    @Override
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
}
