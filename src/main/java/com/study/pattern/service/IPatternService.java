package com.study.pattern.service;

import com.study.pattern.model.LotteryResult;

/**
 * ClassName: IPatternService
 * Description:
 *
 * @Author: luohx
 * Date: 2022/1/17 下午5:07
 * History:
 * <author>          <time>          <version>          <desc>
 * luohx            修改时间           1.0
 */
public interface IPatternService {

    /**
     * 操作
     */
    void operate();

    /**
     * 组合模式
     *
     * @return
     */
    String composePattern();

    /**
     * 观察者模式
     *
     * @param uId
     * @return
     */
    LotteryResult observe(String uId);
}
