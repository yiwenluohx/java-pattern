package com.study.pattern.service.builder;

/**
 * 自行车类
 *
 * @author luohx
 * @version 1.0.0
 * @date: 2023/8/9 下午5:54
 * @menu 自行车类
 */
public class Bike {

    /**
     * 车架
     */
    private String frame;

    /**
     * 车座
     */
    private String seat;

    /**
     * Gets the value of frame.
     *
     * @return the value of frame
     */
    public String getFrame() {
        return frame;
    }

    /**
     * Sets the frame. *
     * <p>You can use getFrame() to get the value of frame</p>
     * * @param frame frame
     */
    public void setFrame(String frame) {
        this.frame = frame;
    }

    /**
     * Gets the value of seat.
     *
     * @return the value of seat
     */
    public String getSeat() {
        return seat;
    }

    /**
     * Sets the seat. *
     * <p>You can use getSeat() to get the value of seat</p>
     * * @param seat seat
     */
    public void setSeat(String seat) {
        this.seat = seat;
    }
}
