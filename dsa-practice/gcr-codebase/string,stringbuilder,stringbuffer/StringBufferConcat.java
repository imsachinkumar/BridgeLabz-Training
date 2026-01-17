public class StringBufferConcat{
    public static void main(String[] args) {
        String[] words = {"Java", " ", "is", " ", "powerful"};
        // Create StringBuffer object
        StringBuffer buffer = new StringBuffer();

        // Append each string to StringBuffer
        for (String word : words) {
            buffer.append(word);
        }
        System.out.println(buffer.toString());
    }
}
