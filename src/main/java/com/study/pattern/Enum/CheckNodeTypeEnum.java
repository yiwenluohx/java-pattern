package com.study.pattern.Enum;

/**
 * @author luohx
 * @version 1.0.0
 * @date: 2023/8/11 下午1:45
 * @menu
 */
public enum CheckNodeTypeEnum {
    NON(-1, "质检项没继承的时候或者场景"),
    ENN_CODE(0, "成品(供应商)"),
    HALF(1, "半成品(供应商)"),
    OPERATE(2, "运营"),
    ;
    private int code;

    private String desc;

    CheckNodeTypeEnum(int code, String desc) {
        this.code = code;
        this.desc = desc;
    }

    public int getCode() {
        return code;
    }


    public String getDesc() {
        return desc;
    }

}
