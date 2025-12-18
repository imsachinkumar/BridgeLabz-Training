import java.util.Scanner;

public class HandShake {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int stdnt = sc.nextInt();
        int ans = (stdnt * (stdnt - 1)) / 2;
        System.out.println("Maximum number of ans is " + ans);
        sc.close();
    }
}
