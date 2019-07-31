package com.akikun.akicore.utils;

import com.akikun.akicore.elif.Ant;

public class CaseUtils
{
    public static Ant IF(boolean ifState)
    {
        return new Ant(ifState);
    }

    public static void ifDo(boolean ifState, Runnable fun)
    {
        if (ifState)
        {
            fun.run();
        }
    }

    public static void ifDoElseDo(boolean ifState, Runnable funIf, Runnable funElse)
    {
        if (ifState)
        {
            funIf.run();
        }
        else
        {
            funElse.run();
        }
    }

//    public static Ant ifThen(boolean ifState, Runnable fun)
//    {
//        if (ifState)
//        {
//            fun.run();
//        }
//        return new Ant(ifState);
//    }

    public static void printStr(Runnable r)
    {
        System.out.println(r.toString());
    }

    public static Ant ifThen(boolean ifState, Runnable r)
    {
        return new Ant(ifState, r);
    }

}
