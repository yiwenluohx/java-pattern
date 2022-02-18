package com.study.pattern.service.composite03.logic.impl;

import com.study.pattern.service.composite03.logic.BaseLogic;

import java.util.Map;

/**
 * ClassName: UserAgeFilter
 * Description:
 * @Author: luohx
 * Date: 2022/2/17 下午5:37
 * History:
 * <author>          <time>          <version>          <desc>
 * luohx            修改时间           1.0
 */
public class UserAgeFilter extends BaseLogic {

    @Override
    public String matterValue(Long treeId, String userId, Map<String, String> decisionMatter) {
        return decisionMatter.get("age");
    }
}
