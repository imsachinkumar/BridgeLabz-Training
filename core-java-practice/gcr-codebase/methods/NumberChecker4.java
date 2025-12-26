import java.util.*;
public class NumberChecker4{
    // Method to find sum of proper divisors
    static int sumOfProperDivisors(int num){
        int sum=0;
        for(int i=1;i<=num/2;i++){
            if(num%i==0) sum+=i;
        }
        return sum;
    }
    // Method to check if a number is perfect
    static boolean isPerfect(int num){
        return sumOfProperDivisors(num)==num;
    }
    // Method to check if a number is abundant
    static boolean isAbundant(int num){
        return sumOfProperDivisors(num)>num;
    }
    // Method to check if a number is deficient
    static boolean isDeficient(int num){
        return sumOfProperDivisors(num)<num;
    }
    // Method to calculate factorial
    static int factorial(int n){
        int fact=1;
        for(int i=1;i<=n;i++) fact*=i;
        return fact;
    }
    // Method to check if a number is strong
    static boolean isStrong(int num){
        int sum=0,temp=num;
        while(temp!=0){
            int d=temp%10;
            sum+=factorial(d);
            temp/=10;
        }
        return sum==num;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num=sc.nextInt();
        System.out.println("Is Perfect Number: "+isPerfect(num));
        System.out.println("Is Abundant Number: "+isAbundant(num));
        System.out.println("Is Deficient Number: "+isDeficient(num));
        System.out.println("Is Strong Number: "+isStrong(num));
        sc.close();
    }
}
