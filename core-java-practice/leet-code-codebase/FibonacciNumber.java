import java.util.*;

public class FibonacciNumber{

    public static int fibonacci(int n) { //method for calculating fibonacci
        if (n == 0) return 0;  // Fibonacci of 0 is 0
        if (n == 1) return 1;  // Fibonacci of 1 is 1
        int a = 0;  // First Fibonacci number
        int b = 1;  // Second Fibonacci number
        int fib = 0; // To store current Fibonacci number

        // using for Loop to calculate Fibonacci from 2 to n

        for (int i = 2; i <= n; i++) {
            fib = a + b;  // Current Fibonacci will be sum of previous two
            a = b;        // Move next as  previous becomes current
            b = fib;      // Now Current becomes next previous
        }

        return fib; // Return answer
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int res = fibonacci(n);
        System.out.println(res);

    }
}
