package com.study.pattern.service.state02.impl;

import com.study.pattern.service.state01.ActivityService;
import com.study.pattern.service.state01.Result;
import com.study.pattern.service.state01.Status;
import com.study.pattern.service.state02.State;
import org.springframework.stereotype.Service;

/**
 * 活动状态；审核通过
 *
 * @author luohx
 * @version 1.0.0
 * @date: 2022/11/2 上午11:46
 * @menu
 */
@Service(value = "passState")
public class PassState extends State {
    @Override
    public Result arraignment(String activityId, Enum<Status> currentStatus) {
        return new Result("0001", "已审核状态不可重复提审");
    }

    @Override
    public Result checkPass(String activityId, Enum<Status> currentStatus) {
        return new Result("0001", "已审核状态不可重复审核");
    }

    @Override
    public Result checkRefuse(String activityId, Enum<Status> currentStatus) {
        ActivityService.execStatus(activityId, currentStatus, Status.Refuse);
        return new Result("0000", "活动审核拒绝完成");
    }

    @Override
    public Result checkRevoke(String activityId, Enum<Status> currentStatus) {
        return new Result("0001", "审核通过不可撤销(可先拒绝审核)");
    }

    @Override
    public Result close(String activityId, Enum<Status> currentStatus) {
        ActivityService.execStatus(activityId, currentStatus, Status.Close);
        return new Result("0000", "活动审核关闭完成");
    }

    @Override
    public Result open(String activityId, Enum<Status> currentStatus) {
        return new Result("0001", "非关闭活动不可开启");
    }

    @Override
    public Result doing(String activityId, Enum<Status> currentStatus) {
        ActivityService.execStatus(activityId, currentStatus, Status.Doing);
        return new Result("0000", "活动变更活动中完成");
    }
}
