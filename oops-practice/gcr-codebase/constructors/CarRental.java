class CarRental{
    String customerName;
    String carModel;
    int rentalDays;
    double costPerDay=1500.0;

    // Default constructor
    CarRental(){
        customerName="Customer";
        carModel="Standard Model";
        rentalDays=1;
    }
    // Parameterized constructor
    CarRental(String c,String m,int d){
        customerName=c;
        carModel=m;
        rentalDays=d;
    }
    // Method to calculate total  cost
    double calculateTotalCost(){
        return rentalDays*costPerDay;
    }
    // Method to display  details
    void displayRentalDetails(){
        System.out.println("Customer Name: "+customerName);
        System.out.println("Car Model: "+carModel);
        System.out.println("Rental Days: "+rentalDays);
        System.out.println("Total Cost: "+calculateTotalCost());
        System.out.println();
    }
    public static void main(String[] args){
        // Rental using default constructor
        CarRental r1=new CarRental();
        r1.displayRentalDetails();
        // Rental using parameterized constructor
        CarRental r2=new CarRental("Suresh","Honda City",5);
        r2.displayRentalDetails();
    }
}
