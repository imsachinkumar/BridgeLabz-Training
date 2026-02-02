import java.io.FileWriter;
import java.io.IOException;

public class WriteCSVExample {

    public static void main(String[] args) {
        String filePath = "employees.csv";
        try (FileWriter writer = new FileWriter(filePath)) {

            // Writing header
            writer.write("ID,Name,Department,Salary\n");

            // Writing employee records
            writer.write("101,Rahul,IT,55000\n");
            writer.write("102,Priya,HR,48000\n");
            writer.write("103,Amit,Finance,60000\n");
            writer.write("104,Neha,Marketing,52000\n");
            writer.write("105,Rohit,Operations,50000\n");

            System.out.println("CSV file created and data written successfully!");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
