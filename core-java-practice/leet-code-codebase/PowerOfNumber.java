public class PowerOfNumber {
    public static void main(String[] args) {
        int base = 2;
        int exponent = 5;
        int result = 1;
        //for loop
        for (int i = 1; i <= exponent; i++) {
            result = result * base;
        }
        //printing result
        System.out.println("Power = " + result);
    }
}
