package com.study.pattern.controller;

import com.alibaba.fastjson.JSON;
import com.study.pattern.service.IPatternService;
import com.study.pattern.service.state01.ActivityService;
import com.study.pattern.service.state01.Result;
import com.study.pattern.service.state01.Status;
import com.study.pattern.service.state02.IState;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.websocket.server.PathParam;
import java.util.Map;

/**
 * ClassName: PatternController
 * Description: 模式控制器
 *
 * @Author: luohx
 * Date: 2022/1/17 下午5:06
 * History:
 * <author>          <time>          <version>          <desc>
 * luohx            修改时间           1.0           模式控制器
 */
@RestController
@RequestMapping("/pattern")
public class PatternController {

    @Autowired
    private IPatternService patternService;

    @Autowired
    private Map<String, IState> stateMap;

    private Logger logger = LoggerFactory.getLogger(PatternController.class);

    @RequestMapping("/build")
    public ResponseEntity buildPattern() {
        patternService.operate();
        return new ResponseEntity(HttpStatus.OK);
    }

    @RequestMapping("/compose")
    public ResponseEntity composePattern() {
        return new ResponseEntity(patternService.composePattern(), HttpStatus.OK);
    }

    @RequestMapping("/observe/{uId}")
    public ResponseEntity observePattern(@PathVariable("uId") String uId) {
        return new ResponseEntity(patternService.observe(uId), HttpStatus.OK);
    }

    @RequestMapping("/state")
    public ResponseEntity statePattern() {
        String activityId = "100001";
        ActivityService.init(activityId, Status.Editing);

        Result result = stateMap.get("editingState").arraignment(activityId, Status.Editing);

        logger.info("测试结果(编辑中To提审活动)：{}", JSON.toJSONString(result));
        logger.info("活动信息：{} 状态：{}", JSON.toJSONString(ActivityService.queryActivityInfo(activityId)), JSON.toJSONString(ActivityService.queryActivityInfo(activityId).getStatus()));
        return new ResponseEntity(patternService.composePattern(), HttpStatus.OK);
    }
}
