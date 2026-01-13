package inventorymanagementsystem;

// Implements alert service
class AlertServiceImpl implements AlertService {

    public void sendLowStockAlert(Product product) {
        System.out.println(
            "ALERT: Low stock for " +
            product.getProductName() +
            " (Qty: " + product.getQuantity() + ")"
        );
    }
}
