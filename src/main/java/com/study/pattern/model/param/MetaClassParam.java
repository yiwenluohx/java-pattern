package com.study.pattern.model.param;

import lombok.Data;

import java.io.Serializable;

/**
 * ClassName: MetaClassParam
 * Description:
 * Author: luohx
 * Date: 2022/2/15 上午10:32
 * History:
 * <author>          <time>          <version>          <desc>
 * luohx            修改时间           1.0
 */
@Data
public class MetaClassParam extends TraceBaseParam implements Serializable {
    /**
     * 父id
     */
    private Long parentId;

    /**
     * 元数据分类code
     */
    private String classCode;
}
