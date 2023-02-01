package lk.ijse.spring.controller.service;

import lk.ijse.spring.dto.CustomerDTO;

import java.util.ArrayList;

public interface CustomerService {
    public void addCustomer(CustomerDTO dto);

    public void updateCustomer(CustomerDTO dto);

    public void deleteCustomer(String id);

    public ArrayList<CustomerDTO> getAllCustomers();

    public CustomerDTO searchCustomerByName();
}
