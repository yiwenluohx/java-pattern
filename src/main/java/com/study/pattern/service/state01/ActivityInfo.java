package com.study.pattern.service.state01;

import java.util.Date;

/**
 * 基本活动信息
 * @author luohx
 * @version 1.0.0
 * @date: 2022/10/31 下午4:06
 * @menu
 */
public class ActivityInfo {

    /**
     * 活动ID
     */
    private String activityId;

    /**
     * 活动名称
     */
    private String activityName;

    /**
     * 活动状态
     */
    private Enum<Status> status;

    /**
     * 开始时间
     */
    private Date beginTime;

    /**
     * 结束时间
     */
    private Date endTime;

    /**
     * Gets the value of activityId.
     *
     * @return the value of activityId
     */
    public String getActivityId() {
        return activityId;
    }

    /**
     * Sets the activityId. *
     * <p>You can use getActivityId() to get the value of activityId</p>
     * * @param activityId activityId
     */
    public void setActivityId(String activityId) {
        this.activityId = activityId;
    }

    /**
     * Gets the value of activityName.
     *
     * @return the value of activityName
     */
    public String getActivityName() {
        return activityName;
    }

    /**
     * Sets the activityName. *
     * <p>You can use getActivityName() to get the value of activityName</p>
     * * @param activityName activityName
     */
    public void setActivityName(String activityName) {
        this.activityName = activityName;
    }

    /**
     * Gets the value of status.
     *
     * @return the value of status
     */
    public Enum<Status> getStatus() {
        return status;
    }

    /**
     * Sets the status. *
     * <p>You can use getStatus() to get the value of status</p>
     * * @param status status
     */
    public void setStatus(Enum<Status> status) {
        this.status = status;
    }

    /**
     * Gets the value of beginTime.
     *
     * @return the value of beginTime
     */
    public Date getBeginTime() {
        return beginTime;
    }

    /**
     * Sets the beginTime. *
     * <p>You can use getBeginTime() to get the value of beginTime</p>
     * * @param beginTime beginTime
     */
    public void setBeginTime(Date beginTime) {
        this.beginTime = beginTime;
    }

    /**
     * Gets the value of endTime.
     *
     * @return the value of endTime
     */
    public Date getEndTime() {
        return endTime;
    }

    /**
     * Sets the endTime. *
     * <p>You can use getEndTime() to get the value of endTime</p>
     * * @param endTime endTime
     */
    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }
}
