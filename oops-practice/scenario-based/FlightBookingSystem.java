import java.util.*;
// Flight Booking System
public class FlightBookingSystem {
    // Array to store available flights
    static String[] flights = {
            "AI101 | Delhi to Mumbai",
            "AI202 | Mumbai to Bangalore",
            "IND303 | Delhi to Chennai",
            "VIST404 | Bangalore to Goa"
    };
    // List to store bookings
    static List<String> bookings = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int choice;
        do {
            System.out.println("\n--- Flight Booking System ---");
            System.out.println("1. Search Flight");
            System.out.println("2. Book Flight");
            System.out.println("3. View Bookings");
            System.out.println("4. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1 -> searchFlight();
                case 2 -> bookFlight();
                case 3 -> viewBookings();
                case 4 -> System.out.println("Thank You!");
                default -> System.out.println("Invalid Choice");
            }
        } while (choice != 4);
    }

    // SEARCH
    static void searchFlight() {
        System.out.print("Enter source or destination to search: ");
        String search = sc.nextLine().toLowerCase();

        boolean found = false;
        for (String flight : flights) {
            if (flight.toLowerCase().contains(search)) {
                System.out.println(flight);
                found = true;
            }
        }

        if (!found) {
            System.out.println("No flights found.");
        }
    }
    // BOOK
    static void bookFlight() {
        System.out.println("Available Flights:");
        for (int i = 0; i < flights.length; i++) {
            System.out.println((i + 1) + ". " + flights[i]);
        }

        System.out.print("Select flight number to book: ");
        int choice = sc.nextInt();

        if (choice >= 1 && choice <= flights.length) {
            bookings.add(flights[choice - 1]);
            System.out.println("Flight booked successfully!");
        } else {
            System.out.println("Invalid selection.");
        }
    }
    // VIEW BOOKINGS
    static void viewBookings() {
        if (bookings.isEmpty()) {
            System.out.println("No bookings yet.");
            return;
        }

        System.out.println("Your Bookings:");
        for (String booking : bookings) {
            System.out.println(booking);
        }
    }
}
