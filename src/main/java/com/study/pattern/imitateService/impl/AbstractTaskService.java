package com.study.pattern.imitateService.impl;

import com.study.pattern.Enum.CheckKeyTypeEnum;
import com.study.pattern.Enum.CheckNodeTypeEnum;
import com.study.pattern.model.ConfigInfo;
import com.study.pattern.model.ItemExecuteRuleDetail;
import com.study.pattern.model.ItemTaskInfo;
import com.study.pattern.model.ProductionProjectItemRuleBo;
import com.study.pattern.model.dto.msg.DataMsg;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * 抽象任务
 *
 * @author luohx
 * @version 1.0.0
 * @date: 2023/8/10 下午5:38
 * @menu 抽象任务
 */
public abstract class AbstractTaskService {

    protected final static Logger logger = LoggerFactory.getLogger(AbstractTaskService.class);

    /**
     * 获取实例规则配置
     *
     * @param iotCheckDataMsg 物联网消息数据
     * @return {@link ConfigInfo}
     */
    protected abstract ConfigInfo getItemRuleConfig(DataMsg iotCheckDataMsg);

    protected abstract ItemTaskInfo build(ConfigInfo config, DoRuleContext doRuleContext, List<ItemExecuteRuleDetail> details);

    /**
     * 每个子类对应的 各个场景环节
     *
     * @return
     */
    protected abstract CheckNodeTypeEnum getCheckNodeTypeEnumService();

    /**
     * 处理创建任务
     */
    protected void processTaskInfos(List<ItemTaskInfo> itemTaskInfos) {

    }

    /**
     * 创建任务主流程
     *
     * @param iotCheckDataMsg
     * @return
     */
    public List<ItemTaskInfo> createTask(DataMsg iotCheckDataMsg) {
        /******* 创建规则与数据信息 ***/
        ConfigInfo config = getItemRuleConfig(iotCheckDataMsg);
        /******* 创建任务 ***/
        List<ItemTaskInfo> task = createTask(config);
        /******* 任务后处理 ***/
        processTaskInfos(task);
        return task;
    }

    /**
     * 插入持久层逻辑
     */
    @Transactional
    public void intoDb(List<ItemTaskInfo> taskInfos, String intoDbDto, CheckKeyTypeEnum checkKeyTypeEnum) {

    }

    /**
     * 具体创建任务实现方法
     */
    protected final List<ItemTaskInfo> createTask(ConfigInfo config) {
        return null;
    }

    /**
     * 任务状态构建统一方法
     */
    protected void buildStatus(List<ItemExecuteRuleDetail> details) {
    }

    /**
     * 构建扩展信息结果方法
     */
    protected void buildExtInfo(ConfigInfo configInfo, Object task) {

    }

    /**
     * 构建ext信息
     *
     * @param configInfo 配置信息
     */
    protected void buildExtInfo(ConfigInfo configInfo) {

    }

    /**
     * 获取执行规则相关信息
     *
     * @param iotCheckDataMsg
     * @return
     */
    protected ConfigInfo getItemRuleConfig(DataMsg iotCheckDataMsg, Integer checkNodeType) {
        return null;
    }

    /**
     * 执行规则
     */
    protected ItemExecuteRuleDetail doRule(ProductionProjectItemRuleBo itemRule, DoRuleContext doRuleContext) {
        return null;
    }
}
