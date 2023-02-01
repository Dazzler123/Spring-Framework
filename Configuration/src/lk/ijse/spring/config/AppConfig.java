package lk.ijse.spring.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@ComponentScan(basePackages = "lk.ijse.spring.pojo")
@Import({ConfigOne.class, ConfigTwo.class})  //to add configuration class
public class AppConfig {
    public AppConfig(){
        System.out.println("AppConfig:Instantiated");
    }
}
