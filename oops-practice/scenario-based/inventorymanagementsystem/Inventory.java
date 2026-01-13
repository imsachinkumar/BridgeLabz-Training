package inventorymanagementsystem;
// Inventory class managing products
class Inventory {
    private Product[] products;
    private int count;
    private final int MAX_PRODUCTS = 5;
    private final int LOW_STOCK_LIMIT = 5;

    Inventory() {
        products = new Product[MAX_PRODUCTS];
        count = 0;
    }

    // Add product
    void addProduct(Product product) {
        if (count < MAX_PRODUCTS) {
            products[count] = product;
            count++;
            System.out.println("Product added: " + product.getProductName());
        }
    }

    // Update stock
    void updateStock(int productId, int quantity) throws OutOfStockException {
        for (int i = 0; i < count; i++) {
            if (products[i].getProductId() == productId) {

                if (quantity <= 0) {
                    throw new OutOfStockException("Product is out of stock!");
                }

                products[i].setQuantity(quantity);
                System.out.println("Stock updated for product ID: " + productId);
                return;
            }
        }
    }

    // Check low stock
    void checkLowStock(AlertService alertService) {
        for (int i = 0; i < count; i++) {
            if (products[i].getQuantity() <= LOW_STOCK_LIMIT) {
                alertService.sendLowStockAlert(products[i]);
            }
        }
    }

    // Display inventory
    void displayProducts() {
        System.out.println("Inventory Details:");
        for (int i = 0; i < count; i++) {
            System.out.println(
                products[i].getProductId() + " | " +
                products[i].getProductName() + " | Qty: " +
                products[i].getQuantity()
            );
        }
    }
}
