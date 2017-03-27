package com.inteli.java;

/**
 * Created by aura on 4/3/17.
 */
public class PC implements Computer {

    private String ram;
    private String cpu;
    private String hdd;

    public PC(String ram, String cpu, String hdd) {
        this.ram = ram;
        this.cpu = cpu;
        this.hdd = hdd;
    }

    public String getRAM() {
        return ram;
    }

    public String getCPU() {
        return cpu;
    }

    public String getHDD() {
        return hdd;
    }

    public String toString() {
        return "PC RAM: " + getRAM() + " CPU: " + getCPU() + " HDD: " + getHDD();
    }
}
