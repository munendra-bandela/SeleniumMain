package com.inteli.java;

/**
 * Created by aura on 5/3/17.
 */
public class SingleTon3 {
    private final SingleTon3 obj;

    private SingleTon3() {
    }

    public static synchronized SingleTon3 getInstance() {
        if (obj == null)
            obj = new SingleTon3();
        return obj;
    }

}
