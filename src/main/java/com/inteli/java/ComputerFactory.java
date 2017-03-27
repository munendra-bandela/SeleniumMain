package com.inteli.java;

/**
 * Created by aura on 4/3/17.
 */
public class ComputerFactory {
    public static Computer getComputer(String type, String ram, String cpu, String hdd) {
        if (type.equalsIgnoreCase("pc"))
            return new PC(ram, cpu, hdd);
        else if (type.equalsIgnoreCase("server"))
            return new PC(ram, cpu, hdd);
        else return null;
    }
}
