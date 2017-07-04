package com.hundsun.exception;

import com.hundsun.utils.ExceptionUtils;

/**
 * 
* @Description: 业务异常
* @author liuyang下午5:15:20BusinessException.java
* @date 2017年6月26日 下午5:15:20
*
 */
public class BusinessException extends BaseException
{
    private static final long serialVersionUID = 7300970844317829909L;

    public BusinessException(String errorCode)
    {
       super(ExceptionUtils.getErrorMessageInfo(errorCode));
    }


}
