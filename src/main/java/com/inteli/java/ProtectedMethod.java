package com.inteli.java;

/**
 * Created by aura on 22/2/17.
 */
public class ProtectedMethod {
    public void publicMethod(Integer i) {
        System.out.println("public method");
    }

    private void privateMethod() {
        System.out.println("private method");
    }

    protected void protectedMethod() {
        System.out.println("protected method");
    }

    void defaultMethod() {
        System.out.println("default method");
    }
}
