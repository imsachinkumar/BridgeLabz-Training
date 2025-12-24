import java.util.Scanner;
public class SubstringCompare {
    public static String makeSub(String str, int start, int end) {
        String sub = "";
        for (int i = start; i < end; i++) {           // Build substring character by character
            sub = sub + str.charAt(i);
        }
        return sub;
    }
    // Compare two strings using charAt()
    public static boolean checkEqual(String s1, String s2) {
        if (s1.length() != s2.length()) {          // If lengths differ, strings are not equal
            return false;
        }
        for (int i = 0; i < s1.length(); i++) {           // Compare characters one by one
            if (s1.charAt(i) != s2.charAt(i)) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string: ");
        String str = sc.next();
        System.out.print("Enter start index: ");
        int start = sc.nextInt();
        System.out.print("Enter end index: ");
        int end = sc.nextInt();

        String sub1 = makeSub(str, start, end);            // Substring using charAt()
        String sub2 = str.substring(start, end);
        boolean same = checkEqual(sub1, sub2);           // Compare both substrings
        System.out.println("\nSubstring using charAt(): " + sub1);
        System.out.println("Substring using substring(): " + sub2);
        System.out.println("Both substrings are equal: " + same);
        sc.close();
    }
}
