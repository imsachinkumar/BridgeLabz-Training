import java.util.*;
import java.util.stream.*;

public class HospitalDoctorAvailability {
    static class Doctor {
        String name;
        String specialty;
        boolean availableOnWeekend;

        Doctor(String name, String specialty, boolean availableOnWeekend) {
            this.name = name;
            this.specialty = specialty;
            this.availableOnWeekend = availableOnWeekend;
        }

        @Override
        public String toString() {
            return name + " | " + specialty + " | Weekend Available: " + availableOnWeekend;
        }
    }
    public static void main(String[] args) {
        List<Doctor> doctors = Arrays.asList(
            new Doctor("Dr. Amit", "Cardiology", true),
            new Doctor("Dr. Neha", "Neurology", false),
            new Doctor("Dr. Ravi", "Orthopedics", true),
            new Doctor("Dr. Pooja", "Dermatology", true),
            new Doctor("Dr. Karan", "Neurology", true)
        );

        // Stream API logic
        doctors.stream()
            .filter(d -> d.availableOnWeekend)          // weekend available doctors
            .sorted(Comparator.comparing(d -> d.specialty)) // sort by specialty
            .forEach(System.out::println);   
    }
}
