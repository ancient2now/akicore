package com.akikun.akicore.utils;

public class StringUtils extends org.apache.commons.lang3.StringUtils
{
    /**
     * 将字符串按照多少间隔切分, 插入分隔字符串, 重新组成新的字符串
     *
     * @param str      需要处理的字符串
     * @param interval 间隔的距离
     * @param splitStr 间隔符字符串
     * @return 处理过的新字符串
     */
    public static String recombineStrByInterval(String str, int interval, String splitStr)
    {
        if (isEmpty(str))
        {
            return null;
        }
        final int len = str.length();
        int start = 0;
        int end;
        StringBuilder sb = new StringBuilder();
        while (start < len)
        {
            end = start + interval;
            if (end > len)
            {
                end = len;
            }
            sb.append(substring(str, start, end)).append(splitStr);
            start = end;
        }
        return sb.toString();
    }
}
