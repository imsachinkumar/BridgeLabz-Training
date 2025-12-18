import java.util.Scanner;

public class PurchasePrice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter unit price: ");
        double up = sc.nextDouble();
        System.out.print("Enter quantity: ");
        int qt = sc.nextInt();
        double total = up * qt;
        System.out.println("The total purchase price is INR " + total +" if the qt " + qt +" and unit price is INR " + up);
        sc.close();
    }
}
