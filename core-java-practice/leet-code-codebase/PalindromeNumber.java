import java.util.*;

public class PalindromeNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);//taking input
        int a=sc.nextInt();//taking number as input
        int org_num=a; // storing actual number
        int rev=0;     // variable to store reverse number

         // Using Loop to reverse the number
        while (a > 0) {
            int dgt=a%10;               // Last digit will get
            rev=rev*10+dgt;            // Adding digit to reverse
            a=a/10;                    // Removing last digit
        }
        // Now Checking palindrome condition
        if (org_num==rev) {
            System.out.println("Number is Palindrome");
        } else {
            System.out.println("Number is not Palindrome");
        }

    }
}
