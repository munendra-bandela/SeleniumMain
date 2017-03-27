package com.inteli.java;

/**
 * Created by aura on 4/3/17.
 */
public class FactoryTest {
    public static void main(String[] args) {
        Computer pc = ComputerFactory.getComputer("pc", "8GB", "2.5GHz", "250 ssd");
        Computer server = ComputerFactory.getComputer("pc", "16GB", "4.5GHz", "500 ssd");

        System.out.println(pc);
        System.out.println(server);
    }
}
