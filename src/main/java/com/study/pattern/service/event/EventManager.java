package com.study.pattern.service.event;

import com.google.common.collect.Lists;
import com.study.pattern.model.LotteryResult;
import com.study.pattern.service.event.listener.EventListener;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * ClassName: EventManager
 * Description: 事件注册管理
 * Author: luohx
 * Date: 2022/2/21 上午10:02
 * History:
 * <author>          <time>          <version>          <desc>
 * luohx            修改时间           1.0           事件注册管理
 */
public class EventManager {

    Map<Enum<EventType>, List<EventListener>> listeners = new HashMap<>();

    /**
     * 注册监听器
     *
     * @param operations
     */
    public EventManager(Enum<EventType>... operations) {
        for (Enum<EventType> operation : operations) {
            this.listeners.put(operation, Lists.newArrayList());
        }
    }

    public enum EventType {
        MQ, Message
    }

    /**
     * 订阅
     *
     * @param eventType 事件类型
     * @param listener  监听
     */
    public void subscribe(Enum<EventType> eventType, EventListener listener) {
        List<EventListener> users = listeners.get(eventType);
        users.add(listener);
    }

    /**
     * 取消订阅
     *
     * @param eventType 事件类型
     * @param listener  监听器
     */
    public void unsubscribe(Enum<EventType> eventType, EventListener listener) {
        List<EventListener> users = listeners.get(eventType);
        users.remove(listener);
    }

    /**
     * 通知
     *
     * @param eventType 事件类型
     * @param result    结果
     */
    public void notify(Enum<EventType> eventType, LotteryResult result) {
        List<EventListener> users = listeners.get(eventType);
        for (EventListener listener : users) {
            listener.doEvent(result);
        }
    }
}
