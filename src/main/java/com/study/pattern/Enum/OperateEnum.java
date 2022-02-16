package com.study.pattern.Enum;

/**
 * ClassName: OperateEnum
 * Description:
 * @Author: luohx
 * Date: 2022/2/15 上午11:00
 * History:
 * <author>          <time>          <version>          <desc>
 * luohx            修改时间           1.0
 */
public enum OperateEnum {
    /**
     * 添加
     */
    OPERATE_INSERT(1, "添加"),

    /**
     * 更新
     */
    OPERATE_UPDATE(2, "更新"),

    /**
     * 删除
     */
    OPERATE_DELETE(3, "删除");

    private Integer code;
    private String message;

    /**
     * 枚举构造方法
     *
     * @param code
     * @param message
     */
    OperateEnum(Integer code, String message) {
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