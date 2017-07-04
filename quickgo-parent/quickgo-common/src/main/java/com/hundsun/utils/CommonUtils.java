package com.hundsun.utils;

import java.util.Arrays;
import java.util.Collection;
import java.util.Map;

/**
 * 
* @Description: 公共工具类
* @author liuyang下午5:16:00CommonUtils.java
* @date 2017年6月26日 下午5:16:00
*
 */
public class CommonUtils
{

    public static boolean isEmpty(Object object)
    {
        if (object == null||object=="")
        {
            return true;
        }
        if (object instanceof Map)
        {
            Map<?, ?> map = (Map<?, ?>) object;
            return map.isEmpty();
        }
        else if (object instanceof Collection<?>)
        {
            Collection<?> collection = (Collection<?>) object;
            return collection.isEmpty();
        }
        else if (object instanceof Arrays[])
        {
            Arrays[] arrays=(Arrays[]) object;
            if(arrays.length==0){
                return true;
            }
        }
        return false;

    }
    
    public static boolean isNotEmpty(Object object){
        return !isEmpty(object);
    }
}
