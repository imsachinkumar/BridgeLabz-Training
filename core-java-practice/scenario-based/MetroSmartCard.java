import java.util.*;
public class MetroSmartCard{
        public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        double balance=200;                // Initial smart card balance
        while(balance>0){
            System.out.println("Current Balance: ₹"+balance);
            System.out.print("Enter distance in km (or -1 to quit): ");
            int distance=sc.nextInt();
            if(distance==-1){              // Exit condition
                break;
            }
            // Fare calculation using ternary operator
            double fare=(distance<=5)?20:(distance<=10)?30:40;
            if(balance>=fare){               // Check sufficient balance
                balance=balance-fare;
                System.out.println("Fare deducted: ₹"+fare);
            }else{
                System.out.println("Insufficient balance");
                break;
            }
        }
        System.out.println("Remaining Balance: ₹"+balance);
        sc.close();
    }
}
