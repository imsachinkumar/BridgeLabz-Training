import java.util.InputMismatchException;
import java.util.Scanner;

public class DivisionExample {
    public static void main(String[] args) {
        // Input
        Scanner sc = new Scanner(System.in);
       //try block
        try {
            System.out.print("Enter numerator: ");
            int a = sc.nextInt();

            System.out.print("Enter denominator: ");
            int b = sc.nextInt();

            int result = a / b;
            System.out.println("Result: " + result);
        //multiple catch block

        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero");

        } catch (InputMismatchException e) {
            System.out.println("Please enter numeric values only");

            // Finally block
        } finally {
            sc.close();
        }
    }
}
