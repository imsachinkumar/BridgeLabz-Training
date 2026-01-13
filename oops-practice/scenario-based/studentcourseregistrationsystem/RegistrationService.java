package studentcourseregistrationsystem;

// Interface for registration operations
interface RegistrationService {
    void registerStudent(Student student);
    void enroll(Student student, String course) throws CourseLimitExceededException;
    void drop(Student student, String course);
    void assignGrade(Student student, String course, String grade);
}
