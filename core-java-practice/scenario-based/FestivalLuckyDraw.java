import java.util.*;
public class FestivalLuckyDraw{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Festival Lucky Draw Started");
        System.out.println("Enter a positive number for each visitor (0 to exit)");
        while(true){
            System.out.print("Draw a number: ");
            if(!sc.hasNextInt()){
                System.out.println("Invalid input! Please enter a number.");
                sc.next();
                continue; // skip this round if input is invalid
            }
            int num=sc.nextInt();
            if(num==0){
                break; // exit loop
            }
            if(num<=0){
                System.out.println("Please enter a positive number.");
                continue;
            }
            if(num%3==0&&num%5==0){
                System.out.println("Congratulations! You win a gift!");
            }else{
                System.out.println("Better luck next time!");
            }
        }
        System.out.println("Lucky Draw ended. Happy Diwali!");
        sc.close();
    }
}
