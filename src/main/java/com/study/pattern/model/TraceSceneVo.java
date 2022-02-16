package com.study.pattern.model;

import lombok.Data;

import java.io.Serializable;

/**
 * ClassName: TraceSceneVo
 * Description:
 *
 * @Author: luohx
 * Date: 2022/2/15 上午10:24
 * History:
 * <author>          <time>          <version>          <desc>
 * luohx            修改时间           1.0
 */
@Data
public class TraceSceneVo implements Serializable {

    /**
     * 场景code
     */
    private Integer sceneCode;

    /**
     * 场景名称
     */
    private String sceneName;
}
