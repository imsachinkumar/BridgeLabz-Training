import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class SearchEmployeeCSV {
    public static void main(String[] args) {

        String filePath = "employees1.csv";
        String searchName = "Priya";   // name to search
        boolean found = false;

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {

            String line;
            // Skip header row
            br.readLine();
            while ((line = br.readLine()) != null) {
                String[] data = line.split(",");
                String name = data[1];

                if (name.equalsIgnoreCase(searchName)) {

                    String department = data[2];
                    String salary = data[3];

                    System.out.println("Employee Found!");
                    System.out.println("Name       : " + name);
                    System.out.println("Department : " + department);
                    System.out.println("Salary     : " + salary);

                    found = true;
                    break; // stop searching once found
                }
            }

            if (!found) {
                System.out.println("Employee not found: " + searchName);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
