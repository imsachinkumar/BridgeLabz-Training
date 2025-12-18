import java.util.Scanner;

public class PowerCalculation {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking base number input

        System.out.print("Enter base number: ");
        int a = sc.nextInt();

        // Taking exponent input

        System.out.print("Enter power ");
        int n = sc.nextInt();

        int res = 1;

        // Loop to calculate power

        for (int i = 1; i <= n; i++) {
            res = res * a;
        }
        System.out.println(res);
    }
}
