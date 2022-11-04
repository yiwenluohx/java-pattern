package com.study.pattern.model;

/**
 * @author luohx
 * @version 1.0.0
 * @date: 2022/11/4 下午1:39
 * @menu
 */
public class AuthInfo {
    private String code;
    private String info = "";

    public AuthInfo(String code, String... infos) {
        this.code = code;
        for (String str : infos) {
            this.info = this.info.concat(str);
        }
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
