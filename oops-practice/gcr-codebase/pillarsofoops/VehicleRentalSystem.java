import java.util.*;
// Interface
interface Insurable {
    double calculateInsurance();
}
// Abstract class
abstract class Vehicle{
    // Encapsulation
    private String number;          
    protected double rate;
    Vehicle(String number, double rate) {
        this.number = number;
        this.rate = rate;
    }
    // Abstract method
    abstract double calculateRentalCost(int days);
    void show() {
        System.out.println("Vehicle No: " + number);
    }
}
// Car
class Car extends Vehicle implements Insurable {
    private String policyNo;
    Car(String n, double r, String p) {
        super(n, r);
        policyNo = p;
    }
    public double calculateRentalCost(int d) {
        return rate * d;
    }
    public double calculateInsurance() {
        return 500;
    }
}
// Bike
class Bike extends Vehicle implements Insurable {
    private String policyNo;
    Bike(String n, double r, String p) {
        super(n, r);
        policyNo = p;
    }
    public double calculateRentalCost(int d) {
        return rate * d;
    }
    public double calculateInsurance() {
        return 200;
    }
}
// Truck
class Truck extends Vehicle implements Insurable {
    private String policyNo;
    Truck(String n, double r, String p) {
        super(n, r);
        policyNo = p;
    }
    public double calculateRentalCost(int d) {
        return rate * d + 1000;
    }
    public double calculateInsurance() {
        return 1000;
    }
}
public class VehicleRentalSystem{
    public static void main(String[] args) {
// Polymorphism with Collection
        List<Vehicle> list=new ArrayList<>();
        list.add(new Car("C101", 1500, "CP01"));
        list.add(new Bike("B202", 500, "BP02"));
        list.add(new Truck("T303", 3000, "TP03"));
        for (Vehicle v : list) {
            v.show();
            System.out.println("Rental: " + v.calculateRentalCost(3));
            System.out.println("Insurance: " + ((Insurable) v).calculateInsurance());
        }
    }
}
