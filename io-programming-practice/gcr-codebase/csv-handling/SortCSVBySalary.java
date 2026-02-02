import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class SortCSVBySalary {

    // Employee class
    static class Employee {
        private int id;
        private String name;
        private String department;
        private int salary;

        public Employee(int id, String name, String department, int salary) {
            this.id = id;
            this.name = name;
            this.department = department;
            this.salary = salary;
        }

        // Getter methods
        public int getSalary() {
            return salary;
        }

        public String getName() {
            return name;
        }

        public String getDepartment() {
            return department;
        }
    }
    public static void main(String[] args) {

        String filePath = "employees3.csv";
        List<Employee> employees = new ArrayList<>();

        // READ CSV FILE
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {

            String line;

            // Skip header row
            br.readLine();

            while ((line = br.readLine()) != null) {

                String[] data = line.split(",");

                int id = Integer.parseInt(data[0]);
                String name = data[1];
                String department = data[2];
                int salary = Integer.parseInt(data[3]);

                employees.add(new Employee(id, name, department, salary));
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

        // SORT BY SALARY (DESCENDING)
        employees.sort(
                Comparator.comparingInt(Employee::getSalary).reversed()
        );

        // PRINT TOP 5 HIGHEST PAID EMPLOYEES
        System.out.println("Top 5 Highest Paid Employees:");

        for (int i = 0; i < Math.min(5, employees.size()); i++) {
            Employee e = employees.get(i);
            System.out.println(e.getName() + " | " + e.getDepartment() + " | Salary: " + e.getSalary());
        }
    }
}
