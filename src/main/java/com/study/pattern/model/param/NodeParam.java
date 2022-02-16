package com.study.pattern.model.param;

import lombok.Data;

import java.io.Serializable;

/**
 * ClassName: NodeParam
 * Description: 节点参数
 *
 * @Author: luohx
 * Date: 2022/2/16 下午2:56
 * History:
 * <author>          <time>          <version>          <desc>
 * luohx            修改时间           1.0           节点参数
 */
@Data
public class NodeParam extends TraceBaseParam implements Serializable {
    /**
     * 场景/分类/元数据code
     */
    private String code;

    /**
     * 分类/元数据-父id
     */
    private Long parentId;

    /**
     * 元数据-分类id
     */
    private Long categoryId;


}
