package lk.ijse.spring.pojo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class BeanOne {

    public BeanOne() {
    }

    @Autowired
    public BeanOne(@Value("Hello") String greetings) {
        System.out.println("Say " + greetings);
    }
}
