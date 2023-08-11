package com.study.pattern.imitateService.impl.enncode;

import com.study.pattern.Enum.CheckNodeTypeEnum;
import com.study.pattern.imitateService.impl.AbstractTaskService;
import com.study.pattern.imitateService.impl.DoRuleContext;
import com.study.pattern.model.ConfigInfo;
import com.study.pattern.model.ItemExecuteRuleDetail;
import com.study.pattern.model.ItemTaskInfo;
import com.study.pattern.model.dto.msg.DataMsg;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author luohx
 * @version 1.0.0
 * @date: 2023/8/11 下午3:23
 * @menu
 */
@Service
public class EnnCodeTaskService extends AbstractTaskService {

    @Override
    protected ConfigInfo getItemRuleConfig(DataMsg iotCheckDataMsg) {
        return null;
    }

    @Override
    protected ItemTaskInfo build(ConfigInfo config, DoRuleContext doRuleContext, List<ItemExecuteRuleDetail> details) {
        return null;
    }

    @Override
    protected CheckNodeTypeEnum getCheckNodeTypeEnumService() {
        return null;
    }
}
