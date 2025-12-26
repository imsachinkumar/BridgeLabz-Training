import java.util.*;
public class SimpleInterestCalculator{

    //Method to caclculate simple interest
    public static double calculateSimpleInterest(double principal,double rate,double time){
        return(principal*rate*time)/100;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Principal: "); //Input for Principle
        double principal=sc.nextDouble();
        System.out.print("Enter Rate of Interest: ");//Input for Rate
        double rate=sc.nextDouble();
        System.out.print("Enter Time: ");//Input for Time
        double time=sc.nextDouble();

        double si=calculateSimpleInterest(principal,rate,time); //Calling
        System.out.println("The Simple Interest is "+si+ " for Principal "+principal+ ", Rate of Interest "+rate+" and Time "+time);
        sc.close();
    }
}
