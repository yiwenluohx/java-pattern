package com.study.pattern.service.duty01;

import java.util.Date;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * 模拟审核服务
 * 1. auth          审核流程
 * 2. queryAuthInfo 查询审核信息(时间)
 * 3. 把由谁审核的和审核的单子ID作为唯一key值记录到内存Map结构中
 *
 * @author luohx
 * @version 1.0.0
 * @date: 2022/11/4 上午10:24
 * @menu
 */
public class AuthService {

    private static Map<String, Date> authMap = new ConcurrentHashMap<String, Date>();

    /**
     * 查询审核结果
     * @param uId
     * @param orderId
     * @return
     */
    public static Date queryAuthInfo(String uId, String orderId) {
        return authMap.get(uId.concat(orderId));
    }

    /**
     * 处理审核
     * @param uId
     * @param orderId
     */
    public static void auth(String uId, String orderId) {
        //处理后，进行记录，方便验证是否已处理
        authMap.put(uId.concat(orderId), new Date());
    }
}
