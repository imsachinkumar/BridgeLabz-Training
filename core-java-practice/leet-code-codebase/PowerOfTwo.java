public class PowerOfTwo {
    public static void main(String[] args) {
        int n = 5;   // power
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result = result * 2;
        }
        System.out.println("2^" + n + " = " + result);
    }
}
