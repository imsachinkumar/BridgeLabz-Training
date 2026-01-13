package hotelreservationsystem;
public class Main {
    public static void main(String[] args) {

        try {
            // Create rooms
            Room r1 = new StandardRoom(101);
            Room r2 = new DeluxeRoom(201);
            Guest guest = new Guest(1, "Sachin");
            HotelService service = new HotelService();
            Reservation reservation = service.bookRoom(guest, r2, 3);

            // Choose pricing strategy (Polymorphism)
            PricingStrategy pricing = new SeasonalPricing();

            // Generate invoice
            reservation.generateInvoice(pricing);

            System.out.println("Guest Name: " + reservation.getGuest().getName());
            System.out.println("Total Bill: ₹" + reservation.getTotalBill());

            // Checkout
            service.checkout(r2);
            System.out.println("Room checked out successfully.");

        } catch (RoomNotAvailableException e) {
            System.out.println(e.getMessage());
        }
    }
}
