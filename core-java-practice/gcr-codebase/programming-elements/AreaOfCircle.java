import java.util.Scanner;

public class AreaOfCircle {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking radius input from user

        System.out.print("Enter radius: ");
        double radius = sc.nextDouble();
         
        //using formula
        double area = Math.PI * radius * radius;

        System.out.println(area);

    }
}
