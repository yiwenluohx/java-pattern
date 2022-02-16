package com.study.pattern.Enum;

/**
 * ClassName: TraceLevelEnum
 * Description:
 * @Author: luohx
 * Date: 2022/2/15 上午10:56
 * History:
 * <author>          <time>          <version>          <desc>
 * luohx            修改时间           1.0
 */
public enum TraceLevelEnum {

    /**
     * 等级1-追溯场景
     */
    TRACE_SCENE_LEVEL(1, "追溯场景"),

    /**
     * 等级2-元数据分类
     */
    TRACE_CLASS_LEVEL(2, "元数据分类"),

    /**
     * 等级3-元数据
     */
    TRACE_METAINFO_LEVEL(3, "元数据");

    private Integer code;
    private String message;

    /**
     * 枚举构造方法
     *
     * @param code
     * @param message
     */
    TraceLevelEnum(Integer code, String message) {
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