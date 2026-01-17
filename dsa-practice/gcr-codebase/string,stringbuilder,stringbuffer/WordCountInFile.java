import java.io.*;
public class WordCountInFile {
    public static void main(String[] args) throws IOException {
        String targetWord = "java";
        int count = 0;
        BufferedReader reader = new BufferedReader(new FileReader("sample.txt"));
        String line;

        while ((line = reader.readLine()) != null) {
            String[] words = line.split("\\s+");
            for (String word : words) {
                if (word.equalsIgnoreCase(targetWord)) {
                    count++;
                }
            }
        }
        reader.close();
        System.out.println("Word count: " + count);
    }
}
