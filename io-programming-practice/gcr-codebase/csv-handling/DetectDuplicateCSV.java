import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

public class DetectDuplicateCSV {
    public static void main(String[] args) {
        String filePath = "employees4.csv";

        // Set to track unique IDs
        Set<String> uniqueIds = new HashSet<>();
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {

            String line;
            // Skip header row
            br.readLine();

            System.out.println("Duplicate Records Found:");
            while ((line = br.readLine()) != null) {
                String[] data = line.split(",");
                String id = data[0];

                // If add() returns false → duplicate
                if (!uniqueIds.add(id)) {
                    System.out.println(line);
                }
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
