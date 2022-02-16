package com.study.pattern.model.param;

import com.sun.istack.internal.NotNull;
import lombok.Data;

import java.io.Serializable;

/**
 * ClassName: TraceBaseParam
 * Description:
 * Author: luohx
 * Date: 2022/2/15 上午10:33
 * History:
 * <author>          <time>          <version>          <desc>
 * luohx            修改时间           1.0
 */
@Data
public class TraceBaseParam implements Serializable {

    /**
     * 设置id
     */
    private Long settingsId;

    /**
     * 版本号
     */
    private Long version;

    /**
     * 企业id
     */
    private Long enterpriseId;
}
