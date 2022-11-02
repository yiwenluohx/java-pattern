package com.study.pattern;

import com.alibaba.fastjson.JSON;
import com.study.pattern.service.state01.ActivityService;
import com.study.pattern.service.state01.Result;
import com.study.pattern.service.state01.Status;
import com.study.pattern.service.state02.IState;
import com.study.pattern.service.state02.State;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Map;

/**
 * @author luohx
 * @version 1.0.0
 * @date: 2022/11/2 下午2:30
 * @menu
 */
@SpringBootTest
public class ApiTest {

    private Logger logger = LoggerFactory.getLogger(ApiTest.class);

    @Autowired
    private Map<String, IState> stateMap;

    @Test
    public void test_Editing2Arraignment() {
        String activityId = "100001";
        ActivityService.init(activityId, Status.Editing);

        Result result = stateMap.get("editingState").arraignment(activityId, Status.Editing);

        logger.info("测试结果(编辑中To提审活动)：{}", JSON.toJSONString(result));
        logger.info("活动信息：{} 状态：{}", JSON.toJSONString(ActivityService.queryActivityInfo(activityId)), JSON.toJSONString(ActivityService.queryActivityInfo(activityId).getStatus()));
    }

    @Test
    public void test_Editing2Open() {
        String activityId = "100001";
        ActivityService.init(activityId, Status.Editing);

        Result result = stateMap.get("editingState").open(activityId, Status.Editing);
        logger.info("测试结果(编辑中To开启活动)：{}", JSON.toJSONString(result));
        logger.info("活动信息：{} 状态：{}", JSON.toJSONString(ActivityService.queryActivityInfo(activityId)), JSON.toJSONString(ActivityService.queryActivityInfo(activityId).getStatus()));
    }

    @Test
    public void test_Refuse2Doing() {
        String activityId = "100001";
        ActivityService.init(activityId, Status.Refuse);

        Result result = stateMap.get("refuseState").doing(activityId, Status.Refuse);

        logger.info("测试结果(拒绝To活动中)：{}", JSON.toJSONString(result));
        logger.info("活动信息：{} 状态：{}", JSON.toJSONString(ActivityService.queryActivityInfo(activityId)), JSON.toJSONString(ActivityService.queryActivityInfo(activityId).getStatus()));
    }

    @Test
    public void test_Refuse2Revoke() {
        String activityId = "100001";
        ActivityService.init(activityId, Status.Refuse);
        Result result = stateMap.get("refuseState").checkRevoke(activityId, Status.Refuse);

        logger.info("测试结果(拒绝To撤审)：{}", JSON.toJSONString(result));
        logger.info("活动信息：{} 状态：{}", JSON.toJSONString(ActivityService.queryActivityInfo(activityId)), JSON.toJSONString(ActivityService.queryActivityInfo(activityId).getStatus()));
    }
}
