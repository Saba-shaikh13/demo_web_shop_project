package utilities;

import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;



public class ConfigReader {

    static Properties properties;

    public static void loadConfig()
    {
        try {

            properties = new Properties();

            FileInputStream file =
                    new FileInputStream("C:\\Users\\SK Laptop Town\\sabacorejava\\Demo_Web_Shop\\src\\main\\resources\\config\\config.properties");

            properties.load(file);

        } catch (IOException e) {

            e.printStackTrace();
        }
    }

    public static String getProperty(String key)
    {
        return properties.getProperty(key);
    }
   
  
}