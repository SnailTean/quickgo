package com.hundsun.dto;

public class ErrorMessage extends Message
{

   
    private static final long serialVersionUID = -1099700192429067584L;

    String errorCode;
    
    String message;

    
    
    public ErrorMessage(String errorCode, String message)
    {
        this.errorCode = errorCode;
        this.message = message;
    }

    public String getErrorCode()
    {
        return errorCode;
    }

    public void setErrorCode(String errorCode)
    {
        this.errorCode = errorCode;
    }

    public String getMessage()
    {
        return message;
    }

    public void setMessage(String message)
    {
        this.message = message;
    }
    
    
}
