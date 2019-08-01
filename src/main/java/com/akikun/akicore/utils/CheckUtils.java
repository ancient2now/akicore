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

    /**
     * 判断字符串是否是数字
     * 可以是正整数或负整数
     *
     * @param cs 字符串,字符
     * @return
     */
    public static boolean isNumeric(CharSequence cs)
    {
        if (cs == null)
        {
            return false;
        }
        final int len = cs.length();
        if (len == 0)
        {
            return false;
        }
        if (len == 1 && !Character.isDigit(cs.charAt(0)))
        {
            return false;
        }
        if (!Character.isDigit(cs.charAt(0)) && cs.charAt(0) != '-')
        {
            return false;
        }
        for (int i = 1; i < len; ++i)
        {
            if (!Character.isDigit(cs.charAt(i)))
            {
                return false;
            }
        }
        return true;
    }
}
