import java.util.Scanner;

public class SimpleInterest {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Taking principal amount
        System.out.print("Enter principal amount: ");
        double principal = sc.nextDouble();
        // Taking rate
        System.out.print("Enter rate: ");
        double rate = sc.nextDouble();
        // Taking time period
        System.out.print("Enter time ");
        double time = sc.nextDouble();
        double si = (principal * rate * time) / 100;
        System.out.println(si);
    }
}
