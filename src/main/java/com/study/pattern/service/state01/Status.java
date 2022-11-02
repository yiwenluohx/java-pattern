package com.study.pattern.service.state01;

/**
 * 状态枚举
 *
 * @author luohx
 * @version 1.0.0
 * @date: 2022/10/31 下午3:48
 * @menu 状态枚举
 */
public enum Status {
    // 1创建编辑、2待审核、3审核通过(任务扫描成活动中)、4审核拒绝(可以撤审到编辑状态)、5活动中、6活动关闭、7活动开启(任务扫描成活动中)
    Editing, Check, Pass, Refuse, Doing, Close, Open
}
