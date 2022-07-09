package standardclasses;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesApp {
    public static void main(String[] args) {

        Properties properties = new Properties();
        try {
            //get value dari application.properies
            properties.load(new FileInputStream("application.properties"));

            System.out.println(properties.getProperty("database.host"));
            System.out.println(properties.getProperty("database.port"));
            System.out.println(properties.getProperty("database.username"));
            System.out.println(properties.getProperty("database.password"));
        } catch (IOException e) {
            e.printStackTrace();
        }

        //add key and value in file name.properties (auto generated)
        properties.put("name.first","Ichwan");
        properties.put("name.last","Sholihin");

        try {
            properties.store(new FileOutputStream("name.properties"),"Config Name");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
