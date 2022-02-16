package com.study.pattern.Enum;

/**
 * ClassName: TraceSceneEnum
 * Description:
 * @Author: luohx
 * Date: 2022/2/15 上午10:20
 * History:
 * <author>          <time>          <version>          <desc>
 * luohx            修改时间           1.0
 */
public enum TraceSceneEnum {

    /**
     * 原材料环节
     */
    TRACE_SCENE_RAW_MATERIAL("1", "原材料环节"),
    /**
     * 生产环节
     */
    TRACE_SCENE_PRODUCE("2", "生产环节"),
    /**
     * 质检环节
     */
    TRACE_SCENE_QUALITY("3", "质检环节"),
    /**
     * 包装环节
     */
    TRACE_SCENE_PACK("4", "包装环节");

    private String code;

    private String name;

    TraceSceneEnum(String code, String name) {
        this.code = code;
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return this.code + ":" + this.name;
    }

    /**
     * 通过code获取enum
     *
     * @param code
     * @return
     */
    public static TraceSceneEnum getByCode(String code) {
        for (TraceSceneEnum scene : values()) {
            if (scene.getCode().equals(code)) {
                return scene;
            }
        }
        return null;
    }

    /**
     * 通过code获取enum
     *
     * @param code
     * @return
     */
    public static String getNameByCode(String code) {
        for (TraceSceneEnum scene : values()) {
            if (scene.getCode().equals(code)) {
                return scene.getName();
            }
        }
        return null;
    }

    /**
     * 获取所有场景数组
     *
     * @return
     */
    public static TraceSceneEnum[] findAll() {
        return values();
    }
}
