class Device {//Superclass
    String deviceId;
    boolean status; // true = ON, false = OFF
    // Constructor to initialize device details
    Device(String deviceId, boolean status) {
        this.deviceId = deviceId;
        this.status = status;
    }
    // Method to display status
    void displayStatus() {
        System.out.println("Device ID : " + deviceId);
        System.out.println("Status  : " + (status ? "ON" : "OFF"));
    }
}
// Subclass
class Thermostat extends Device {
    // Specific attribute for Thermostat
    int temperatureSetting;
    // Constructor
    Thermostat(String deviceId, boolean status, int temperatureSetting) {
        super(deviceId, status); // call parent constructor
        this.temperatureSetting = temperatureSetting;
    }
    @Override
    void displayStatus() {
        super.displayStatus(); // show device details
        System.out.println("Temperature Setting : " + temperatureSetting + "°C");
    }
}
public class SmartHomeSystem {
    public static void main(String[] args) {
        // Creating Thermostat object
        Thermostat t1 = new Thermostat("TH-101", true, 24);
        t1.displayStatus();
    }
}
