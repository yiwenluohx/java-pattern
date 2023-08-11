package com.study.pattern.model;

import java.util.List;

/**
 * @author luohx
 * @version 1.0.0
 * @date: 2023/8/11 下午2:32
 * @menu
 */
public class GoodsAttr {
    private String goodsCode;
    private String goodsName;

    private List<CategoryAttr> attrs;

    /**
     * Gets the value of goodsCode.
     *
     * @return the value of goodsCode
     */
    public String getGoodsCode() {
        return goodsCode;
    }

    /**
     * Sets the goodsCode. *
     * <p>You can use getGoodsCode() to get the value of goodsCode</p>
     * * @param goodsCode goodsCode
     */
    public void setGoodsCode(String goodsCode) {
        this.goodsCode = goodsCode;
    }

    /**
     * Gets the value of goodsName.
     *
     * @return the value of goodsName
     */
    public String getGoodsName() {
        return goodsName;
    }

    /**
     * Sets the goodsName. *
     * <p>You can use getGoodsName() to get the value of goodsName</p>
     * * @param goodsName goodsName
     */
    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName;
    }

    /**
     * Gets the value of attrs.
     *
     * @return the value of attrs
     */
    public List<CategoryAttr> getAttrs() {
        return attrs;
    }

    /**
     * Sets the attrs. *
     * <p>You can use getAttrs() to get the value of attrs</p>
     * * @param attrs attrs
     */
    public void setAttrs(List<CategoryAttr> attrs) {
        this.attrs = attrs;
    }
}
