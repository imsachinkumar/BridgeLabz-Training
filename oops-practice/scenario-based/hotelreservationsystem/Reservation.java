package hotelreservationsystem;

// Reservation entity class
public class Reservation {

    private Guest guest;
    private Room room;
    private int days;
    private double totalBill;

    public Reservation(Guest guest, Room room, int days) {
        this.guest = guest;
        this.room = room;
        this.days = days;
    }

    // Generate invoice using pricing strategy
    public void generateInvoice(PricingStrategy pricing) {
        totalBill = pricing.calculateBill(room.getBasePrice(), days);
    }

    public double getTotalBill() {
        return totalBill;
    }

    public Guest getGuest() {
        return guest;
    }
}
