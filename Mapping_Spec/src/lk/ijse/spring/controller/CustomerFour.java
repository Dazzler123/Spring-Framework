package lk.ijse.spring.controller;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/four")
public class CustomerFour {

    @GetMapping(consumes = {"application/json"}, produces = {MediaType.APPLICATION_JSON_VALUE})
    public String testOne() {
        return "testOne invoked";
    }


    @GetMapping(consumes = {"text/html"})
    public String test2() {
        return "testOne invoked";
    }

}
