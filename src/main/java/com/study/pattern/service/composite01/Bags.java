package com.study.pattern.service.composite01;

import java.util.ArrayList;

/**
 * ClassName: Bags
 * Description: 树枝构件：袋子
 *
 * @Author: luohx
 * Date: 2022/2/11 下午5:01
 * History:
 * <author>          <time>          <version>          <desc>
 * luohx            修改时间           1.0           树枝构件：袋子
 */
public class Bags implements Articles {
    /**
     * 名字
     */
    private String name;
    private ArrayList<Articles> bags = new ArrayList<Articles>();

    public Bags(String name) {
        this.name = name;
    }

    public void add(Articles c) {
        bags.add(c);
    }

    public void remove(Articles c) {
        bags.remove(c);
    }

    public Articles getChild(int i) {
        return bags.get(i);
    }

    @Override
    public float calculation() {
        float s = 0;
        for (Object obj : bags) {
            s += ((Articles) obj).calculation();
        }
        return s;
    }

    @Override
    public void show() {
        for (Object obj : bags) {
            ((Articles) obj).show();
        }
    }
}
