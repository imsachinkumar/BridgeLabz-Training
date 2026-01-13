package studentcourseregistrationsystem;

// Main execution class
public class Main {

    public static void main(String[] args) {

        RegistrationService service = new RegistrationServiceImpl();
        Student student = new Student(101, "Sachin");

        service.registerStudent(student);

        try {
            service.enroll(student, "Java");
            service.enroll(student, "DSA");
            service.enroll(student, "DBMS");
            service.enroll(student, "AI"); // Exception here
        } catch (CourseLimitExceededException e) {
            System.out.println(e.getMessage());
        }

        service.assignGrade(student, "Java", "A");
        service.assignGrade(student, "DSA", "B+");

        student.viewGrades();
    }
}
