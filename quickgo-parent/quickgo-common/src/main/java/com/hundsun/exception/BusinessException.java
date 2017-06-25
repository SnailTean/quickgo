package com.hundsun.exception;

import com.hundsun.utils.ExceptionUtils;

public class BusinessException extends BaseException
{
    private static final long serialVersionUID = 7300970844317829909L;

    public BusinessException(String errorCode)
    {
       super(ExceptionUtils.getErrorMessageInfo(errorCode));
    }


}
