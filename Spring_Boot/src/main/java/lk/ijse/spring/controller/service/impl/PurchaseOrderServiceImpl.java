package lk.ijse.spring.controller.service.impl;

import lk.ijse.spring.controller.service.PurchaseOrderService;
import lk.ijse.spring.dto.OrdersDTO;
import lk.ijse.spring.entity.Item;
import lk.ijse.spring.entity.OrderDetails;
import lk.ijse.spring.entity.Orders;
import lk.ijse.spring.repo.ItemRepo;
import lk.ijse.spring.repo.OrderDetailsRepo;
import lk.ijse.spring.repo.OrdersRepo;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Service
@Transactional
public class PurchaseOrderServiceImpl implements PurchaseOrderService {

    @Autowired
    private OrdersRepo ordersRepo;

    @Autowired
    private OrderDetailsRepo orderDetailsRepo;

    @Autowired
    private ItemRepo itemRepo;

    @Autowired
    private ModelMapper mapper;

    @Override
    public void purchaseOrder(OrdersDTO dto) {
        //Let's handle it in Spring Way
        Orders orders = mapper.map(dto, Orders.class);

        //check order already available
        if (ordersRepo.existsById(orders.getOid())) {
            throw new RuntimeException("Order : " + orders.getOid() + " Already Available.!");
        }
        //save order and order details
        //if an error occur all transactions will be rolled backed
        ordersRepo.save(orders);


        for (OrderDetails od : orders.getOrderDetails()) {
            //find and update item qty on hand

            Optional<Item> resp = itemRepo.findById(od.getItemCode());
            if (!resp.isPresent()) {
                throw new RuntimeException(od.getItemCode() + ": Item Not Available On the Database.!");
            }

            Item item = resp.get();
            item.setQtyOnHand(String.valueOf((Integer.parseInt(item.getQtyOnHand()) - od.getQty())));
            itemRepo.save(item);
        }

    }

    @Override
    public OrdersDTO searchOrder(String oid) {
        return mapper.map(ordersRepo.findById(oid), OrdersDTO.class);
    }

}
