package hotelreservationsystem;

// Custom exception when room is already booked
public class RoomNotAvailableException extends Exception {
    public RoomNotAvailableException(String message) {
        super(message);
    }
}
