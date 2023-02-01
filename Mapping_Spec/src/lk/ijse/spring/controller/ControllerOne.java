package lk.ijse.spring.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/one")
public class ControllerOne {

    @GetMapping(path = "/m1")
    public String getOne() {
        System.out.println("Get Mapping Invoked");
        return "Get Mapping Invoked";
    }

    @GetMapping(path = "/m2/no/{C001}/{ijse}")
    public String getOneTwo(@PathVariable("C001") String id, @PathVariable("ijse") String name) {
        System.out.println("Get Mapping Two Invoked : " + id + " & "+ name);
        return "Get Mapping Two Invoked : " + id + " & "+ name;
    }

    @GetMapping(path = "/m3/no/{id}/{name}")
    public String getOneThree(@PathVariable String id, @PathVariable String name) {
        System.out.println("Get Mapping Three Invoked : " + id + " & "+ name);
        return "Get Mapping Three Invoked : " + id + " & "+ name;
    }

    @GetMapping(path = "/m4/no/{name:[A-z]{4}}")
    public String getOneFour(@PathVariable String name) {
        System.out.println("Get Mapping Four Invoked : " + name);
        return "Get Mapping Four Invoked : " + name;
    }

    @GetMapping(path = "C??0")
    public String getOneFive() {
        System.out.println("Get Mapping Five Invoked");
        return "Get Mapping Five Invoked";
    }

    @GetMapping(path = "C???0")
    public String getOneSix() {
        System.out.println("Get Mapping Six Invoked");
        return "Get Mapping Six Invoked";
    }



    @PostMapping
    public String testTwo() {
        System.out.println("Post Mapping Invoked");
        return "Post Mapping Invoked";
    }

    @DeleteMapping
    public String testThree() {
        System.out.println("Delete Mapping Invoked");
        return "Delete Mapping Invoked";
    }
}
