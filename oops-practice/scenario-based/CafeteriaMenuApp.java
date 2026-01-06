import java.util.*;
public class CafeteriaMenuApp {
    // Method to display cafeteria menu
    public static void displayMenu(String[] items) {
        System.out.println("----- Cafeteria Menu -----");
        for (int i=0;i<items.length;i++) {
            System.out.println(i + " : " + items[i]);
        }
    }
    // Method to get item by index
    public static String getItemByIndex(String[] items, int index) {
        if (index>=0&&index<items.length) {
            return items[index];
        }
        return "Invalid selection";
    }
    public static void main(String[] args) {
        // Array of 10 fixed items
        String[] menuItems={
            "Veg Sandwich", "Cheese Burger", "Pizza Slice",
            "Pasta", "Fried Rice", "Noodles",
            "Coffee", "Tea", "Juice", "Ice Cream"
        };
        Scanner sc=new Scanner(System.in);
        displayMenu(menuItems);
        System.out.print("Select item index: ");
        int choice = sc.nextInt();
        String selectedItem=getItemByIndex(menuItems, choice);
        System.out.println("You selected: " + selectedItem);
        sc.close();
    }
}
