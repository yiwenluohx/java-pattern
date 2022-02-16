package com.study.pattern.model;

import lombok.Data;

import java.io.Serializable;

/**
 * ClassName: MetaTypeVo
 * Description: 元数据类型返回实体
 * @Author: luohx
 * Date: 2022/2/15 上午10:06
 * History:
 * <author>          <time>          <version>          <desc>
 * luohx            修改时间           1.0           元数据类型返回实体
 */
@Data
public class MetaTypeVo implements Serializable {

    /**
     * 元数据类型code
     */
    private String classCode;

    /**
     * 元数据类型名称
     */
    private String className;
}
