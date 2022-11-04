package com.study.pattern.service.duty02;

import com.study.pattern.model.AuthInfo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 审核规定；
 * 1. 601-610 三级审批 + 二级审批
 * 2. 611-620 三级审批 + 二级审批 + 一级审批
 * 3. 其他时间 三级审批
 *
 * @author luohx
 * @version 1.0.0
 * @date: 2022/11/4 下午3:49
 * @menu
 */
public abstract class AuthLink {
    protected Logger logger = LoggerFactory.getLogger(AuthLink.class);

    /**
     * 时间格式化
     */
    protected SimpleDateFormat f = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

    /**
     * 级别人员ID
     */
    protected String levelUserId;

    /**
     * 级别人员姓名
     */
    protected String levelUserName;

    /**
     * 责任链
     */
    private AuthLink next;

    public AuthLink(String levelUserId, String levelUserName) {
        this.levelUserId = levelUserId;
        this.levelUserName = levelUserName;
    }

    public AuthLink next() {
        return next;
    }

    public AuthLink appendNext(AuthLink next) {
        this.next = next;
        return this;
    }

    /**
     * 具体审核处理
     *
     * @param uId
     * @param orderId
     * @param authDate
     * @return
     */
    public abstract AuthInfo doAuth(String uId, String orderId, Date authDate);
}
