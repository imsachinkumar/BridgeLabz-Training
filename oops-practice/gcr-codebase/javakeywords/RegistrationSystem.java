class Vehicle{
    // static variable common for all vehicles
    static double registrationFee=150.0;
    // final variable
    final String registrationNumber;
    String ownerName;
    String vehicleType;
    // constructor using this keyword
    Vehicle(String ownerName,String vehicleType,String registrationNumber){
        this.ownerName=ownerName;
        this.vehicleType=vehicleType;
        this.registrationNumber=registrationNumber;
    }
    // static method to update fee
    static void updateRegistrationFee(double newFee){
        registrationFee=newFee;
    }
    // method using instanceof to display details
    void displayDetails(Object obj){
        if(obj instanceof Vehicle){
            System.out.println("Owner Name: "+ownerName);
            System.out.println("Vehicle Type: "+vehicleType);
            System.out.println("Registration Number: "+registrationNumber);
            System.out.println("Registration Fee: $"+registrationFee);
        }
    }
}
public class RegistrationSystem{
    public static void main(String[] args){
        Vehicle v1=new Vehicle("Honest raj","Sedan","ABC123");
        Vehicle v2=new Vehicle("Price danish","SUV","XYZ789");
        v1.displayDetails(v1);
        System.out.println();
        v2.displayDetails(v2);
    }
}
