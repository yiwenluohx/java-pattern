package com.study.pattern.handler;

import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.study.pattern.model.dto.CategoryResDto;

import java.util.List;
import java.util.Map;

/**
 * ClassName: CategoryHandlerTestData
 * Description:
 * @Author: luohx
 * Date: 2022/2/15 下午3:02
 * History:
 * <author>          <time>          <version>          <desc>
 * luohx            修改时间           1.0
 */
public class CategoryHandlerTestData {

    public static final Map<Long, List<CategoryResDto>> CATEGORY_MAP = Maps.newHashMap();

    static {
        // 初始化
        /** mock 测数据 */
        CATEGORY_MAP.put(0L, Lists.newArrayList(
                new CategoryResDto(1L, "C-1", "1", "C-1"),
                new CategoryResDto(2L, "C-2", "2", "C-2")

        ));
        /** mock 测数据 */
        CATEGORY_MAP.put(1L, Lists.newArrayList(
                new CategoryResDto(3L, "C-3", "1>3", "C-1>C-3"),
                new CategoryResDto(4L, "C-4", "1>4", "C-1>C-4")
        ));
        /** mock 测数据 */
        CATEGORY_MAP.put(2L, Lists.newArrayList(
                new CategoryResDto(5L, "C-5", "2>5", "C-2>C-5"),
                new CategoryResDto(6L, "C-6", "2>6", "C-2>C-6")
        ));
        /** mock 测数据 */
        CATEGORY_MAP.put(3L, Lists.newArrayList(
                new CategoryResDto(7L, "C-7", "1>3>7", "C-1>C-3>C-7")
        ));
        /** mock 测数据 */
        CATEGORY_MAP.put(4L, Lists.newArrayList(
                new CategoryResDto(8L, "C-8", "1>4>8", "C-1>C-3>C-8")
        ));
        /** mock 测数据 */
        CATEGORY_MAP.put(5L, Lists.newArrayList(
                new CategoryResDto(9L, "C-9", "2>5>9", "C-2>C-5>C-9")
        ));
        /** mock 测数据 */
        CATEGORY_MAP.put(6L, Lists.newArrayList(
                new CategoryResDto(10L, "C-10", "2>6>10", "C-2>C-6>C-10")
        ));
        /** mock 测数据 */
        CATEGORY_MAP.put(7L, Lists.newArrayList(
                new CategoryResDto(11L, "C-11", "1>3>7>11", "C-1>C-3>C-7>C-11")
        ));
        /** mock 测数据 */
        CATEGORY_MAP.put(8L, Lists.newArrayList(
                new CategoryResDto(12L, "C-12", "1>4>8>12", "C-1>C-3>C-8>C-12")
        ));
        /** mock 测数据 */
        CATEGORY_MAP.put(9L, Lists.newArrayList(
                new CategoryResDto(13L, "C-13", "2>5>9>13", "C-2>C-5>C-9>C-13")
        ));
        /** mock 测数据 */
        CATEGORY_MAP.put(10L, Lists.newArrayList(
                new CategoryResDto(14L, "C-14", "2>6>10>14", "C-2>C-6>C-10>C-14")
        ));

    }
}