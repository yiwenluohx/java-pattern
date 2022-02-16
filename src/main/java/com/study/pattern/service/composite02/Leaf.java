package com.study.pattern.service.composite02;

import com.study.pattern.model.TraceTreeVo;
import com.study.pattern.model.param.NodeParam;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * ClassName: Leaf
 * Description: 叶子结点
 * @Author: luohx
 * Date: 2022/2/16 下午2:43
 * History:
 * <author>          <time>          <version>          <desc>
 * luohx            修改时间           1.0           叶子结点
 */
public class Leaf implements Nodes{

    @Override
    public List<TraceTreeVo> getTraceTree(Long id) {
        return null;
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
    public Integer update(NodeParam param, Long userId) {

        return 1;
    }

    @Override
    public Integer NodeDelete(Long nodeId, Long enterpriseId, Long userId, Long version) {
        return null;
    }
}
