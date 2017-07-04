package com.hundsun.exception;

import com.hundsun.dto.ErrorMessage;

/**
 * 
* @Description: 基础异常
* @author liuyang下午5:14:12BaseException.java
* @date 2017年6月26日 下午5:14:12
*
 */
public class BaseException extends Exception
{

   
    private static final long serialVersionUID = -4353172009583277202L;
    

    public BaseException(ErrorMessage message)
    {
        this(message, null);
    }


    public BaseException(ErrorMessage message, Throwable t)
    {
        super(message.getMessage(),t);
    }

   
    
    
    
    
}
