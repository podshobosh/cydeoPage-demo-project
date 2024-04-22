package com.cydeo.utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigurationReader
{

    private static Properties properties = new Properties();

    static {

        try {
            //Open file using FileInputStream
           FileInputStream file = new FileInputStream("configuration.properties");

           //load the "properties" object with "file" (load properties)
           properties.load(file);
            //close the file in the memory
            file.close();

        } catch (IOException e) {
        System.err.println("FILE NOT FOUND WITH GIVEN PATH!!!");
        e.printStackTrace();
        }
    }

    //create a utility method to use the object
    // USe "properties" object to read from the file (read properties)
    public static String getProperty(String key) {
        return properties.getProperty(key);
    }
}
