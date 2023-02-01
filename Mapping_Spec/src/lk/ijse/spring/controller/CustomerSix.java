package lk.ijse.spring.controller;

import lk.ijse.spring.dto.CustomerDTO;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("/six")
public class CustomerSix {

    @PostMapping
    public ArrayList<CustomerDTO> testOne(@RequestBody CustomerDTO customerDTO) {
        System.out.println(customerDTO.toString());
        ArrayList<CustomerDTO> customerDTOS = new ArrayList<CustomerDTO>();
        customerDTOS.add(customerDTO);
        return customerDTOS;
    }

    @GetMapping
    public String getData(CustomerDTO dto) {
        return "Get Data invoked" + dto.toString();
    }

}
