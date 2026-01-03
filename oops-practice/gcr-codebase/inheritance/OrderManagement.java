//Super Class
class order{
    int orderId;
    String orderDate;
    //Constructor
    order(int orderId,String orderDate){
        this.orderId=orderId;
        this.orderDate=orderDate;

    }
    //Method to be overridden
    String getOrderStatus(){
        return "Order Placed";
    }

}
// Sub Class
class ShippedOrder extends order{
    String trackingNumber;
    ShippedOrder(int orderId,String orderDate,String trackingNumber){
        super(orderId, orderDate);
        this.trackingNumber=trackingNumber;
    }
     String getOrderStatus(){
        return "Order Shipped";
    }
}
// Sub Class
class DeliveredOrder extends ShippedOrder{
    String deliveryDate;
    //Constructor
    DeliveredOrder(int orderId,String orderDate,String trackingNumber,String deliveryDate){
      super(orderId, orderDate, trackingNumber);
      this.deliveryDate=deliveryDate;
    }
    //Overriding Method
     String getOrderStatus(){
        return "Order Delivered";
    }
}
public class OrderManagement {
    public static void main(String[] args) {
        // Creating DeliveredOrder object
        DeliveredOrder o1=new DeliveredOrder(101, "10-Jan-2026", "TRK123", "15-Jan-2026");
        System.out.println(o1.getOrderStatus());
    }
}
