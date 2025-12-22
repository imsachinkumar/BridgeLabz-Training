import java.util.Scanner;

public class UniqueCharacters {
    static int stringLength(String str) {
        int count = 0;
        try {
            while (true) {
                str.charAt(count);
                count++;
            }
        } catch (IndexOutOfBoundsException e) {}
        return count;
    }
    // Method to find unique characters
    static char[] findUniqueCharacters(String str) {
        int n = stringLength(str);
        char[] temp = new char[n];
        int index = 0;

        for (int i = 0; i < n; i++) {
            char ch = str.charAt(i);
            boolean unique = true;
            for (int j = 0; j < i; j++) {
                if (str.charAt(j) == ch) {
                    unique = false;
                    break;
                }
            }
            if (unique) temp[index++] = ch;
        }

        char[] result = new char[index];
        for (int i = 0; i < index; i++) result[i] = temp[i];
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String text = sc.nextLine();
        char[] uniques = findUniqueCharacters(text);
        System.out.print("Unique characters: ");
        for (char c : uniques) System.out.print(c + " ");
        sc.close();
    }
}
