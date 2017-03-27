package com.inteli.selenium;

/**
 * Created by aura on 15/2/17.
 */
public class NonAccessModifiers {
    private static String staticVar = "static";
    private String nonStatic = "nonStatic";

    static {
        System.out.println("static block");
    }

    public NonAccessModifiers(String nonStatic) {
        this.nonStatic = nonStatic;
        System.out.println("constructor");
    }

    public static void main(String[] args) {
        NonAccessModifiers obj1 = new NonAccessModifiers("instantiate1");
        NonAccessModifiers obj2 = new NonAccessModifiers("instantiate2");

        System.out.println(NonAccessModifiers.staticVar);
    }
}
