class HotelBooking{
    String guestName;
    String roomType;
    int nights;

    // Default constructor
    HotelBooking(){
        guestName="Guest";
        roomType="Standard";
        nights=1;
    }
    // Parameterized constructor
    HotelBooking(String g,String r,int n){
        guestName=g;
        roomType=r;
        nights=n;
    }
    // Copy constructor
    // Creates a new booking by copying another booking
    HotelBooking(HotelBooking hb){
        guestName=hb.guestName;
        roomType=hb.roomType;
        nights=hb.nights;
    }
    // Method to display booking details
    void displayBooking(){
        System.out.println("Guest Name: "+guestName);
        System.out.println("Room Type: "+roomType);
        System.out.println("Number of Nights: "+nights);
        System.out.println();
    }
    public static void main(String[] args){
        // Booking using default constructor
        HotelBooking b1=new HotelBooking();
        b1.displayBooking();
        // Booking using parameterized constructor
        HotelBooking b2=new HotelBooking("Rahul","Deluxe",3);
        b2.displayBooking();
        // Booking using copy constructor
        HotelBooking b3=new HotelBooking(b2);
        b3.displayBooking();
    }
}
