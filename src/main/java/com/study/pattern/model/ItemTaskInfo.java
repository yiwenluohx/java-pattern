package com.study.pattern.model;

import com.google.common.collect.Sets;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * @author luohx
 * @version 1.0.0
 * @date: 2023/8/11 上午11:27
 * @menu
 */
public class ItemTaskInfo {
    private Map<String,String> taskExt;
    private Throwable throwable;
    private List<Long> deleteTaskIds;
    private Set<String> recheckCodeUpdateLatest = Sets.newHashSet();

    /**
     * Gets the value of taskExt.
     *
     * @return the value of taskExt
     */
    public Map<String, String> getTaskExt() {
        return taskExt;
    }

    /**
     * Sets the taskExt. *
     * <p>You can use getTaskExt() to get the value of taskExt</p>
     * * @param taskExt taskExt
     */
    public void setTaskExt(Map<String, String> taskExt) {
        this.taskExt = taskExt;
    }

    /**
     * Gets the value of throwable.
     *
     * @return the value of throwable
     */
    public Throwable getThrowable() {
        return throwable;
    }

    /**
     * Sets the throwable. *
     * <p>You can use getThrowable() to get the value of throwable</p>
     * * @param throwable throwable
     */
    public void setThrowable(Throwable throwable) {
        this.throwable = throwable;
    }

    /**
     * Gets the value of deleteTaskIds.
     *
     * @return the value of deleteTaskIds
     */
    public List<Long> getDeleteTaskIds() {
        return deleteTaskIds;
    }

    /**
     * Sets the deleteTaskIds. *
     * <p>You can use getDeleteTaskIds() to get the value of deleteTaskIds</p>
     * * @param deleteTaskIds deleteTaskIds
     */
    public void setDeleteTaskIds(List<Long> deleteTaskIds) {
        this.deleteTaskIds = deleteTaskIds;
    }

    /**
     * Gets the value of recheckCodeUpdateLatest.
     *
     * @return the value of recheckCodeUpdateLatest
     */
    public Set<String> getRecheckCodeUpdateLatest() {
        return recheckCodeUpdateLatest;
    }

    /**
     * Sets the recheckCodeUpdateLatest. *
     * <p>You can use getRecheckCodeUpdateLatest() to get the value of recheckCodeUpdateLatest</p>
     * * @param recheckCodeUpdateLatest recheckCodeUpdateLatest
     */
    public void setRecheckCodeUpdateLatest(Set<String> recheckCodeUpdateLatest) {
        this.recheckCodeUpdateLatest = recheckCodeUpdateLatest;
    }
}
