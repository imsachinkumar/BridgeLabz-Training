import java.io.*;
public class ChallengeComparison {
    public static void main(String[] args) throws Exception {
        int count = 1_000_000;
        //StringBuilder
        long sbStart = System.nanoTime();
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < count; i++) {
            sb.append("hello");
        }

        long sbEnd = System.nanoTime();
        System.out.println("StringBuilder Time: " + (sbEnd - sbStart));
        //StringBuffer
        long sfStart = System.nanoTime();
        StringBuffer sf = new StringBuffer();

        for (int i = 0; i < count; i++) {
            sf.append("hello");
        }

        long sfEnd = System.nanoTime();
        System.out.println("StringBuffer Time: " + (sfEnd - sfStart));

        //File Reading
        BufferedReader reader =
                new BufferedReader(new FileReader("largefile.txt"));

        int wordCount = 0;
        String line;

        while ((line = reader.readLine()) != null) {
            wordCount += line.split("\\s+").length;
        }
        reader.close();
        System.out.println("Total Words: " + wordCount);
    }
}
