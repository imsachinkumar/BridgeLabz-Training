import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class CountCSVRows {
    public static void main(String[] args) {
        String filePath = "employees.csv";
        int recordCount = 0;

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            // Skip header row
            br.readLine();
            // Read remaining lines
            while ((line = br.readLine()) != null) {
                recordCount++;
            }

            System.out.println("Total Records (excluding header): " + recordCount);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
