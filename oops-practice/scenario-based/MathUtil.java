public class MathUtil {// Utility class for mathematical operations
    static long factorial(int n) {
        if (n < 0) return -1;
        long f = 1;
        for (int i = 1; i <= n; i++) f *= i;
        return f;
    }
// Check if a number is prime
    static boolean isPrime(int n) {
        if (n <= 1) return false;
        for (int i = 2; i <= n / 2; i++)
            if (n % i == 0) return false;
        return true;
    }
// Calculate GCD of two numbers
    static int gcd(int a, int b) {
        a = Math.abs(a);
        b = Math.abs(b);
        while (b != 0) {
            int t = a % b;
            a = b;
            b = t;
        }
        return a;
    }
// Calculate nth Fibonacci number
    static int fibonacci(int n) {
        if (n < 0) return -1;
        if (n <= 1) return n;
        int a = 0, b = 1;
        for (int i = 2; i <= n; i++) {
            int c = a + b;
            a = b;
            b = c;
        }
        return b;
    }
    public static void main(String[] args) {
        System.out.println(factorial(5));
        System.out.println(isPrime(7));
        System.out.println(gcd(12, 18));
        System.out.println(fibonacci(6));
    }
}
