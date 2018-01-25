package com.jyqqhw.jnidemo;

/**
 * Created by jyqqhw on 2016/7/23 023.
 */
public class JniUtil {
    static {
        System.loadLibrary("HelloJni");
    }

    public native String printJni(String str);

}
