package com.study.pattern.imitateService.impl;

import com.study.pattern.Enum.CheckKeyTypeEnum;
import com.study.pattern.imitateService.EventTaskService;
import com.study.pattern.model.ItemTaskInfo;
import com.study.pattern.model.dto.msg.BrainCheckMessage;
import com.study.pattern.model.dto.msg.IotCheckDataMsg;
import com.study.pattern.model.dto.msg.ProductionBatchDataMsg;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Map;

/**
 * 任务实现
 *
 * @author luohx
 * @version 1.0.0
 * @date: 2023/8/10 下午5:35
 * @menu 任务实现
 */
public class EventTaskServiceImpl implements EventTaskService {

    @Autowired
    private Map<String, AbstractTaskService> absTaskServiceMap;

    @Override
    public void createTask(IotCheckDataMsg msg) {
        CheckKeyTypeEnum checkKeyTypeEnum = CheckKeyTypeEnum.ofCode(msg.getCheckKeyType());
        List<ItemTaskInfo> task = absTaskServiceMap.get(checkKeyTypeEnum.getDoServiceName()).createTask(msg);
        absTaskServiceMap.get(checkKeyTypeEnum.getDoServiceName()).intoDb(task, null, checkKeyTypeEnum);
    }

    @Override
    public void repairTask(BrainCheckMessage msg) {
        IotCheckDataMsg iotMsg = new IotCheckDataMsg();
        CheckKeyTypeEnum checkKeyTypeEnum = CheckKeyTypeEnum.ofCode(msg.getCheckKeyType());
        List<ItemTaskInfo> task = absTaskServiceMap.get(checkKeyTypeEnum.getDoServiceName()).createTask(iotMsg);
        absTaskServiceMap.get(checkKeyTypeEnum.getDoServiceName()).intoDb(task, null, checkKeyTypeEnum);
    }

    @Override
    public void createNotIotTask(ProductionBatchDataMsg batchMsg) {
        List<ItemTaskInfo> task = absTaskServiceMap.get(CheckKeyTypeEnum.NOT_IOT_PRODUCTION_BATCH.getDoServiceName()).createTask(batchMsg);
        absTaskServiceMap.get(CheckKeyTypeEnum.NOT_IOT_PRODUCTION_BATCH.getDoServiceName()).intoDb(task, null, CheckKeyTypeEnum.NOT_IOT_PRODUCTION_BATCH);
    }
}
