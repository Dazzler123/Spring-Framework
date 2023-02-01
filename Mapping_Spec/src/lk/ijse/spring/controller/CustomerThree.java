package lk.ijse.spring.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/three")
public class CustomerThree {

//    @GetMapping(params = {"id","name"})
//    public String testOne() {
//        return "testOne invoked";
//    }

    @GetMapping(params = {"id","name"})
    public String testTwo(String id, String name) {
        return "testTwo invoked";
    }

    @GetMapping(params = {"id","name"})
    public String testThree(@RequestParam("id") String myID, String name) {
        return "testThree invoked";
    }

}
