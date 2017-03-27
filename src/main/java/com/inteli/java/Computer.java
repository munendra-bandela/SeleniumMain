package com.inteli.java;

/**
 * Created by aura on 4/3/17.
 */
public interface Computer {
    public String getRAM();
    public String getCPU();
    public String getHDD();

    @Override
    public String toString();

}
