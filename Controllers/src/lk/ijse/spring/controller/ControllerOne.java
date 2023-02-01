package lk.ijse.spring.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController  // a rest controller class
@RequestMapping("/customer")
public class ControllerOne {
    public ControllerOne() {
        System.out.println("ControllerOne : Instantiated");
    }

    @GetMapping
    public void getMethod() {
        System.out.println("Get Method invoked");
    }

    @PostMapping
    public void postMethod() {
        System.out.println("Post Method invoked");
    }
}
