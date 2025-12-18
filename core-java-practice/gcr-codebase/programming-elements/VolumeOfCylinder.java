import java.util.Scanner;

public class VolumeOfCylinder {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Taking radius input
        System.out.print("Enter radius :");
        double radius = sc.nextDouble();
        System.out.print("Enter height of the cylinder: ");// Taking height input
        double height = sc.nextDouble();
        // Formula
        double volume = Math.PI * radius * radius * height;
        System.out.println(volume);
    }
}
