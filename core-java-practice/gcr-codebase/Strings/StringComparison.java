import java.util.*;
public class StringComparison {
    public static boolean compareUsingCharAt(String s1, String s2) {
        if (s1.length() != s2.length()) {     // If lengths are different, strings cannot be equal
            return false;
        }
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                return false;
            }
        }
        return true; // If All characters matched
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first string: ");
        String str1 = sc.next();
        System.out.print("Enter second string: ");
        String str2 = sc.next();
        boolean charAtResult = compareUsingCharAt(str1, str2);  //comparison using CharAt
        boolean equalsResult = str1.equals(str2);               // using inbuilt func .equals
        System.out.println("\nResult using charAt() comparison: " + charAtResult);
        System.out.println("Result using equals() method: " + equalsResult);

        // Checking if both results are the same
        if (charAtResult == equalsResult) {
            System.out.println("Both comparison methods give the SAME result.");
        } else {
            System.out.println("Both comparison methods give DIFFERENT results.");
        }
        sc.close();
    }
}
