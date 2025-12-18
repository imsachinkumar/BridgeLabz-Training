import java.util.Scanner;

public class QuotientRemainder {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        System.out.print("Enter first number: ");
        int num1=sc.nextInt();
        System.out.print("Enter second number: ");

        int num2=sc.nextInt();
        int qt=num1/num2;
        int rem=num1%num2;

        System.out.println("The Quotient is "+qt+" and Reminder is "+ rem+" of two number "+num1+" and "+num2);
        sc.close();
    }
}
