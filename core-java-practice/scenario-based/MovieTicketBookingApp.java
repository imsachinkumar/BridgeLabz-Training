import java.util.*;
public class MovieTicketBookingApp{
    // Method to get base price 
    public static int getMoviePrice(String movieType){
        int price=0;
        switch(movieType){
            case "action": price=200; break;
            case "comedy": price=180; break;
            case "drama": price=160; break;
            default: price=0;
        }
        return price;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        while(true){
            System.out.print("\nEnter movie type or exit: ");
            String movieType=sc.nextLine().toLowerCase();     //converting to lowewer case
            if(movieType.equals("exit")){
                break;
            }
            int basePrice=getMoviePrice(movieType);
            if(basePrice==0){
                System.out.println("Invalid movie type.");
                continue;
            }
            System.out.print("Enter seat type (gold/silver): ");
            String seatType=sc.nextLine().toLowerCase();
            int seatCharge=0;
            if(seatType.equals("gold")){
                seatCharge=100;
            }else if(seatType.equals("silver")){
                seatCharge=50;
            }else{
                System.out.println("Invalid seat type.");
                continue;
            }
            System.out.print("Do you want snacks? (yes/no): ");
            String snacks=sc.nextLine().toLowerCase();
            int snackCharge=0;
            if(snacks.equals("yes")){
                snackCharge=80;
            }

            int totalBill=basePrice+seatCharge+snackCharge;
            System.out.println(" Booking Summary->");
            System.out.println("Movie: "+movieType);
            System.out.println("Seat: "+seatType);
            System.out.println("Snacks: "+snacks);
            System.out.println("Total Amount: ₹"+totalBill);
        }
        sc.close();
        System.out.println("Booking closed. Thank you!");
    }
}
