public class MovieTicket{
    String movieName;
    String seatNumber;
    double price;
    boolean booked=false;
    //Method to check ticket is booked or not
    void bookTicket(String movie,String seat,double cost){
        if(booked){
            System.out.println("House full!!! sorry..... Ticket already booked");
        }else{
            movieName=movie;
            seatNumber=seat;
            price=cost;
            booked=true;
            System.out.println("Ticket booked for movie: "+movieName);
            System.out.println("Seat Number: "+seatNumber);
        }
    }
   //Method to display TicketInfo
    void display(){
        if(!booked){
            System.out.println("Ticket have not booked yet....");
        }else{
            System.out.println("Price: $"+price);
        }
    }
    public static void main(String[] args){
         //Creating Objects
        MovieTicket t=new MovieTicket();
        t.display();
        t.bookTicket("Dragon","A10",120);
        t.bookTicket("Dragon","A10",120);
        t.bookTicket("Dragon","A10",120);
        t.display();
    }
}
