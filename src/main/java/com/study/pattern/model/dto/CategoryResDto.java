package com.study.pattern.model.dto;

import lombok.Data;

import java.io.Serializable;

/**
 * ClassName: CategoryResDto
 * Description:
 * @Author: luohx
 * Date: 2022/2/15 下午2:13
 * History:
 * <author>          <time>          <version>          <desc>
 * luohx            修改时间           1.0
 */
@Data
public class CategoryResDto implements Serializable {

    /**
     * 类目ID
     */
    private Long categoryId;
    /**
     * 类目名称
     */
    private String categoryName;
    /**
     * 类目ID路径，平台类目时有
     */
    private String categoryIdPath;
    /**
     * 类目名称路径，平台类目时有
     */
    private String categoryNamePath;

    public CategoryResDto(Long categoryId, String categoryName) {
        this.categoryId = categoryId;
        this.categoryName = categoryName;
    }

    public CategoryResDto(Long categoryId, String categoryName, String categoryIdPath, String categoryNamePath) {
        this.categoryId = categoryId;
        this.categoryName = categoryName;
        this.categoryIdPath = categoryIdPath;
        this.categoryNamePath = categoryNamePath;
    }

    public CategoryResDto() {
    }
}
