package com.study.pattern.service.event.listener;

import com.study.pattern.model.LotteryResult;

/**
 * ClassName: EventListener
 * Description: 事件监听接口
 *
 * @Author: luohx
 * Date: 2022/2/21 上午10:06
 * History:
 * <author>          <time>          <version>          <desc>
 * luohx            修改时间           1.0           事件监听接口
 */
public interface EventListener {

    /**
     * 监听事件进行后续处理， 如果方法的入参信息类型是变化的可以使用泛型<T>
     *
     * @param result
     */
    void doEvent(LotteryResult result);
}
