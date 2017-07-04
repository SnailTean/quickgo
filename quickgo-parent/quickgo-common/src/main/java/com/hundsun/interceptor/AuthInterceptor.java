package com.hundsun.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 
* @Description: 鉴权拦截器
* @author liuyang下午5:13:24AuthInterceptor.java
* @date 2017年6月26日 下午5:13:24
*
 */
public class AuthInterceptor extends BaseInterceptor
{

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception
    {
        
        return super.preHandle(request, response, handler);
    }
       
}
