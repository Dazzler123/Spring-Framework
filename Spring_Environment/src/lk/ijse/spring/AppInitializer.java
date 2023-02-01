package lk.ijse.spring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Map;
import java.util.Properties;

public class AppInitializer {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();

        //OS env variables
        Map<String, String> getenv = System.getenv();
        for (String key : getenv.keySet()) {
            String s = getenv.get(key);
            System.out.println(key + " :  " + s);
        }

        System.out.println("=======================================================================================");

        //java pre-defined properties
        Properties properties = System.getProperties();
        for (Object key : properties.keySet()) {
            Object s = properties.get(key);
            System.out.println(key + " :  " + s);
        }
    }
}
