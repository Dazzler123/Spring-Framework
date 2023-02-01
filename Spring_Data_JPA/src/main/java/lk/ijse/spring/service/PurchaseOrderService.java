package lk.ijse.spring.service;

import lk.ijse.spring.dto.OrdersDTO;

public interface PurchaseOrderService {
    public void purchaseOrder(OrdersDTO dto);

    public OrdersDTO searchOrder(String oid);
}
