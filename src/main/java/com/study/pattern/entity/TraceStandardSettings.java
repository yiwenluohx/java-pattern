package com.study.pattern.entity;

import lombok.Data;

import java.time.LocalDateTime;
import java.util.Date;

/**
 * ClassName: TraceStandardSettings
 * Description:
 *
 * @Author: luohx
 * Date: 2022/2/14 下午5:43
 * History:
 * <author>          <time>          <version>          <desc>
 * luohx            修改时间           1.0
 */
@Data
public class TraceStandardSettings {

    private Long traceStandardSettingsId;

    /**
     * 根ID(配置追溯场景id)
     */
    private Long rootId;

    /**
     * 节点Code
     */
    private Long pid;

    /**
     * 1-追溯场景 2-元数据分类 3-元数据
     */
    private Integer level;

    /**
     * 节点Code
     */
    private String nodeCode;

    /**
     * 节点名称
     */
    private String nodeName;

    /**
     * level=3时有效
     */
    private String metadataUicode;

    /**
     * level=3时有效 0-非必填，1-必填
     */
    private Integer requireFlag;

    /**
     * level=3时有效 限制类型 1-公共，2-类目
     */
    private Integer limitType;

    /**
     * level=3&&limit_type=2时有效 类目id
     */
    private Long categoryId;

    /**
     * 删除标志：0：未删除，1：已删除
     */
    private Integer deleteFlag;

    /**
     * 创建人ID
     */
    private Long createByUserId;

    /**
     * 创建人企业ID
     */
    private Long createByEnterpriseId;

    /**
     * create_time
     */
    private Date createTime;

    /**
     * 更新人ID
     */
    private Long updateByUserId;

    /**
     * 更新人企业ID
     */
    private Long updateByEnterpriseId;

    /**
     * update_time
     */
    private Date updateTime;

}
