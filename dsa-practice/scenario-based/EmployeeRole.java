// Abstract base class
abstract class Employee {
    private final String name;
    private final double salary;

    protected Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    // Getter methods (no setters to maintain immutability)
    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    // Polymorphic method
    public abstract double getBonus();
}

// Manager subclass
class Manager extends Employee {
    private final double bonus; // cached bonus

    public Manager(String name, double salary) {
        super(name, salary);
        this.bonus = salary * 0.10; // 10% bonus
    }

    @Override
    public double getBonus() {
        return bonus;
    }
}

// Developer subclass
class Developer extends Employee {

    private final double bonus; // cached bonus

    public Developer(String name, double salary) {
        super(name, salary);
        this.bonus = (salary > 50000) ? salary * 0.05 : 0.0;
    }

    @Override
    public double getBonus() {
        return bonus;
    }
}

// Test class
public class EmployeeRole{
    public static void main(String[] args) {
        Employee manager = new Manager("Alice", 80000);
        System.out.printf("%.2f%n", manager.getBonus());

        Employee dev1 = new Developer("Bob", 60000);
        System.out.printf("%.2f%n", dev1.getBonus());

        Employee dev2 = new Developer("Charlie", 40000);
        System.out.printf("%.2f%n", dev2.getBonus());
    }
}
