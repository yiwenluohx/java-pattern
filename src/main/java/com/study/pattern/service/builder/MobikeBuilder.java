package com.study.pattern.service.builder;

/**
 * 构建摩拜单车
 *
 * @author luohx
 * @version 1.0.0
 * @date: 2023/8/9 下午6:30
 * @menu 构建摩拜单车
 */
public class MobikeBuilder extends Builder {

    @Override
    public void buildFrame() {
        mBike.setFrame("铝合金车架");
    }

    @Override
    public void buildSeat() {
        mBike.setSeat("真皮车座");
    }

    @Override
    public Bike createBike() {
        return mBike;
    }
}
