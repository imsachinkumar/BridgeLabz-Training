public class SearchWord{
    // Method to find first sentence containing the word
    public static String findSentence(String[] sentences, String word) {
        for (String sentence : sentences) {
            // Check if sentence contains the given word
            if (sentence.contains(word)) {
                return sentence;
            }
        }
        // If word not found in any sentence
        return "Not Found";
    }
    public static void main(String[] args) {
        String[] sentences = {
                "Java is easy",
                "Learning algorithms",
                "Binary search is fast"
        };
        String result = findSentence(sentences, "search");
        System.out.println(result);
    }
}
