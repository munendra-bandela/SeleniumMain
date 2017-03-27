package com.inteli.java;

/**
 * Created by aura on 5/3/17.
 */
public class SingleTon2 {
    private final SingleTon2 obj;

    private SingleTon2() {
    }

    public static SingleTon2 getInstance() {
        if (obj == null)
            obj = new SingleTon2();
        return obj;
    }

}
