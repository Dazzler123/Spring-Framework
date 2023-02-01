package lk.ijse.spring.controller;

import lk.ijse.spring.dto.CustomerDTO;
import lk.ijse.spring.service.CustomerService;
import lk.ijse.spring.util.ResponseUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("/customer")
@CrossOrigin
public class CustomerController {

    @Autowired
    CustomerService service;

    @PostMapping
    public String saveCustomer(CustomerDTO dto) {
        service.addCustomer(dto);

        System.out.println(dto.toString());
        return "Customer Saved Successfully.";
    }

    @GetMapping
    public ResponseUtil getCustomers() {
        ArrayList<CustomerDTO> allCustomers = service.getAllCustomers();
        return new ResponseUtil("200", "All Items Loaded", allCustomers);
    }

    @PutMapping
    public String updateCustomer(@RequestBody CustomerDTO dto) {
        service.updateCustomer(dto);

        return "Customer Updated Successfully.";
    }

    @DeleteMapping(params = "id")
    public String deleteCustomer(String id) {
        service.deleteCustomer(id);

        System.out.println(id);
        return "Customer Deleted.";
    }
}
