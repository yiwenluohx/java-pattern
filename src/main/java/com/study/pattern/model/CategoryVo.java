package com.study.pattern.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

import java.io.Serializable;

/**
 * ClassName: CategoryVo
 * Description:
 * @Author: luohx
 * Date: 2022/2/15 上午10:22
 * History:
 * <author>          <time>          <version>          <desc>
 * luohx            修改时间           1.0
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
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
