import java.util.*;
public class NumberChecker3{
    // Method to check if a number is prime
    static boolean isPrime(int num){
        if(num<=1) return false;
        for(int i=2;i*i<=num;i++){
            if(num%i==0) return false;
        }
        return true;
    }
    // Method to check if a number is a neon number
    static boolean isNeon(int num){
        int square=num*num;
        int sum=0;
        while(square!=0){
            sum+=square%10;
            square/=10;
        }
        return sum==num;
    }
    // Method to check if a number is a spy number
    static boolean isSpy(int num){
        int sum=0,product=1,temp=num;
        while(temp!=0){
            int d=temp%10;
            sum+=d;
            product*=d;
            temp/=10;
        }
        return sum==product;
    }
    // Method to check if a number is automorphic
    static boolean isAutomorphic(int num){
        int square=num*num;
        String numStr=String.valueOf(num);
        String squareStr=String.valueOf(square);
        return squareStr.endsWith(numStr);
    }
    // Method to check if a number is buzz number
    static boolean isBuzz(int num){
        return num%7==0 || num%10==7;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num=sc.nextInt();
        System.out.println("Is Prime: "+isPrime(num));
        System.out.println("Is Neon: "+isNeon(num));
        System.out.println("Is Spy: "+isSpy(num));
        System.out.println("Is Automorphic: "+isAutomorphic(num));
        System.out.println("Is Buzz: "+isBuzz(num));
        sc.close();
    }
}
