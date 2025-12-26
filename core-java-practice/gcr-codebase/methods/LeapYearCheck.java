import java.util.*;
public class LeapYearCheck{
    static boolean isLeapYear(int year){  //Method to check leap year
        if(year>=1582){
            if((year%4==0 && year%100!=0) || year%400==0){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter year: ");
        int year=sc.nextInt();
        if(isLeapYear(year)){
            System.out.println("Year is a Leap Year");
        }else{
            System.out.println("Year is not a Leap Year");
        }
        sc.close();
    }
}
