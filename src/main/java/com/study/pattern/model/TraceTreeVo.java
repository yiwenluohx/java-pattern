package com.study.pattern.model;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * ClassName: TraceTreeVo
 * Description:
 * @Author: luohx
 * Date: 2022/2/15 上午10:23
 * History:
 * <author>          <time>          <version>          <desc>
 * luohx            修改时间           1.0
 */
@Data
public class TraceTreeVo implements Serializable {

    /**
     * 节点id
     */
    private Long nodeId;

    /**
     * 节点code
     */
    private String nodeCode;

    /**
     * 节点名称
     */
    private String nodeName;

    /**
     * 子节点
     */
    private List<TraceTreeVo> childrenTree;
}
