package com.study.pattern.service.builder;

/**
 * 指挥者类
 *
 * @author luohx
 * @version 1.0.0
 * @date: 2023/8/9 下午6:39
 * @menu 指挥者类
 */
public class Director {
    private Builder mBuilder;

    public Director(Builder builder) {
        mBuilder = builder;
    }

    public Bike construct() {
        mBuilder.buildFrame();
        mBuilder.buildSeat();
        return mBuilder.createBike();
    }
}
