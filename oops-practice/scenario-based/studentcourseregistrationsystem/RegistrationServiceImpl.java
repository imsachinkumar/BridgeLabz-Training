package studentcourseregistrationsystem;
// Implementation class
class RegistrationServiceImpl implements RegistrationService {

    public void registerStudent(Student student) {
        System.out.println("Student Registered: " + student.name);
    }

    public void enroll(Student student, String course) throws CourseLimitExceededException {
        student.enrollCourse(course);
        System.out.println("Enrolled in course: " + course);
    }

    public void drop(Student student, String course) {
        student.dropCourse(course);
        System.out.println("Dropped course: " + course);
    }

    public void assignGrade(Student student, String course, String grade) {
        student.assignGrade(course, grade);
    }
}
