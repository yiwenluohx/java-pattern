package com.study.pattern.service.builder;

/**
 * 抽象建造类
 *
 * @author luohx
 * @version 1.0.0
 * @date: 2023/8/9 下午6:09
 * @menu 抽象建造类
 */
public abstract class Builder {

    protected Bike mBike = new Bike();

    /**
     * 构建车架
     */
    public abstract void buildFrame();

    /**
     * 构建车座
     */
    public abstract void buildSeat();

    /**
     * 创建车
     *
     * @return
     */
    public abstract Bike createBike();


}
