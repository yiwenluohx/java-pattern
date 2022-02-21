package com.study.pattern.service.event;

import com.study.pattern.model.LotteryResult;
import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * ClassName: LotteryServiceImpl
 * Description:
 *
 * @Author: luohx
 * Date: 2022/2/21 上午10:49
 * History:
 * <author>          <time>          <version>          <desc>
 * luohx            修改时间           1.0
 */
@Component
public class LotteryServiceImpl extends LotteryService {

    @Override
    protected LotteryResult doDraw(String uId) {
        // 摇号
        String lottery = this.lottery(uId);
        // 结果
        return new LotteryResult(uId, lottery, new Date());
    }

    /**
     * 模拟摇号，但不是摇号算法
     *
     * @param uId 用户算法
     * @return 摇号结果
     */
    private String lottery(String uId) {
        return Math.abs(uId.hashCode()) % 2 == 0 ? "恭喜你，编码".concat(uId).concat("在本次摇号中签") : "很遗憾，编码".concat(uId).concat("在本次摇号未中签或摇号资格已过期");
    }
}
