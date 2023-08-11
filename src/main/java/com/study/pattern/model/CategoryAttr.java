package com.study.pattern.model;


/**
 * @author luohx
 * @version 1.0.0
 * @date: 2023/8/11 下午2:32
 * @menu
 */
public class CategoryAttr {
    /**
     * 项
     */
    private String attrItem;


    /**
     * 值
     */
    private String attrItemValue;

    /**
     * Gets the value of attrItem.
     *
     * @return the value of attrItem
     */
    public String getAttrItem() {
        return attrItem;
    }

    /**
     * Sets the attrItem. *
     * <p>You can use getAttrItem() to get the value of attrItem</p>
     * * @param attrItem attrItem
     */
    public void setAttrItem(String attrItem) {
        this.attrItem = attrItem;
    }

    /**
     * Gets the value of attrItemValue.
     *
     * @return the value of attrItemValue
     */
    public String getAttrItemValue() {
        return attrItemValue;
    }

    /**
     * Sets the attrItemValue. *
     * <p>You can use getAttrItemValue() to get the value of attrItemValue</p>
     * * @param attrItemValue attrItemValue
     */
    public void setAttrItemValue(String attrItemValue) {
        this.attrItemValue = attrItemValue;
    }
}
