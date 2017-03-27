package com.inteli.java;

/**
 * Created by aura on 16/2/17.
 */
public class Arrays {
    public static void main(String[] args) {

        int[] intArray = new int[5];

        intArray[0] = 5;
        intArray[1] = 1;
        intArray[2] = 3;
        intArray[3] = 2;
        intArray[4] = 4;

        System.out.println(min(intArray));
    }

    public static int[] sortArray(int[] a) {
        return new int[1];
    }

    public static int min(int[] a) {
        int min = a[0];
        for (int i = 0; i < a.length; i++) {
            min = (min > a[i]) ? a[i] : min;
        }
        return min;
    }
}
