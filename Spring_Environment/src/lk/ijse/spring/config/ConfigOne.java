package lk.ijse.spring.config;

import lk.ijse.spring.pojo.BeanTwo;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConfigOne {
    public ConfigOne(){
        System.out.println("ConfigOne:Instantiated");
    }

    @Bean
    public BeanTwo beanTwo(){
        return new BeanTwo();
    }
}
