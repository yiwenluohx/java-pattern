package com.study.pattern.entity;

import lombok.Data;

import java.time.LocalDateTime;

/**
 * ClassName: TraceMetadata
 * Description:
 * @Author: luohx
 * Date: 2022/2/14 下午5:41
 * History:
 * <author>          <time>          <version>          <desc>
 * luohx            修改时间           1.0
 */
@Data
public class TraceMetadata {

    private Long traceMetadataId;

    private String metadataClassCode;

    private String metadataClassName;

    private String metadataName;

    private String metadataUicode;

    private Byte requireFlag;

    private String remark;

    private Byte deleteFlag;

    private LocalDateTime createTime;

    private LocalDateTime updateTime;

}
