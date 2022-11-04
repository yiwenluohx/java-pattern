package com.study.pattern;

import com.alibaba.fastjson.JSON;
import com.study.pattern.service.duty01.AuthService;
import com.study.pattern.service.duty02.AuthLink;
import com.study.pattern.service.duty02.impl.Level1AuthLink;
import com.study.pattern.service.duty02.impl.Level2AuthLink;
import com.study.pattern.service.duty02.impl.Level3AuthLink;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

import java.text.ParseException;
import java.util.Date;

/**
 * 责任链模式测试
 *
 * @author luohx
 * @version 1.0.0
 * @date: 2022/11/4 下午4:29
 * @menu 责任链模式测试
 */
@SpringBootTest
public class DutyTest {

    private Logger logger = LoggerFactory.getLogger(DutyTest.class);

    @Test
    public void test_AuthLink() throws ParseException {
        AuthLink authLink = new Level3AuthLink("1000013", "王工")
                .appendNext(new Level2AuthLink("1000012", "张经理")
                        .appendNext(new Level1AuthLink("1000011", "段总")));

        logger.info("测试结果：{}", JSON.toJSONString(authLink.doAuth("小傅哥", "1000998004813441", new Date())));

        // 模拟三级负责人审批
        AuthService.auth("1000013", "1000998004813441");
        logger.info("测试结果：{}", "模拟三级负责人审批，王工");
        logger.info("测试结果：{}", JSON.toJSONString(authLink.doAuth("小傅哥", "1000998004813441", new Date())));

        // 模拟二级负责人审批
        AuthService.auth("1000012", "1000998004813441");
        logger.info("测试结果：{}", "模拟二级负责人审批，张经理");
        logger.info("测试结果：{}", JSON.toJSONString(authLink.doAuth("小傅哥", "1000998004813441", new Date())));

        // 模拟一级负责人审批
        AuthService.auth("1000011", "1000998004813441");
        logger.info("测试结果：{}", "模拟一级负责人审批，段总");
        logger.info("测试结果：{}", JSON.toJSONString(authLink.doAuth("小傅哥", "1000998004813441", new Date())));

    }
}
