import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class GenerateCSVFromDatabase {

    // Database details
    private static final String DB_URL = "jdbc:mysql://localhost:3306/companydb";
    private static final String DB_USER = "root";
    private static final String DB_PASSWORD = "password";

    public static void main(String[] args) {
        String csvFile = "employees5.csv";
        String query = "SELECT emp_id, name, department, salary FROM employees";

        try (
            // Connect to Database
            Connection conn = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(query);

            // Create CSV File
            BufferedWriter bw = new BufferedWriter(new FileWriter(csvFile))
        ) {

            //  Write CSV Header
            bw.write("Employee ID,Name,Department,Salary");
            bw.newLine();

            //  Write Records
            while (rs.next()) {

                int id = rs.getInt("emp_id");
                String name = rs.getString("name");
                String department = rs.getString("department");
                int salary = rs.getInt("salary");

                bw.write(id + "," + name + "," + department + "," + salary);
                bw.newLine();
            }

            System.out.println("CSV Report generated successfully!");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
