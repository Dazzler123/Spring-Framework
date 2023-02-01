package lk.ijse.spring.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/two")
public class ControllerTwo {
    //wild card mapping
    @GetMapping(path = "/t1/*/hello")
    public void testOne() {
        System.out.println("testOne invoked");
    }

    //wild card mapping
    @GetMapping(path = "/t2/**/hello")
    public void testTwo() {
        System.out.println("testTwo invoked");
    }
}
