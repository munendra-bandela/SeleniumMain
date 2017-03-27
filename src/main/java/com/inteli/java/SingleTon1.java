package com.inteli.java;

/**
 * Created by aura on 5/3/17.
 */
public class SingleTon1 {
    private static final SingleTon1 obj = new SingleTon1();

    private SingleTon1() {
    }

    public static SingleTon1 getInstance() {
        return obj;

    }

}
