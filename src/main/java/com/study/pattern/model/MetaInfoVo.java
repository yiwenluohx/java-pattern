package com.study.pattern.model;

import lombok.Data;

import java.io.Serializable;

/**
 * ClassName: MetaInfoVo
 * Description: 元数据信息返回实体
 * @Author: luohx
 * Date: 2022/2/15 上午10:08
 * History:
 * <author>          <time>          <version>          <desc>
 * luohx            修改时间           1.0          元数据信息返回实体
 */
@Data
public class MetaInfoVo implements Serializable {

    /**
     * 元数据code
     */
    private String metaCode;

    /**
     * 元数据名称
     */
    private String metaName;

    /**
     * 元数据uicode
     */
    private String uiCode;
}
