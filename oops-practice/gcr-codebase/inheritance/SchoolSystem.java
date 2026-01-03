// Superclass
class Person {

    // Common attributes for all people in school
    String name;
    int age;

    // Constructor to initialize common data
    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

// Teacher subclass
class Teacher extends Person {

    String subject; // specific to Teacher

    Teacher(String name, int age, String subject) {
        super(name, age);
        this.subject = subject;
    }

    void displayRole() {
        System.out.println("Role    : Teacher");
        System.out.println("Subject : " + subject);
    }
}

// Student subclass
class Student extends Person {

    int grade; // specific to Student

    Student(String name, int age, int grade) {
        super(name, age);
        this.grade = grade;
    }

    void displayRole() {
        System.out.println("Role  : Student");
        System.out.println("Grade : " + grade);
    }
}

// Staff subclass
class Staff extends Person {

    String department; // specific to Staff

    Staff(String name, int age, String department) {
        super(name, age);
        this.department = department;
    }

    void displayRole() {
        System.out.println("Role       : Staff");
        System.out.println("Department : " + department);
    }
}

// Main class
public class SchoolSystem {

    public static void main(String[] args) {

        Teacher t = new Teacher("Mr. Sharma", 40, "Mathematics");
        Student s = new Student("Riya", 16, 10);
        Staff st = new Staff("Amit", 35, "Administration");

        // Display details
        System.out.println("Name : " + t.name + ", Age : " + t.age);
        t.displayRole();

        System.out.println("--------------------");

        System.out.println("Name : " + s.name + ", Age : " + s.age);
        s.displayRole();

        System.out.println("--------------------");

        System.out.println("Name : " + st.name + ", Age : " + st.age);
        st.displayRole();
    }
}
