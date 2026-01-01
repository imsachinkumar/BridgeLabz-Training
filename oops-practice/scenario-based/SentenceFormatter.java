public class SentenceFormatter{
    static String formatParagraph(String text) {
        // Remove leading and trailing spaces
        text = text.trim();
        //Replace multiple spaces with a single space
        text = text.replaceAll("\\s+", " ");
        StringBuilder result = new StringBuilder();
        boolean capitalizeNext = true;
        //Traverse over each character
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);

            // Capitalize the first letter of a sentence
            if (capitalizeNext && Character.isLetter(ch)) {
                result.append(Character.toUpperCase(ch));
                capitalizeNext = false;
            } else {
                result.append(ch);
            }
            if (ch=='.'||ch=='?'||ch=='!') {
                capitalizeNext = true;

                // Skip extra spaces after punctuation
                if (i+1<text.length()&&text.charAt(i+1)!=' '){
                    result.append(" ");
                }
            }
        }
        return result.toString();
    }
    public static void main(String[] args) {
        String input = "hello   world.this is   a test!how are you ?i am fine.";
        String output = formatParagraph(input);
        System.out.println("Formatted Text:");
        System.out.println(output);
    }
}
