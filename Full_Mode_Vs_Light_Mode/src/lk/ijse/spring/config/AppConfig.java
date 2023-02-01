package lk.ijse.spring.config;

import lk.ijse.spring.pojo.BeanThree;
import lk.ijse.spring.pojo.BeanTwo;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "lk.ijse.spring")
public class AppConfig {

    @Bean
    public BeanTwo beanTwo() {
        //Inter-bean dependencies
        BeanThree b1 = beanThree(); //inter-bean dependency invocation
        System.out.println(b1);
        return new BeanTwo();
    }

    @Bean
    public BeanThree beanThree() {
        return new BeanThree();
    }
}
