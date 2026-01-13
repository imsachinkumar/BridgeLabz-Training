package hotelreservationsystem;

// Base Room class
public class Room {

    protected int roomNumber;
    protected double basePrice;
    protected boolean available;

    public Room(int roomNumber, double basePrice) {
        this.roomNumber = roomNumber;
        this.basePrice = basePrice;
        this.available = true;
    }

    public boolean isAvailable() {
        return available;
    }

    public void bookRoom() {
        available = false;
    }

    public void checkoutRoom() {
        available = true;
    }

    public double getBasePrice() {
        return basePrice;
    }
}
