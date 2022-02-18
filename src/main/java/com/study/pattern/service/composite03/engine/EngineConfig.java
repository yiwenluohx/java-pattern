package com.study.pattern.service.composite03.engine;

import com.study.pattern.service.composite03.logic.LogicFilter;
import com.study.pattern.service.composite03.logic.impl.UserAgeFilter;
import com.study.pattern.service.composite03.logic.impl.UserGenderFilter;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * ClassName: EngineConfig
 * Description: 决策节点配置
 * @Author: luohx
 * Date: 2022/2/17 下午5:43
 * History:
 * <author>          <time>          <version>          <desc>
 * luohx            修改时间           1.0               决策节点配置
 */
public class EngineConfig {
    static Map<String, LogicFilter> logicFilterMap;

    static {
        logicFilterMap = new ConcurrentHashMap<>();
        logicFilterMap.put("userAge", new UserAgeFilter());
        logicFilterMap.put("userGender", new UserGenderFilter());
    }

    public Map<String, LogicFilter> getLogicFilterMap() {
        return logicFilterMap;
    }

    public void setLogicFilterMap(Map<String, LogicFilter> logicFilterMap) {
        logicFilterMap = logicFilterMap;
    }
}
