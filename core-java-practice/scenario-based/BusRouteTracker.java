import java.util.*;
public class BusRouteTracker{
    // Method to calculate total distance
    static void trackDistance(){
        Scanner sc=new Scanner(System.in); 
        double totalDistance=0;
        System.out.println("Bus Route Distance Tracker Started");
        while(true){
            System.out.print("Enter distance covered at this stop (in km): ");
            double stopDistance=sc.nextDouble();
            totalDistance+=stopDistance;
            System.out.println("Total distance so far: "+totalDistance+" km");
            System.out.print("Do you want to get off? (yes/no): ");
            sc.nextLine();
            String choice=sc.nextLine().toLowerCase();
            if(choice.equals("yes")){
                break;
            }
        }
        // Final distance after journey ends

        System.out.println("Journey ended. Total distance traveled: "+totalDistance+" km");
        sc.close();
    }
    public static void main(String[] args){
        trackDistance(); // call tracking method
    }
}
