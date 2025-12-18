import java.util.Scanner;

public class HeightConversion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter height ");
        double ht = sc.nextDouble();
        double total = ht / 2.54;
        int feet = (int) (total / 12);
        double inches = total % 12;
        System.out.println("Your Height in cm is " + ht + " while in feet is " + feet +" and inches is " + inches);
        sc.close();
    }
}
