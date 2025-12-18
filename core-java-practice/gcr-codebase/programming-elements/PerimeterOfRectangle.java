import java.util.Scanner;

public class PerimeterOfRectangle {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Taking length input
        System.out.print("Enter length ");
        double length = sc.nextDouble();
        // Taking width input
        System.out.print("Enter width of the rectangle: ");
        double width = sc.nextDouble();
        double perimeter = 2 * (length + width);
        System.out.println(perimeter);
    }
}
