public class CourseFeeDiscount {
    public static void main(String[] args) {
        double fee = 125000;
        double dp = 10;
        double d = (fee * dp) / 100;
        double f = fee - d;
        System.out.println("The discount amount is INR " + d);
        System.out.println("Final discounted fee is INR " + f);
    }
}
