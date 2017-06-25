package com.hundsun.exception;

import com.hundsun.dto.ErrorMessage;

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
