package com.study.pattern.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * ClassName: LotteryResult
 * Description: 摇号结果
 *
 * @Author: luohx
 * Date: 2022/2/21 上午9:47
 * History:
 * <author>          <time>          <version>          <desc>
 * luohx            修改时间           1.0           摇号结果
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class LotteryResult {
    /**
     * 用户ID
     */
    private String uId;

    /**
     * 摇号信息
     */
    private String msg;

    /**
     * 业务时间
     */
    private Date dateTime;
}
