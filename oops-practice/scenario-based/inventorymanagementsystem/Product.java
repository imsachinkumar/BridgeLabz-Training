package inventorymanagementsystem;

// Represents a product in the warehouse
class Product {
    private int productId;
    private String productName;
    private int quantity;

    Product(int productId, String productName, int quantity) {
        this.productId = productId;
        this.productName = productName;
        this.quantity = quantity;
    }
    // Getters
    int getProductId() {
        return productId;
    }

    String getProductName() {
        return productName;
    }

    int getQuantity() {
        return quantity;
    }
    // Setter
    void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
