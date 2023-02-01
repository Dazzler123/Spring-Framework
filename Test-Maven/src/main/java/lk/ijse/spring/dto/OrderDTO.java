package lk.ijse.spring.dto;

public class OrderDTO {

    private String orderID;
    private String orderDate;
    private String customerID;
    private String itemCode;
    private String orderQty;
    private double totalPrice;

    public OrderDTO(String orderID, String orderDate, String customerID, String itemCode, String orderQty, double totalPrice) {
        this.orderID = orderID;
        this.orderDate = orderDate;
        this.customerID = customerID;
        this.itemCode = itemCode;
        this.orderQty = orderQty;
        this.totalPrice = totalPrice;
    }

    public OrderDTO() {
    }

    public String getOrderID() {
        return orderID;
    }

    public void setOrderID(String orderID) {
        this.orderID = orderID;
    }

    public String getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(String orderDate) {
        this.orderDate = orderDate;
    }

    public String getCustomerID() {
        return customerID;
    }

    public void setCustomerID(String customerID) {
        this.customerID = customerID;
    }

    public String getItemCode() {
        return itemCode;
    }

    public void setItemCode(String itemCode) {
        this.itemCode = itemCode;
    }

    public String getOrderQty() {
        return orderQty;
    }

    public void setOrderQty(String orderQty) {
        this.orderQty = orderQty;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }

    @Override
    public String toString() {
        return "OrderDTO{" +
                "orderID='" + orderID + '\'' +
                ", orderDate='" + orderDate + '\'' +
                ", customerID='" + customerID + '\'' +
                ", itemCode='" + itemCode + '\'' +
                ", orderQty='" + orderQty + '\'' +
                ", totalPrice=" + totalPrice +
                '}';
    }
}
