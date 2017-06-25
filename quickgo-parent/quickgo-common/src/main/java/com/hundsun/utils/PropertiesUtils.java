package com.hundsun.utils;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class PropertiesUtils
{
    private static Properties props;
    static
    {
        loadProperties();
    }

    private static void loadProperties()
    {
        props = new Properties();
        InputStream in = null;

        in = PropertiesUtils.class.getClassLoader().getResourceAsStream("*-error.properties");
        try
        {
            props.load(in);
        }
        catch (IOException e)
        {

            e.printStackTrace();
        }
        finally
        {
            try
            {
                if (CommonUtils.isNotEmpty(in))
                {
                    in.close();

                }
            }
            catch (IOException e)
            {
                e.printStackTrace();
            }
        }

    }

    public static String getProperties(String code)
    {
        if (CommonUtils.isEmpty(props))
        {
            loadProperties();
        }
        return props.getProperty(code);

    }
}
