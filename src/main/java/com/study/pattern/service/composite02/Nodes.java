package com.study.pattern.service.composite02;

import com.study.pattern.model.TraceTreeVo;
import com.study.pattern.model.param.NodeParam;

import java.util.List;

/**
 * ClassName: Nodes
 * Description: 抽象构件：节点
 *
 * @Author: luohx
 * Date: 2022/2/16 上午10:19
 * History:
 * <author>          <time>          <version>          <desc>
 * luohx            修改时间           1.0           抽象构件：节点
 */
public interface Nodes {

    /**
     * 获取追溯树
     *
     * @param id
     * @return
     */
    List<TraceTreeVo> getTraceTree(Long id);

    /**
     * 更新节点
     * @param param
     * @param userId
     * @return
     */
    Integer update(NodeParam param, Long userId);

    /**
     * 删除节点
     * @param nodeId
     * @param enterpriseId
     * @param userId
     * @param version
     * @return
     */
    Integer NodeDelete(Long nodeId, Long enterpriseId, Long userId, Long version);
}
