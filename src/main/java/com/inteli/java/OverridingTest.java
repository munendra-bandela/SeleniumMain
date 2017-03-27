package com.inteli.java;

/**
 * Created by aura on 22/2/17.
 */
public class OverridingTest extends ProtectedMethod {

    public void publicMethod(int i) {
        System.out.println("subclass public method");
    }

    @Override
    void defaultMethod() {
        super.defaultMethod();
        System.out.println("subclass default method");
    }

    private void privateMethod() {
        System.out.println("");
    }

    public static void main(String[] args) {
        OverridingTest obj = new OverridingTest();
        obj.protectedMethod();
    }
}
