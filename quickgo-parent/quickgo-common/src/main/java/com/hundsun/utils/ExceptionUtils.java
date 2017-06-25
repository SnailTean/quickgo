package com.hundsun.utils;

import com.hundsun.dto.ErrorMessage;

public class ExceptionUtils
{
    public static ErrorMessage getErrorMessageInfo(String errorCode){
        String message = PropertiesUtils.getProperties(errorCode);
        
        return new ErrorMessage(errorCode, message);
        
    }
}
