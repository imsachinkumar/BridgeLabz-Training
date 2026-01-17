import java.io.*;
public class ReadFileLineByLine {
    public static void main(String[] args) throws IOException {
        // File path
        FileReader fileReader = new FileReader("sample.txt");
        // Wrap FileReader with BufferedReader
        BufferedReader reader = new BufferedReader(fileReader);
        String line;
        while ((line = reader.readLine()) != null) {
            System.out.println(line);
        }
        reader.close();
    }
}
