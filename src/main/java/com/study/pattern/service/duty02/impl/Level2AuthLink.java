package com.study.pattern.service.duty02.impl;

import com.study.pattern.model.AuthInfo;
import com.study.pattern.service.duty01.AuthService;
import com.study.pattern.service.duty02.AuthLink;

import java.text.ParseException;
import java.util.Date;

/**
 * 二级负责人
 *
 * @author luohx
 * @version 1.0.0
 * @date: 2022/11/4 下午4:03
 * @menu 二级负责人
 */
public class Level2AuthLink extends AuthLink {

    private Date beginDate = f.parse("2022-11-05 00:00:00");
    private Date endDate = f.parse("2022-11-15 23:59:59");

    public Level2AuthLink(String levelUserId, String levelUserName) throws ParseException {
        super(levelUserId, levelUserName);
    }

    @Override
    public AuthInfo doAuth(String uId, String orderId, Date authDate) {
        Date date = AuthService.queryAuthInfo(levelUserId, orderId);
        if (null == date) {
            return new AuthInfo("0001", "单号：", orderId, " 状态：待二级审批负责人 ", levelUserName);
        }
        AuthLink next = super.next();
        if (null == next) {
            return new AuthInfo("0000", "单号：", orderId, " 状态：二级审批完成负责人", " 时间：", f.format(date), " 审批人：", levelUserName);
        }
        if (authDate.before(beginDate) || authDate.after(endDate)) {
            return new AuthInfo("0000", "单号：", orderId, " 状态：二级审批完成负责人", " 时间：", f.format(date), " 审批人：", levelUserName);
        }
        return next.doAuth(uId, orderId, authDate);
    }
}
