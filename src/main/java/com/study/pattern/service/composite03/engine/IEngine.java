package com.study.pattern.service.composite03.engine;

import com.study.pattern.model.EngineResult;
import com.study.pattern.model.aggregates.TreeRich;

import java.util.Map;

/**
 * ClassName: IEngine
 * Description: 决策引擎
 * @Author: luohx
 * Date: 2022/2/17 下午5:58
 * History:
 * <author>          <time>          <version>          <desc>
 * luohx            修改时间           1.0           决策引擎
 */
public interface IEngine {
    EngineResult process(final Long treeId, final String userId, TreeRich treeRich, final Map<String, String> decisionMatter);

}
