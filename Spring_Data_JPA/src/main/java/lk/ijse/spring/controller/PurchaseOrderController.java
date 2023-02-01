package lk.ijse.spring.controller;

import lk.ijse.spring.dto.OrdersDTO;
import lk.ijse.spring.service.PurchaseOrderService;
import lk.ijse.spring.util.ResponseUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/purchase")
@CrossOrigin
public class PurchaseOrderController {

    @Autowired
    private PurchaseOrderService service;

    @PostMapping
    public ResponseUtil purchaseOrder(@RequestBody OrdersDTO dto) {
        service.purchaseOrder(dto);
        return new ResponseUtil("200", "Successfully Purchased.!", null);
    }

    @GetMapping(path = "/{oid}")
    public ResponseUtil searchOrder(@PathVariable String oid) {
        OrdersDTO ordersDTO = service.searchOrder(oid);
        return new ResponseUtil("200", "Successfully Purchased.!", ordersDTO);
    }

}
