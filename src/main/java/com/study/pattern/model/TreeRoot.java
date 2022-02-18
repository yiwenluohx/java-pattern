package com.study.pattern.model;

import lombok.Data;

/**
 * ClassName: TreeRoot
 * Description: 树根信息
 *
 * @Author: luohx
 * Date: 2022/2/16 下午6:04
 * History:
 * <author>          <time>          <version>          <desc>
 * luohx            修改时间           1.0              树根信息
 */
@Data
public class TreeRoot {
    private Long treeId;         //规则树ID
    private Long treeRootNodeId; //规则树根ID
    private String treeName;     //规则树名称
}
