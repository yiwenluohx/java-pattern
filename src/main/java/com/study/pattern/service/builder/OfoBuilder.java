package com.study.pattern.service.builder;

/**
 * 构建ofo单车
 *
 * @author luohx
 * @version 1.0.0
 * @date: 2023/8/9 下午6:34
 * @menu 构建ofo单车
 */
public class OfoBuilder extends Builder {

    @Override
    public void buildFrame() {
        mBike.setFrame("碳纤维车架");
    }

    @Override
    public void buildSeat() {
        mBike.setSeat("橡胶车座");
    }

    @Override
    public Bike createBike() {
        return mBike;
    }
}
