import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class MergeCSVFiles {

    public static void main(String[] args) {
        String file1 = "students3.csv";
        String file2 = "students4.csv";
        String outputFile = "merged_students34.csv";

        // Map to store ID -> "Marks,Grade"
        Map<String, String> marksMap = new HashMap<>();

        // READ students2.csv (ID,Marks,Grade)
        try (BufferedReader br2 = new BufferedReader(new FileReader(file2))) {

            String line;
            br2.readLine(); // skip header

            while ((line = br2.readLine()) != null) {
                String[] data = line.split(",");
                String id = data[0];
                String marksAndGrade = data[1] + "," + data[2];
                marksMap.put(id, marksAndGrade);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

        // READ students1.csv and WRITE merged file
        try (
            BufferedReader br1 = new BufferedReader(new FileReader(file1));
            BufferedWriter bw = new BufferedWriter(new FileWriter(outputFile))
        ) {

            String line;

            // Write header
            bw.write("ID,Name,Age,Marks,Grade");
            bw.newLine();

            br1.readLine(); // skip header

            while ((line = br1.readLine()) != null) {

                String[] data = line.split(",");
                String id = data[0];
                String name = data[1];
                String age = data[2];

                // Get marks & grade using ID
                String marksGrade = marksMap.get(id);

                if (marksGrade != null) {
                    bw.write(id + "," + name + "," + age + "," + marksGrade);
                    bw.newLine();
                }
            }

            System.out.println("CSV files merged successfully!");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
