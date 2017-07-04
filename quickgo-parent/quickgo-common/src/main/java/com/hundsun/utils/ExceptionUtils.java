package com.hundsun.utils;

import com.hundsun.dto.ErrorMessage;

/**
 * 
* @Description: 异常工具类
* @author liuyang下午5:16:13ExceptionUtils.java
* @date 2017年6月26日 下午5:16:13
*
 */
public class ExceptionUtils
{
    public static ErrorMessage getErrorMessageInfo(String errorCode){
        String message = PropertiesUtils.getProperties(errorCode);
        
        return new ErrorMessage(errorCode, message);
        
    }
}
