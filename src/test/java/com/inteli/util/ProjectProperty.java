package com.inteli.util;

import java.io.*;
import java.util.Properties;

/**
 * Created by aura on 11/2/17.
 */
public class ProjectProperty {
    private FileInputStream fileInputStream;
    public Properties properties;

    public ProjectProperty() {
        properties = new Properties();
        try {
            fileInputStream = new FileInputStream("/home/aura/IdeaProjects/SeleniumMain/project.properties");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        try {
            properties.load(fileInputStream);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
