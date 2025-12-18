import java.util.Scanner;

public class StudentFeeDiscount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Fee: ");
        double fee = sc.nextDouble();

        System.out.print("Enter Discount Percentage: ");
        double dp = sc.nextDouble();
        double dsc = (fee * dp) / 100;
        double finalFee = fee - dsc;
        System.out.println( dsc +" "+ finalFee);
        sc.close();
    }
}
