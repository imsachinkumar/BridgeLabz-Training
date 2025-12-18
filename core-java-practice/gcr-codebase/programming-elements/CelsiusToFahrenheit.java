import java.util.Scanner;

public class CelsiusToFahrenheit {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking Celsius input from user

        System.out.print("Entering temperature ");
        double celsius = sc.nextDouble();
        double fahrenheit = (celsius * 9 / 5) + 32;

        System.out.println(fahrenheit);
    }
}
