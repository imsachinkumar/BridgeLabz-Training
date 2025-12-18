import java.util.Scanner;

public class KilometersToMiles {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking input

        System.out.print("Enter distance in kilometers: ");
        double kilometers = sc.nextDouble();
        double miles = kilometers * 0.621371;
        System.out.println(miles);
    }
}
