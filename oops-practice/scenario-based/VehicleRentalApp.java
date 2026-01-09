import java.util.*;
// Interface
interface IRentable {
    double calculateRent(int days);
}
// Base Class
class Vehicle {
    protected int vehicleId;
    protected String brand;
    protected double ratePerDay;

    public Vehicle(int vehicleId, String brand, double ratePerDay) {
        this.vehicleId = vehicleId;
        this.brand = brand;
        this.ratePerDay = ratePerDay;
    }
    public int getVehicleId() {
        return vehicleId;
    }
    public void displayInfo() {
        System.out.println("Vehicle ID: " + vehicleId);
        System.out.println("Brand: " + brand);
        System.out.println("Rate per Day: ₹" + ratePerDay);
    }
}
// Bike Class
class Bike extends Vehicle implements IRentable {
    public Bike(int id, String brand, double rate) {
        super(id, brand, rate);
    }
    @Override
    public double calculateRent(int days) {
        return days * ratePerDay;
    }
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Type: Bike");
    }
}

// Car Class
class Car extends Vehicle implements IRentable {
    public Car(int id, String brand, double rate) {
        super(id, brand, rate);
    }

    @Override
    public double calculateRent(int days) {
        return days * ratePerDay + 500; // extra service charge
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Type: Car");
    }
}
// Truck Class
class Truck extends Vehicle implements IRentable {
    public Truck(int id, String brand, double rate) {
        super(id, brand, rate);
    }

    @Override
    public double calculateRent(int days) {
        return days * ratePerDay + 1000; // heavy vehicle charge
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Type: Truck");
    }
}

// Customer Class
class Customer {
    private int customerId;
    private String name;

    public Customer(int id, String name) {
        this.customerId = id;
        this.name = name;
    }

    public void displayCustomer() {
        System.out.println("Customer ID: " + customerId);
        System.out.println("Customer Name: " + name);
    }
}
public class VehicleRentalApp {
    static List<Vehicle> vehicles = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int choice;
        do {
            System.out.println("\n--- Vehicle Rental System ---");
            System.out.println("1. Add Vehicle");
            System.out.println("2. View Vehicles");
            System.out.println("3. Rent Vehicle");
            System.out.println("4. Delete Vehicle");
            System.out.println("5. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1 -> addVehicle();
                case 2 -> viewVehicles();
                case 3 -> rentVehicle();
                case 4 -> deleteVehicle();
                case 5 -> System.out.println("Exiting...");
                default -> System.out.println("Invalid Choice!");
            }
        } while (choice != 5);
    }
    // CREATE
    static void addVehicle() {
        System.out.print("Enter Vehicle ID: ");
        int id = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Brand: ");
        String brand = sc.nextLine();

        System.out.print("Enter Rate per Day: ");
        double rate = sc.nextDouble();
        System.out.print("1. Bike  2. Car  3. Truck : ");
        int type = sc.nextInt();

        Vehicle v;
        if (type == 1)
            v = new Bike(id, brand, rate);
        else if (type == 2)
            v = new Car(id, brand, rate);
        else
            v = new Truck(id, brand, rate);

        vehicles.add(v);
        System.out.println("Vehicle Added Successfully!");
    }
    // READ
    static void viewVehicles() {
        if (vehicles.isEmpty()) {
            System.out.println("No vehicles available.");
            return;
        }

        for (Vehicle v : vehicles) {
            System.out.println("-----------------");
            v.displayInfo(); // Polymorphism
        }
    }
    // RENT
    static void rentVehicle() {
        System.out.print("Enter Vehicle ID: ");
        int id = sc.nextInt();

        System.out.print("Enter Rental Days: ");
        int days = sc.nextInt();

        for (Vehicle v : vehicles) {
            if (v.getVehicleId() == id && v instanceof IRentable) {
                double rent = ((IRentable) v).calculateRent(days);
                System.out.println("Total Rent: ₹" + rent);
                return;
            }
        }
        System.out.println("Vehicle Not Found!");
    }

    // DELETE
    static void deleteVehicle() {
        System.out.print("Enter Vehicle ID to delete: ");
        int id = sc.nextInt();

        Iterator<Vehicle> itr = vehicles.iterator();
        while (itr.hasNext()) {
            if (itr.next().getVehicleId() == id) {
                itr.remove();
                System.out.println("Vehicle Removed Successfully!");
                return;
            }
        }
        System.out.println("Vehicle Not Found!");
    }
}
