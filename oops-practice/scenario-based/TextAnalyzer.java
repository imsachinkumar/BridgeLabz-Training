import java.util.*;
public class TextAnalyzer {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        // Take paragraph input
        System.out.print("Enter paragraph: ");
        String paragraph=sc.nextLine();
        // Remove extra spaces from start and end
        paragraph=paragraph.trim();
        // Check empty input
        if (paragraph.length() == 0) {
            System.out.println("Paragraph is empty.");
            return;
        }
        // Split paragraph into words
        String[] words=paragraph.split(" ");
        int wordCount=0;
        String longestWord="";
        // Loop through words
        for (String word:words) {
            // Skip empty words caused by extra spaces
            if (word.length()==0) {
                continue;
            }
            wordCount++;
            // Find longest word
            if (word.length()>longestWord.length()) {
                longestWord=word;
            }
        }
        // Take replace words
        System.out.print("Word to replace: ");
        String oldWord=sc.nextLine();
        System.out.print("Replace with: ");
        String newWord=sc.nextLine();
        // Replace word manually
        String result="";
        for (String word:words){
            if (word.equalsIgnoreCase(oldWord)) {
                result=result+newWord+" ";
            } else {
                result=result+word+" ";
            }
        }
        System.out.println("Word Count: " + wordCount);
        System.out.println("Longest Word: " + longestWord);
        System.out.println("Updated Paragraph:");
        System.out.println(result.trim());
        sc.close();
    }
}
