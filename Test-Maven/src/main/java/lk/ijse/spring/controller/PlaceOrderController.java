package lk.ijse.spring.controller;

import lk.ijse.spring.dto.OrderDTO;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/purchase")
@CrossOrigin
public class PlaceOrderController {

    @PostMapping
    public String saveOrder(OrderDTO dto) {
        System.out.println(dto.toString());
        return "Order saved successfully";
    }
}
