package com.study.pattern.Enum;

import com.google.common.collect.Lists;

import java.util.Arrays;
import java.util.List;

/**
 * @author luohx
 * @version 1.0.0
 * @date: 2023/8/11 上午11:25
 * @menu
 */
public enum CheckKeyTypeEnum {

    ENN_CODE("enn_code", "单品", "ennCodeTaskService"),
    SCHEDULE_BATCH_NUMBER("schedule_batch_number", "生产批次", "batchNoTaskService"),
    RAW_MATERIAL_BATCHNO("raw_material_batchno", "原材料", "rawMaterialService"),

    SN_CODE("sn", "单件", "snTaskService"),

    NOT_IOT_PRODUCTION_BATCH("production_batch", "单件", "productionBatchNoTaskService"),

    OPERATE_BODY("operate", "运营报文", "operateBodyTaskService"),

    OPERATE_ENN_CODE("operate_enn_code", "运营反查", "operateEnnCodeTaskService"),

    OPERATE_ORDER_F("enn_code_iotid_f", "工报运营订单数据", "operateOrderTaskService"),

    OPERATE_ORDER_H("enn_code_iotid_h", "家报运营订单数据", "operateOrderTaskService"),

    OPERATE_PE_WELDER_ENN_CODE("operate_pe_welder_enn_code", "PE管运营数据", "operateOrderTaskService"),


    //FUMA("fuma", "符码", "ennCodeTaskService"),
    ;

    private String code;
    private String desc;
    private String doServiceName;

    CheckKeyTypeEnum(String code, String desc, String doServiceName) {
        this.code = code;
        this.desc = desc;
        this.doServiceName = doServiceName;
    }

    public String getCode() {
        return code;
    }

    public String getDoServiceName() {
        return doServiceName;
    }

    public static CheckKeyTypeEnum ofCode(String code) {
        for (CheckKeyTypeEnum typeEnum : values()) {
            if (typeEnum.getCode().equals(code)) {
                return typeEnum;
            }
        }
        return null;
    }



    public static List<String> operateList = Lists.newArrayList(OPERATE_BODY.code, OPERATE_ENN_CODE.code, OPERATE_ORDER_F.code, OPERATE_ORDER_H.code,OPERATE_PE_WELDER_ENN_CODE.code);


    public static List<String> ennCodeList = Lists.newArrayList(ENN_CODE.code, OPERATE_BODY.code, OPERATE_ENN_CODE.code, OPERATE_ORDER_F.code,OPERATE_ORDER_H.code,OPERATE_PE_WELDER_ENN_CODE.code);

    public static boolean isOperate(String code) {
        return operateList.contains(code);
    }


    public static String parseCode(String code){
        CheckKeyTypeEnum typeEnum = Arrays.stream(values()).filter(x->x.getCode().equals(code)).findAny().orElse(null);
        return typeEnum == null ? "" : typeEnum.desc;
    }
}
