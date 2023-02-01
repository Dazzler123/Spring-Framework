package lk.ijse.spring.controller;

import lk.ijse.spring.dto.CustomerDTO;
import lk.ijse.spring.util.ResponseUtil;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("/customer")
@CrossOrigin
public class CustomerController {

    @PostMapping
    public String saveCustomer(CustomerDTO dto) {
        System.out.println(dto.toString());
        return "Customer Saved Successfully.";
    }

    @GetMapping
    public ResponseUtil getCustomers() {
        ArrayList<CustomerDTO> customers = new ArrayList<>();
        customers.add(new CustomerDTO("C001","Dasun","Gampaha",34000));
        customers.add(new CustomerDTO("C001","Dasun","Gampaha",34000));
        customers.add(new CustomerDTO("C001","Dasun","Gampaha",34000));
        customers.add(new CustomerDTO("C001","Dasun","Gampaha",34000));
        customers.add(new CustomerDTO("C001","Dasun","Gampaha",34000));
        return new ResponseUtil("200", "All Items Loaded", customers);
    }

    @PutMapping
    public String updateCustomer(@RequestBody CustomerDTO dto) {
        System.out.println(dto.toString());
        return "Customer Updated Successfully.";
    }

    @DeleteMapping(params = "id")
    public String deleteCustomer(String id) {
        System.out.println(id);
        return "Customer Deleted.";
    }
}
