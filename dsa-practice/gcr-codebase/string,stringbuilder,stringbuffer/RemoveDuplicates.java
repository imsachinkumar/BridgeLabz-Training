import java.util.*;
public class RemoveDuplicates{
    public static void main(String[] args) {
        String input = "programming";
        // StringBuilder to store result without duplicates
        StringBuilder result = new StringBuilder();

        // HashSet to keep track of characters already added
        HashSet<Character> seen = new HashSet<>();
        for (int i = 0; i < input.length(); i++) {
            char currentChar = input.charAt(i);
            if (!seen.contains(currentChar)) {
                result.append(currentChar);
                seen.add(currentChar);
            }
        }
        // Convert StringBuilder to String
        String output = result.toString();
        System.out.println("String without duplicates: " + output);
    }
}
