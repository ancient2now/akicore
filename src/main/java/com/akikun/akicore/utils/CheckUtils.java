package com.akikun.akicore.utils;

import java.util.regex.Pattern;

public class CheckUtils
{
    /**
     * 校验字符串是否对应正则
     */
    public static boolean checkRegValue(String strRegular, String value)
    {
        return StringUtils.isNotBlank(strRegular) //
                && Pattern.compile(strRegular).matcher(value).matches();
    }
}
