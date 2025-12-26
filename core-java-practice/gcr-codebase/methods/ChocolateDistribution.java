import java.util.*;
public class ChocolateDistribution {
    public static int[] findRemainderAndQuotient(int chocolates, int children) {      // Method to calculate quotient and remainder
        return new int[] {
            chocolates / children, // chocolates each child gets
            chocolates % children  // remaining chocolates
        };
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter chocolates: ");
        int c = sc.nextInt();
        System.out.print("Enter children: ");
        int ch = sc.nextInt();
        int[] r = findRemainderAndQuotient(c, ch);//calling method
        System.out.println("Each child gets: " + r[0]);
        System.out.println("Remaining chocolates: " + r[1]);
        sc.close();
    }
}
