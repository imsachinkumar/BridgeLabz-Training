import java.util.Scanner;
public class Program {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first word");
        String first = sc.nextLine();

        // Validation: more than one word
        if (first.contains(" ")) {
            System.out.println(first + " is an invalid word");
            return;
        }
        System.out.println("Enter the second word");
        String second = sc.nextLine();

        // Validation: more than one word
        if (second.contains(" ")) {
            System.out.println(second + " is an invalid word");
            return;
        }

        // Check if second is reverse of first (case insensitive)
        String reversedFirst = "";
        for (int i = first.length() - 1; i >= 0; i--) {
            reversedFirst = reversedFirst + first.charAt(i);
        }

        if (reversedFirst.equalsIgnoreCase(second)) {

            // Reverse, lowercase, replace vowels with '@'
            String result = "";
            for (int i = 0; i < reversedFirst.length(); i++) {
                char ch = Character.toLowerCase(reversedFirst.charAt(i));
                if (isVowel(ch)) {
                    result = result + "@";
                } else {
                    result = result + ch;
                }
            }
            System.out.println(result);

        } else {

            // Combine and convert to uppercase
            String combined = (first + second).toUpperCase();

            int vowelCount = 0;
            int consonantCount = 0;

            for (int i = 0; i < combined.length(); i++) {
                char ch = combined.charAt(i);
                if (isVowel(ch)) {
                    vowelCount++;
                } else if (Character.isLetter(ch)) {
                    consonantCount++;
                }
            }

            if (vowelCount > consonantCount) {
                printFirstTwoUniqueVowels(combined);
            } else if (consonantCount > vowelCount) {
                printFirstTwoUniqueConsonants(combined);
            } else {
                System.out.println("Vowels and consonants are equal");
            }
        }

        sc.close();
    }
    static boolean isVowel(char ch) {
        return ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U'
            || ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
    }

    // Print first two unique vowels
    static void printFirstTwoUniqueVowels(String word) {
        String result = "";
        for (int i = 0; i < word.length() && result.length() < 2; i++) {
            char ch = word.charAt(i);
            if (isVowel(ch) && result.indexOf(ch) == -1) {
                result = result + ch;
            }
        }
        System.out.println(result);
    }

    // Print first two unique consonants
    static void printFirstTwoUniqueConsonants(String word) {
        String result = "";
        for (int i = 0; i < word.length() && result.length() < 2; i++) {
            char ch = word.charAt(i);
            if (!isVowel(ch) && Character.isLetter(ch) && result.indexOf(ch) == -1) {
                result = result + ch;
            }
        }
        System.out.println(result);
    }
}
