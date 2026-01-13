package hotelreservationsystem;

// Service class handling booking and checkout
public class HotelService {
    // Book a room
    public Reservation bookRoom(Guest guest, Room room, int days)
            throws RoomNotAvailableException {

        if (!room.isAvailable()) {
            throw new RoomNotAvailableException("Room not available!");
        }

        room.bookRoom();
        return new Reservation(guest, room, days);
    }

    // Checkout
    public void checkout(Room room) {
        room.checkoutRoom();
    }
}
