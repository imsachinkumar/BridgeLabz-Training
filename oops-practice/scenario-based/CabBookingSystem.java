import java.util.ArrayList;
import java.util.List;
class NoDriverAvailableException extends Exception {
    public NoDriverAvailableException(String message) {
        super(message);
    }
}

interface FareCalculator {
    double calculateFare(double distance);
}

class NormalFareCalculator implements FareCalculator {
    @Override
    public double calculateFare(double distance) {
        return distance * 10; // ₹10 per km
    }
}

class PeakFareCalculator implements FareCalculator {
    @Override
    public double calculateFare(double distance) {
        return distance * 15; // ₹15 per km
    }
}

class User {
    private int userId;
    private String name;

    public User(int userId, String name) {
        this.userId = userId;
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

class Driver {
    private int driverId;
    private String name;
    private boolean available;

    public Driver(int driverId, String name) {
        this.driverId = driverId;
        this.name = name;
        this.available = true;
    }

    public boolean isAvailable() {
        return available;
    }

    public void assignRide() {
        available = false;
    }

    public void completeRide() {
        available = true;
    }

    public String getName() {
        return name;
    }
}

class Ride {
    private User user;
    private Driver driver;
    private double distance;
    private double fare;

    public Ride(User user, Driver driver, double distance, FareCalculator calculator) {
        this.user = user;
        this.driver = driver;
        this.distance = distance;
        this.fare = calculator.calculateFare(distance);
    }

    public void displayRideDetails() {
        System.out.println("User Name   : " + user.getName());
        System.out.println("Driver Name : " + driver.getName());
        System.out.println("Distance    : " + distance + " km");
        System.out.println("Fare        : ₹" + fare);
        System.out.println("----------------------------------");
    }
}

public class CabBookingSystem {

    static List<Driver> drivers = new ArrayList<>();
    static List<Ride> rideHistory = new ArrayList<>();

    // Assign available driver
    public static Driver assignDriver() throws NoDriverAvailableException {
        for (Driver d : drivers) {
            if (d.isAvailable()) {
                d.assignRide();
                return d;
            }
        }
        throw new NoDriverAvailableException("No drivers available at the moment!");
    }

    public static void main(String[] args) {
        // Create drivers
        Driver d1 = new Driver(1, "Rahul");
        Driver d2 = new Driver(2, "Amit");
        drivers.add(d1);
        drivers.add(d2);
        // Create user
        User user = new User(101, "Sachin");
        // Choose fare strategy (Polymorphism)
        FareCalculator fareCalculator = new PeakFareCalculator();
        // FareCalculator fareCalculator = new NormalFareCalculator();
        try {
            // Assign driver
            Driver assignedDriver = assignDriver();
            // Create ride
            Ride ride = new Ride(user, assignedDriver, 10.5, fareCalculator);
            rideHistory.add(ride);//CREATE
            // Display ride
            ride.displayRideDetails(); // READ
            // Complete ride
            assignedDriver.completeRide(); // UPDATE
            System.out.println("Ride completed successfully.");

        } catch (NoDriverAvailableException e) {
            System.out.println(e.getMessage());
        }
        // Delete ride history
        rideHistory.clear(); // DELETE
        System.out.println("Ride history cleared.");
    }
}
