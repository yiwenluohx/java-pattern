package com.study.pattern.service.state01;

/**
 * 返回实体
 *
 * @author luohx
 * @version 1.0.0
 * @date: 2022/10/31 下午5:07
 * @menu 返回实体
 */
public class Result {

    /**
     * 编码
     */
    private String code;

    /**
     * 描述
     */
    private String info;

    public Result(String code, String info) {
        this.code = code;
        this.info = info;
    }

    /**
     * Gets the value of code.
     *
     * @return the value of code
     */
    public String getCode() {
        return code;
    }

    /**
     * Sets the code. *
     * <p>You can use getCode() to get the value of code</p>
     * * @param code code
     */
    public void setCode(String code) {
        this.code = code;
    }

    /**
     * Gets the value of info.
     *
     * @return the value of info
     */
    public String getInfo() {
        return info;
    }

    /**
     * Sets the info. *
     * <p>You can use getInfo() to get the value of info</p>
     * * @param info info
     */
    public void setInfo(String info) {
        this.info = info;
    }
}
