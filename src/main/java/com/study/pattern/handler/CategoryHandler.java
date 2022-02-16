package com.study.pattern.handler;

import com.google.common.collect.Lists;
import com.study.pattern.model.dto.CategoryResDto;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * ClassName: CategoryHandler
 * Description:
 *
 * @Author: luohx
 * Date: 2022/2/15 下午2:27
 * History:
 * <author>          <time>          <version>          <desc>
 * luohx            修改时间           1.0
 */
@Component
public class CategoryHandler {
    /**
     * 获取平台类目
     * - 查询的为正常的状态的
     *
     * @param categoryId
     * @return
     */
    public CategoryResDto platformCategory(Long categoryId) {
        if (categoryId == null || categoryId < 1) return null;
        return this.platformCategoryListByIds(categoryId).get(0);
    }

    public List<CategoryResDto> platformCategoryListByIds(Long... categoryIds) {
        ArrayList<Long> ids = Lists.newArrayList(categoryIds);
        List<CategoryResDto> res = Lists.newArrayList();
        CategoryHandlerTestData.CATEGORY_MAP.forEach((k, v) -> res.addAll(v.stream().filter(f -> ids.contains(f.getCategoryId())).collect(Collectors.toList())));
        return res;
    }

    public List<CategoryResDto> platformCategoryList(Long parentId, Integer level) {
        return CategoryHandlerTestData.CATEGORY_MAP.get(parentId);
    }

}
