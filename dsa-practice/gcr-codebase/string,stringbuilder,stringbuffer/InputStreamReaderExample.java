import java.io.*;
public class InputStreamReaderExample{
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("sample.txt");
        // Convert byte stream to character stream
        InputStreamReader isr = new InputStreamReader(fis, "UTF-8");
        BufferedReader reader = new BufferedReader(isr);
        String line;

        while ((line=reader.readLine())!=null) {
            System.out.println(line);
        }
        reader.close();
    }
}
