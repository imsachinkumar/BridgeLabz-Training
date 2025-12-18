import java.util.Scanner;
public class KmToMiles {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter distance");
        double km = sc.nextDouble();
        double miles = km / 1.6;
        System.out.println(miles);
        sc.close();
    }
}
