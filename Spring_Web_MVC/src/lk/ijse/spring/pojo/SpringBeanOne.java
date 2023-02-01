package lk.ijse.spring.pojo;

import org.springframework.stereotype.Component;

@Component
public class SpringBeanOne {
    public SpringBeanOne() {
        System.out.println("SpringBeanOne : Instantiated");
    }
}
