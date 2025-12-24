import java.util.*;
public class CharArrayCompare {
    public static char[] getChars(String str) {       // Method to return characters of a string without using toCharArray()
        char[] arr = new char[str.length()];
        for (int i = 0; i < str.length(); i++) {
            arr[i] = str.charAt(i);
        }
        return arr;
    }
    public static boolean isSame(char[] a1, char[] a2) {       // Method to compare two character arrays
        if (a1.length != a2.length) { // if length differ array will not be equal
            return false;
        }
        for (int i = 0; i < a1.length; i++) {
            if (a1[i] != a2[i]) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.next();
        // Get characters using user-defined method
        char[] arr1 = getChars(str);
        char[] arr2 = str.toCharArray();   // Get characters using built-in method
        boolean result = isSame(arr1, arr2);          // Compare both character arrays
        System.out.println("Are both character arrays equal? " + result);
        sc.close();
    }
}
