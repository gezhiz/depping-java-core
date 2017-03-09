package com.deeping.core.utils;

/**
 * Created by gezz on 2017/2/26.
 */
public class DeepingStringUtils {
    public static String combineString(String ...args) {
        StringBuilder sb = new StringBuilder();
        for (String arg : args) {
            sb.append(arg);
        }
        return sb.toString();
    }
}
