package com.study.pattern.model.dto.msg;

import java.util.List;

/**
 * @author luohx
 * @version 1.0.0
 * @date: 2023/8/11 上午11:14
 * @menu
 */
public class ProductionBatchDataMsg extends IotCheckDataMsg {
    private List<String> goodsCodes;

    private Long productionBatchId;

    /**
     * Gets the value of goodsCodes.
     *
     * @return the value of goodsCodes
     */
    public List<String> getGoodsCodes() {
        return goodsCodes;
    }

    /**
     * Sets the goodsCodes. *
     * <p>You can use getGoodsCodes() to get the value of goodsCodes</p>
     * * @param goodsCodes goodsCodes
     */
    public void setGoodsCodes(List<String> goodsCodes) {
        this.goodsCodes = goodsCodes;
    }

    /**
     * Gets the value of productionBatchId.
     *
     * @return the value of productionBatchId
     */
    public Long getProductionBatchId() {
        return productionBatchId;
    }

    /**
     * Sets the productionBatchId. *
     * <p>You can use getProductionBatchId() to get the value of productionBatchId</p>
     * * @param productionBatchId productionBatchId
     */
    public void setProductionBatchId(Long productionBatchId) {
        this.productionBatchId = productionBatchId;
    }
}
