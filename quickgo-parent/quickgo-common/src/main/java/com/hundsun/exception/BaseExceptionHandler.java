package com.hundsun.exception;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;

public class BaseExceptionHandler implements HandlerExceptionResolver
{

    private static final String ERROR_MESSAGE="message";
    public ModelAndView resolveException(HttpServletRequest request, HttpServletResponse response, Object object, Exception ex)
    {
        ModelAndView view = new ModelAndView();
        BaseException exception=null;
        if(ex instanceof BusinessException){
           exception=(BusinessException) ex;
        }else{
            exception=(SystemException) ex;
            
        }
        view.addObject(ERROR_MESSAGE, exception.getMessage());

        return view;
    }



}
