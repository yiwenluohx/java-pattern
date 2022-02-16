package com.study.pattern.service.composite01;

/**
 * ClassName: Articles
 * Description: 抽象构件：物品
 *
 * @Author: luohx
 * Date: 2022/2/11 下午4:57
 * History:
 * <author>          <time>          <version>          <desc>
 * luohx            修改时间           1.0           抽象构件：物品
 */
public interface Articles {

    /**
     * 计算
     *
     * @return
     */
    float calculation();

    /**
     * 展示物品（树形结构数据）
     */
    void show();
}
