import java.util.Scanner;

public class AgeOfHarry {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter birth year: ");
        int birthYr = sc.nextInt();

        int currYr = 2024; 
        int age = currYr - birthYr;

        System.out.println("Age is: "+ age);
    }
}
