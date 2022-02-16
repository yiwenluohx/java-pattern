package com.study.pattern.model;

import lombok.Data;

import java.io.Serializable;

/**
 * ClassName: CategoryVo
 * Description:
 * Author: luohx
 * Date: 2022/2/15 上午10:22
 * History:
 * <author>          <time>          <version>          <desc>
 * luohx            修改时间           1.0
 */
@Data
public class CategoryVo implements Serializable {

    /**
     * 类目id
     */
    private Long categoryId;

    /**
     * 类目名称
     */
    private String categoryName;
}
