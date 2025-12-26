import java.util.*;
public class GcdLcmCalculator{
    //Method to calculate GCD
    static int gcd(int a,int b){
        while(b!=0){
            int t=a%b;
            a=b;
            b=t;
        }
        return a;
    }
    //Method to calculate LCM
    static int lcm(int a,int b){
        return (a*b)/gcd(a,b);
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter first number: ");
        int x=sc.nextInt();
        System.out.print("Enter second number: ");
        int y=sc.nextInt();
        System.out.println("GCD: "+gcd(x,y));
        System.out.println("LCM: "+lcm(x,y));
        sc.close();
    }
}
