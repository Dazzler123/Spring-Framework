package lk.ijse.spring.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan(basePackages = "lk.ijse.spring.pojo")
@Import({ConfigOne.class, ConfigTwo.class})  //to add configuration class
@PropertySource("classpath:application.properties")
public class AppConfig {
    public AppConfig() {
        System.out.println("AppConfig:Instantiated");
    }
}
