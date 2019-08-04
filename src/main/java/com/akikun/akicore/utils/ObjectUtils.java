package com.akikun.akicore.utils;

import java.util.Objects;
import java.util.function.Function;

public class ObjectUtils extends org.apache.commons.lang3.ObjectUtils
{
    /**
     * 对象的属性的值是否与别的相等
     *
     * @param t            对象
     * @param keyExtractor 对象的方法
     * @param u            相比较的对象
     * @param <T>          对象的类型
     * @param <U>          需要比较相等的对象的类型
     * @return bool值
     */
    public static <T, U> boolean equals(T t, Function<? super T, ? extends U> keyExtractor, U u)
    {
        if (!allNotNull(t, u, keyExtractor))
        {
            return false;
        }
        // return u.equals(Optional.of(t).map(keyExtractor).orElse(null));
        return Objects.equals(keyExtractor.apply(t), u);
    }

    /**
     * 返回第一个不是null的对象
     *
     * @param values
     * @return
     */
    public static <T> boolean hasNull(final T... values)
    {
        if (values != null)
        {
            for (final T val : values)
            {
                if (val == null)
                {
                    return true;
                }
            }
        }
        return false;
    }
}
