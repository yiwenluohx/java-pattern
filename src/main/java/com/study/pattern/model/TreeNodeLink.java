package com.study.pattern.model;

import lombok.Data;

/**
 * ClassName: TreeNodeLink
 * Description: 树节点链接链路
 * @Author: luohx
 * Date: 2022/2/16 下午6:04
 * History:
 * <author>          <time>          <version>          <desc>
 * luohx            修改时间           1.0            树节点链接链路
 */
@Data
public class TreeNodeLink {
    private Long nodeIdFrom;        //节点From
    private Long nodeIdTo;          //节点To
    private Integer ruleLimitType;  //限定类型；1:=;2:>;3:<;4:>=;5<=;6:enum[枚举范围]
    private String ruleLimitValue;  //限定值
}
