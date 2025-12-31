class Vehicle{
    String ownerName;
    String vehicleType;
    // Class variable
    static double registrationFee=2000.0;
    // Constructor to initialize vehicle details
    Vehicle(String owner,String type){
        ownerName=owner;
        vehicleType=type;
    }
    // Instance method to display vehicle details
    void displayDetails(){
        System.out.println("Owner Name: "+ownerName);
        System.out.println("Vehicle Type: "+vehicleType);
        System.out.println("Registration Fee: ₹"+registrationFee);
        System.out.println();
    }
    // Class method to update fee
    static void updateFee(double newFee){
        registrationFee=newFee;
    }
    public static void main(String[] args){
        Vehicle v1=new Vehicle("Amit","Car");
        Vehicle v2=new Vehicle("Neha","Bike");
        v1.displayDetails();
        v2.displayDetails();
        Vehicle.updateFee(2500.0);
        v1.displayDetails();
        v2.displayDetails();
    }
}
