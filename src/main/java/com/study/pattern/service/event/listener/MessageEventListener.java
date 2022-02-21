package com.study.pattern.service.event.listener;

import com.study.pattern.model.LotteryResult;
import lombok.extern.slf4j.Slf4j;

/**
 * ClassName: MessageEventListener
 * Description:
 *
 * @Author: luohx
 * Date: 2022/2/21 上午10:03
 * History:
 * <author>          <time>          <version>          <desc>
 * luohx            修改时间           1.0
 */
@Slf4j
public class MessageEventListener implements EventListener<LotteryResult> {

    /**
     * 上面提到事件接口添加泛型，如果有需要那么在事件的实现中就可以按照不同的类型进行包装事件内容
     *
     * @param result
     */
    @Override
    public void doEvent(LotteryResult result) {
        log.info("给用户 {} 发送短信通知(短信)：{}", result.getUId(), result.getMsg());
    }
}
