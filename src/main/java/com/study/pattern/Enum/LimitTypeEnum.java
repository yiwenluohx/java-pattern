package com.study.pattern.Enum;

/**
 * ClassName: LimitTypeEnum
 * Description:
 * Author: luohx
 * Date: 2022/2/15 上午11:01
 * History:
 * <author>          <time>          <version>          <desc>
 * luohx            修改时间           1.0
 */
public enum LimitTypeEnum {
    /**
     * 公共
     */
    LIMIT_TYPE_PUBLIC(1, "公共"),

    /**
     * 类目
     */
    LIMIT_TYPE_CATEGORY(2, "类目");

    private Integer code;
    private String message;

    /**
     * 枚举构造方法
     *
     * @param code
     * @param message
     */
    LimitTypeEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    /**
     * 重新toString方法，默认的toString方法返回的就是枚举变量的名字，和name()方法返回值一样
     *
     * @return
     */
    @Override
    public String toString() {
        return this.code + ":" + this.message;
    }

    public Integer getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
