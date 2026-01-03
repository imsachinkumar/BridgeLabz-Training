// Superclass
class Vehicle {
    int maxSpeed;
    String model;
    Vehicle(int maxSpeed, String model) {
        this.maxSpeed = maxSpeed;
        this.model = model;
    }
}
// Interface
interface Refuelable {
    void refuel();
}
// ElectricVehicle subclass
class ElectricVehicle extends Vehicle {
    ElectricVehicle(int maxSpeed, String model) {
        super(maxSpeed, model);
    }
    void charge() {
        System.out.println("Electric vehicle is charging");
    }
}
// PetrolVehicle subclass
class PetrolVehicle extends Vehicle implements Refuelable {
    PetrolVehicle(int maxSpeed, String model) {
        super(maxSpeed, model);
    }
    public void refuel() {
        System.out.println("Petrol vehicle is being refueled");
    }
}
public class VehicleManagement {
    public static void main(String[] args) {
        //Creating Object
        ElectricVehicle ev = new ElectricVehicle(160, "Tesla Model 3");
        PetrolVehicle pv = new PetrolVehicle(180, "Honda City");
        ev.charge();
        pv.refuel();
    }
}
