package com.akikun;

import com.google.common.collect.ImmutableList;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CollectionUtils
{
    /**
     * 判断集合为空集合
     *
     * @param collection
     * @param <E>
     * @return
     */
    public static <E> boolean isEmpty(Collection<E> collection)
    {
        return collection == null || collection.isEmpty();
    }

    /**
     * 判断集合不是空集合
     *
     * @param collection
     * @param <E>
     * @return
     */
    public static <E> boolean isNotEmpty(Collection<E> collection)
    {
        return !isEmpty(collection);
    }

    /**
     * 当列表中的值不是基础类型时, 按照某个属性去重
     *
     * @param list
     * @param <E>
     * @return
     */
    public static <E, U extends Comparable<? super U>> List<E> distinct(List<E> list,
                                                                        Function<? super E, ? extends U> keyExtractor)
    {
        if (isEmpty(list))
        {
            return ImmutableList.of();
        }
        /*
        Set<E> set = new TreeSet<>(Comparator.comparing(keyExtractor));
        set.addAll(list);
        return Lists.newArrayList(set);
        */
        return list.stream().collect(Collectors.collectingAndThen( //
                Collectors.toCollection(() -> new TreeSet<>(Comparator.comparing(keyExtractor))), //
                ArrayList::new));
    }
}
