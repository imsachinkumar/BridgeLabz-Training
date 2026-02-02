import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ReadLargeCSVInChunks {

    private static final int CHUNK_SIZE = 100;
    public static void main(String[] args) {

        String filePath = "large_file.csv"; // 500MB+ CSV
        int totalRecordsProcessed = 0;
        List<String> chunk = new ArrayList<>(CHUNK_SIZE);

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {

            String line;
            // Skip header row
            br.readLine();

            while ((line = br.readLine()) != null) {
                chunk.add(line);

                // Process chunk when size reaches 100
                if (chunk.size() == CHUNK_SIZE) {
                    processChunk(chunk);
                    totalRecordsProcessed += chunk.size();
                    chunk.clear(); // VERY IMPORTANT (free memory)
                }
            }

            // Process remaining lines (<100)
            if (!chunk.isEmpty()) {
                processChunk(chunk);
                totalRecordsProcessed += chunk.size();
                chunk.clear();
            }
            System.out.println("Total Records Processed: " + totalRecordsProcessed);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Simulate processing of 100 lines
    private static void processChunk(List<String> chunk) {
        System.out.println("Processed batch of " + chunk.size() + " records");
        
    }
}
