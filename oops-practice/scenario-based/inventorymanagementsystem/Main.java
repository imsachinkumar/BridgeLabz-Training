package inventorymanagementsystem;
public class Main {
    public static void main(String[] args) {
        Inventory inventory = new Inventory();
        AlertService alertService = new AlertServiceImpl();
        // Adding products
        inventory.addProduct(new Product(1, "Keyboard", 10));
        inventory.addProduct(new Product(2, "Mouse", 4));
        inventory.addProduct(new Product(3, "Monitor", 2));

        inventory.displayProducts();
        try {
            inventory.updateStock(2, 3);
            inventory.updateStock(3, 0); // Exception here
        } catch (OutOfStockException e) {
            System.out.println(e.getMessage());
        }
        // Check low stock
        inventory.checkLowStock(alertService);
    }
}
