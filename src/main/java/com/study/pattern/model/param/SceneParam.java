package com.study.pattern.model.param;

import lombok.Data;

import java.io.Serializable;

/**
 * ClassName: SceneParam
 * Description:
 * Author: luohx
 * Date: 2022/2/15 上午10:34
 * History:
 * <author>          <time>          <version>          <desc>
 * luohx            修改时间           1.0
 */
@Data
public class SceneParam extends TraceBaseParam implements Serializable {

    /**
     * 场景code
     */
    private String sceneCode;
}
