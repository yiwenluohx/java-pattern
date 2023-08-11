package com.study.pattern.imitateService;

import com.study.pattern.model.dto.msg.BrainCheckMessage;
import com.study.pattern.model.dto.msg.IotCheckDataMsg;
import com.study.pattern.model.dto.msg.ProductionBatchDataMsg;

/**
 * 任务接口
 *
 * @author luohx
 * @version 1.0.0
 * @date: 2023/8/10 下午5:31
 * @menu 任务接口
 */
public interface EventTaskService {

    /**
     * 创建任务
     *
     * @param msg 消息
     */
    void createTask(IotCheckDataMsg msg);

    /**
     * 重试任务
     *
     * @param msg 消息
     */
    void repairTask(BrainCheckMessage msg);

    /**
     * 创建非报文任务
     *
     * @param batchMsg 生产计划检测消息
     * @date
     */
    void createNotIotTask(ProductionBatchDataMsg batchMsg);
}
