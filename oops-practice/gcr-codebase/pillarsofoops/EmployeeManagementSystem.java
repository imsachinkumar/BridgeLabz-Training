import java.util.*;
//interface
interface Department {
    void assignDepartment(String deptName);
    String getDepartmentDetails();
}
//abstract class
abstract class Employee implements Department {
    // Encapsulated fields
    private int employeeId;
    private String name;
    protected double baseSalary;
    private String department;
    // Constructor
    public Employee(int employeeId, String name, double baseSalary) {
        this.employeeId = employeeId;
        this.name = name;
        this.baseSalary = baseSalary;
    }
    // Abstract method (implemented by subclasses)
    public abstract double calculateSalary();
    // Concrete method
    public void displayDetails() {
        System.out.println("Employee ID : " + employeeId);
        System.out.println("Name     : " + name);
        System.out.println("Department : " + department);
        System.out.println("Salary     : " + calculateSalary());
    }
    // Getter methods (Encapsulation)
    public int getEmployeeId() {
        return employeeId;
    }
    public String getName() {
        return name;
    }
    // Interface method implementations
    public void assignDepartment(String deptName) {
        this.department = deptName;
    }
    public String getDepartmentDetails() {
        return department;
    }
}
//subclasses 
class FullTimeEmployee extends Employee {
    public FullTimeEmployee(int id, String name, double salary) {
        super(id, name, salary);
    }
    // Fixed salary calculation
    @Override
    public double calculateSalary() {
        return baseSalary;
    }
}
//subclass part-time employee
class PartTimeEmployee extends Employee {
    private int workHours;
    private double hourlyRate;
    public PartTimeEmployee(int id, String name, int hours, double rate) {
        super(id, name, 0);
        this.workHours = hours;
        this.hourlyRate = rate;
    }
    // Salary based on hours worked
    @Override
    public double calculateSalary() {
        return workHours * hourlyRate;
    }
}
public class EmployeeManagementSystem {
    public static void main(String[] args) {
        // Polymorphism 
        ArrayList<Employee> employeeList = new ArrayList<>();
        Employee emp1 = new FullTimeEmployee(101, "Rahul", 45000);
        emp1.assignDepartment("IT");
        Employee emp2 = new PartTimeEmployee(102, "Sneha", 90, 300);
        emp2.assignDepartment("HR");
        employeeList.add(emp1);
        employeeList.add(emp2);
        for (Employee emp : employeeList) {
            emp.displayDetails();
        }
    }
}
