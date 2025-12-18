public class DividePens {
    public static void main(String[] args) {
        int total = 14;
        int std = 3;
        int each = total / std;
        int rm = total % std;
        System.out.println("Each student will get: " + each);
        System.out.println("Remaining pens: " + rm);
    }
}
