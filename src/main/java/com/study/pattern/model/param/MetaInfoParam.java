package com.study.pattern.model.param;

import lombok.Data;

import java.io.Serializable;

/**
 * ClassName: MetaInfoParam
 * Description:
 *
 * @Author: luohx
 * Date: 2022/2/15 上午10:34
 * History:
 * <author>          <time>          <version>          <desc>
 * luohx            修改时间           1.0
 */
@Data
public class MetaInfoParam extends TraceBaseParam implements Serializable {

    /**
     * 父id
     */
    private Long parentId;

    /**
     * 元数据code
     */
    private String infoCode;

    private Long categoryId;
}
