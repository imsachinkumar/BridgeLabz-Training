class Employee {
    String name;
    int id;
    double salary;
    // Constructor to initialize details
    Employee(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }
    void displayDetails() {
        System.out.println("Name : " + name);
        System.out.println("ID   : " + id);
        System.out.println("Salary: " + salary);
    }
}
//Subclass
class Manager extends Employee {
    int teamSize; // unique attribute
    Manager(String name, int id, double salary, int teamSize) {
        super(name, id, salary);
        this.teamSize = teamSize;
    }
    @Override
    void displayDetails() {
        super.displayDetails(); // call parent method
        System.out.println("Team Size : " + teamSize);
        System.out.println("Role    : Manager");
    }
}
// Developer subclass
class Developer extends Employee {
    String PLanguage; // unique attribute

    Developer(String name, int id, double salary, String PLanguage) {
        super(name, id, salary);
        this.PLanguage = PLanguage;
    }
    @Override
    void displayDetails() {
        super.displayDetails();
        System.out.println("Language  : " + PLanguage);
        System.out.println("Role      : Developer");
    }
}
// Intern subclass
class Intern extends Employee {
    int durationMonths; // unique attribute
    Intern(String name, int id, double salary, int durationMonths) {
        super(name, id, salary);
        this.durationMonths = durationMonths;
    }
    @Override
    void displayDetails() {
        super.displayDetails();
        System.out.println("Duration :" + durationMonths + " months");
        System.out.println("Role   : Intern");
    }
}
public class EmployeeManagementSystem {
    public static void main(String[] args) {
        // Polymorphism
        Employee e1 = new Manager("Amit", 101, 80000, 5);
        Employee e2 = new Developer("Riya", 102, 60000, "Java");
        Employee e3 = new Intern("Kunal", 103, 15000, 6);
        e1.displayDetails();
        System.out.println("---------------------");
        e2.displayDetails();
        System.out.println("---------------------");
        e3.displayDetails();
    }
}
