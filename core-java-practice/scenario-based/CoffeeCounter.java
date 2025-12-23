import java.util.*;
public class CoffeeCounter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final double GST = 0.05;        // 5% GST
        while (true) {
            System.out.print("\nEnter coffee type (espresso/latte/cappuccino) or 'exit': ");
            String coffee = sc.nextLine().toLowerCase();
            if (coffee.equals("exit")) break;
            System.out.print("Enter quantity: ");
            int qty = sc.nextInt();
            sc.nextLine();               // clear buffer
            double price = 0;

            // Select price using switch
            switch (coffee) {
                case "espresso": price = 120; break;
                case "latte": price = 150; break;
                case "cappuccino": price = 140; break;
                default:
                    System.out.println("Invalid coffee type");
                    continue;
            }
            double total = price * qty;              // Bill calculation
            double bill = total + (total * GST);
            System.out.println("Total Bill (with GST): ₹" + bill);
        }
        sc.close();
        System.out.println("Thank you! Visit again ☕");
    }
}
