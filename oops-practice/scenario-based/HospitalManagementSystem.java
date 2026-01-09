import java.util.*;
// Interface for billing functionality
interface IPayable {
    double calculateBill(); // Method to calculate bill amount
}
//base class
class Patient {

    // Encapsulation
    private int patientId;
    private String name;
    private int age;

    // Constructor
    public Patient(int patientId, String name, int age) {
        this.patientId = patientId;
        this.name = name;
        this.age = age;
    }

    // Getter methods (Encapsulation)
    public int getPatientId() {
        return patientId;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    // Method to display common patient info
    public void displayInfo() {
        System.out.println("Patient ID: " + patientId);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}
//Inheritance -> InPatient
class InPatient extends Patient implements IPayable {

    private int daysAdmitted;
    private double dailyCharge;
    // Constructor
    public InPatient(int id, String name, int age, int days, double charge) {
        super(id, name, age); // Call parent constructor
        this.daysAdmitted = days;
        this.dailyCharge = charge;
    }
    // Implementation of interface method
    @Override
    public double calculateBill() {
        return daysAdmitted * dailyCharge;
    }
    // Method overriding
    @Override
    public void displayInfo() {
        super.displayInfo(); // Call base class method
        System.out.println("Type: InPatient");
        System.out.println("Days Admitted: " + daysAdmitted);
        System.out.println("Total Bill: ₹" + calculateBill());
    }
}
// Inheritance -> Outpatient
class OutPatient extends Patient implements IPayable {

    private double consultationFee;

    // Constructor
    public OutPatient(int id, String name, int age, double fee) {
        super(id, name, age); // Call parent constructor
        this.consultationFee = fee;
    }

    // Implementation of interface method
    @Override
    public double calculateBill() {
        return consultationFee;
    }
    // Method overriding
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Type: OutPatient");
        System.out.println("Consultation Fee: ₹" + calculateBill());
    }
}

class Doctor {

    private int doctorId;
    private String name;
    private String specialization;

    // Constructor
    public Doctor(int id, String name, String spec) {
        this.doctorId = id;
        this.name = name;
        this.specialization = spec;
    }

    // Display doctor details
    public void displayDoctor() {
        System.out.println("Doctor ID: " + doctorId);
        System.out.println("Doctor Name: " + name);
        System.out.println("Specialization: " + specialization);
    }
}

public class HospitalManagementSystem {
    // List to store patient objects
    static List<Patient> patients = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int choice;
        // Menu-driven loop
        do {
            System.out.println("\n---- Hospital Patient Management ----");
            System.out.println("1. Add Patient");
            System.out.println("2. View All Patients");
            System.out.println("3. Delete Patient");
            System.out.println("4. Exit");
            System.out.print("Enter choice: ");

            choice = sc.nextInt();
            switch (choice) {
                case 1 -> addPatient();      // CREATE
                case 2 -> viewPatients();   // READ
                case 3 -> deletePatient();  // DELETE
                case 4 -> System.out.println("Exiting System...");
                default -> System.out.println("Invalid Choice");
            }
        } while (choice != 4);
    }
// Create Operation
    static void addPatient() {
        System.out.print("Enter Patient ID: ");
        int id = sc.nextInt();
        sc.nextLine(); // Consume newline

        System.out.print("Enter Name: ");
        String name = sc.nextLine();
        System.out.print("Enter Age: ");
        int age = sc.nextInt();

        System.out.print("1. InPatient  2. OutPatient: ");
        int type = sc.nextInt();
        // Create object based on patient type
        if (type == 1) {
            System.out.print("Enter Days Admitted: ");
            int days = sc.nextInt();

            System.out.print("Enter Daily Charge: ");
            double charge = sc.nextDouble();

            patients.add(new InPatient(id, name, age, days, charge));
        } else {
            System.out.print("Enter Consultation Fee: ");
            double fee = sc.nextDouble();

            patients.add(new OutPatient(id, name, age, fee));
        }

        System.out.println("Patient Added Successfully!");
    }

    //Read Operation
    static void viewPatients() {

        if (patients.isEmpty()) {
            System.out.println("No patients found.");
            return;
        }
        // Polymorphism: displayInfo() called based on object type
        for (Patient p : patients) {
            System.out.println("--------------------");
            p.displayInfo();
        }
    }
    //Delete
    static void deletePatient() {

        System.out.print("Enter Patient ID to delete: ");
        int id = sc.nextInt();
        Iterator<Patient> itr = patients.iterator();
        boolean found = false;

        // Traverse list and remove matching patient
        while (itr.hasNext()) {
            Patient p = itr.next();
            if (p.getPatientId() == id) {
                itr.remove();
                found = true;
                System.out.println("Patient Removed Successfully!");
                break;
            }
        }

        if (!found) {
            System.out.println("Patient Not Found!");
        }
    }
}
