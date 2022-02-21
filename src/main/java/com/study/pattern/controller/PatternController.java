package com.study.pattern.controller;

import com.study.pattern.service.IPatternService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.websocket.server.PathParam;

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
}
