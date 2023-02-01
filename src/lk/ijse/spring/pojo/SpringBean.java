package lk.ijse.spring.pojo;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("bean")
@Scope("prototype")
public class SpringBean {

    public SpringBean() {
        System.out.println("Spring Bean : Instantiated.");
    }

    public void test() {
        System.out.println("Spring Bean test method invoked.");
    }
}
