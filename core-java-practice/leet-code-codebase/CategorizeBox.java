import java.util.Scanner;
public class CategorizeBox {
    public static String categorizeBox(int length, int width, int height, int mass) {

        boolean bulky = false;
        boolean heavy = false;

        long volume = 1L * length * width * height;
        if (length >= 10000 || width >= 10000 || height >= 10000 || volume >= 1000000000L) {
            bulky = true;
        }

        if (mass >= 100) {
            heavy = true;
        }

        if (bulky && heavy) return "Both";
        if (bulky) return "Bulky";
        if (heavy) return "Heavy";

        return "Neither";
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter length: ");
        int length = sc.nextInt();

        System.out.print("Enter width: ");
        int width = sc.nextInt();

        System.out.print("Enter height: ");
        int height = sc.nextInt();

        System.out.print("Enter mass: ");
        int mass = sc.nextInt();

        String result = categorizeBox(length, width, height, mass);

        System.out.println("Category: " + result);

        sc.close();
    }
}