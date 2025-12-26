import java.util.*;
public class TemperatureConverter{
    //Method to convert Celsius to Fahrenheit

    static double cToF(double c){
        return (c*9/5)+32;
    }
    //Method to convert Fahrenheit to Celsius
    static double fToC(double f){
        return (f-32)*5/9;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("1.Celsius to Fahrenheit");
        System.out.println("2.Fahrenheit to Celsius");
        System.out.print("Choose option: ");
        int ch=sc.nextInt();
        System.out.print("Enter temperature: ");
        double t=sc.nextDouble();
        if(ch==1) System.out.println("Result: "+cToF(t));
        else if(ch==2) System.out.println("Result: "+fToC(t));
        else System.out.println("Invalid choice");
        sc.close();
    }
}
