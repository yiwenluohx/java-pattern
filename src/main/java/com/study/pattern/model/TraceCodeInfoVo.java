package com.study.pattern.model;

import lombok.Data;

import java.io.Serializable;

/**
 * ClassName: TraceCodeInfoVo
 * Description: 追溯码明细实体
 *
 * @Author: luohx
 * Date: 2022/2/16 下午3:59
 * History:
 * <author>          <time>          <version>          <desc>
 * luohx            修改时间           1.0           追溯码明细实体
 */
@Data
public class TraceCodeInfoVo implements Serializable {

    /**
     * 追溯码ID
     */
    private String traceCodeId;

    /**
     * 追溯码类型
     */
    private String traceCodeType;

    /**
     * 所属码层级
     */
    private String codeLevel;

    /**
     * 归属上层追溯码ID
     */
    private String parentTraceCodeId;

    /**
     * 下一层的码（包装）数量（兼容某个码内子码不满的情况）
     */
    private String subTraceCodeCount;

    /**
     * 下一层码（实际/标准）的计量数量
     */
    private String codeCnt;

    /**
     * 下一层码的计量单位
     */
    private String goodsUnit;

    /**
     * 归属的商品编码
     * 说明：商品码时，才有；
     */
    private String goodsNo;

    /**
     * 归属的生产商实际生产批次
     * 说明：商品码时，才有
     */
    private String productionBatchNo;
}
