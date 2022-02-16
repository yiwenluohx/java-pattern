package com.study.pattern.Enum;

/**
 * ClassName: YesOrNo
 * Description:
 * Author: luohx
 * Date: 2022/2/15 上午10:59
 * History:
 * <author>          <time>          <version>          <desc>
 * luohx            修改时间           1.0
 */
public enum YesOrNo {

    _0(0, "否"),
    _1(1, "是");

    private Integer num;

    private String desc;

    YesOrNo(Integer num, String desc) {
        this.num = num;
        this.desc = desc;
    }

    public Integer getNum() {
        return num;
    }

    public String getDesc() {
        return desc;
    }

    /**
     * 取反
     *
     * @return
     */
    public YesOrNo reverse() {
        return YesOrNo._1.equals(this) ? YesOrNo._0 : YesOrNo._1;
    }

    public static YesOrNo getByNum(int num) {
        return YesOrNo._0.getNum() == num ? YesOrNo._0 : YesOrNo._1;
    }

    public static String releaseName(Integer num) {
        if (num == null) throw new UnsupportedOperationException(String.format("[%s]类型转换失败", "releaseName"));
        return YesOrNo._0.num.equals(num) ? "未发布" : "已发布";
    }

    public static String enableName(Integer num) {
        if (num == null) throw new UnsupportedOperationException(String.format("[%s]类型转换失败", "enableName"));
        return YesOrNo._0.num.equals(num) ? "未启用" : "已启用";
    }

    public static boolean isYes(Integer num) {
        return YesOrNo._1.getNum().equals(num);
    }

    public static boolean isYes(YesOrNo yn) {
        return YesOrNo._1.equals(yn);
    }

    public static boolean isNo(Integer num) {
        return YesOrNo._0.getNum().equals(num);
    }

    public static boolean isNo(YesOrNo yn) {
        return YesOrNo._0.equals(yn);
    }
}