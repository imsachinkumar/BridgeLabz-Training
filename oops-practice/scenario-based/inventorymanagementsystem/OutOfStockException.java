package inventorymanagementsystem;

// Thrown when stock is insufficient
class OutOfStockException extends Exception {
    OutOfStockException(String message) {
        super(message);
    }
}