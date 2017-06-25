package com.hundsun.exception;

import com.hundsun.utils.ExceptionUtils;

public class SystemException extends BaseException
{

   
    public SystemException(String errorCode)
    {
        super(ExceptionUtils.getErrorMessageInfo(errorCode));
    }

    private static final long serialVersionUID = 8126077723537082024L;

}
