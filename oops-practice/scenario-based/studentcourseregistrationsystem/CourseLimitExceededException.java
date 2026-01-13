package studentcourseregistrationsystem;
// Custom checked exception
class CourseLimitExceededException extends Exception {
    CourseLimitExceededException(String message) {
        super(message);
    }
}
