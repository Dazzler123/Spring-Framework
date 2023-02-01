package lk.ijse.spring.controller;

import lk.ijse.spring.dto.CustomerDTO;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;

@RestController
@RequestMapping("/five")
public class ControllerFive {

//    @PostMapping
//    public String testOne(HttpServletRequest request) {
//        String id = request.getParameter("id");
//        String name = request.getParameter("name");
//        String address = request.getParameter("address");
//        String salary = request.getParameter("salary");
//        System.out.println(id + name + address + salary);
//        return "testOne invoked";
//    }

    @PostMapping
    public String testOne(CustomerDTO dto) {  //public String testOne(@ModelAttribute CustomerDTO dto)
        System.out.println(dto.getId() + " " + dto.getName() + " " + dto.getAddress() + " " + dto.getSalary());
        return "testOne invoked";
    }

    @PutMapping
    public String testTwo(String id, String name, String address, String salary) {
        System.out.println(id + " " + name + " " + address + " " + salary);
        return "testTwo invoked";
    }

    @GetMapping
    public String testThree(String id, String name, String address, String salary) {
        System.out.println(id + " " + name + " " + address + " " + salary);
        return "testThree invoked";
    }

    @DeleteMapping
    public String testFour(String id, String name, String address, String salary) {
        System.out.println(id + " " + name + " " + address + " " + salary);
        return "testFour invoked";
    }
}
