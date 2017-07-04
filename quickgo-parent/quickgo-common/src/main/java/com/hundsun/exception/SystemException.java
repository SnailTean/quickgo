package com.hundsun.exception;

import com.hundsun.utils.ExceptionUtils;

/**
 * 
* @Description: 系统异常
* @author liuyang下午5:15:35SystemException.java
* @date 2017年6月26日 下午5:15:35
*
 */
public class SystemException extends BaseException
{

   
    public SystemException(String errorCode)
    {
        super(ExceptionUtils.getErrorMessageInfo(errorCode));
    }

    private static final long serialVersionUID = 8126077723537082024L;

}
