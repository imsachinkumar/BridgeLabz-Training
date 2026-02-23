import java.util.Scanner;

public class ReversedString{
    public static String reverseWords(String s) {

        String[] arr = s.split(" ");
        String[] arr1 = new String[arr.length];

        int j = 0;

        for (int i = 0; i < arr.length; i++) {
            StringBuilder sb = new StringBuilder(arr[i]);
            arr1[j] = sb.reverse().toString();
            j++;
        }

        return String.join(" ", arr1);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String input = sc.nextLine();

        String result = reverseWords(input);

        System.out.println("Reversed Words: " + result);

        sc.close();
    }
}