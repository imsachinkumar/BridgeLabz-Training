class Course {// Base Class
    String courseName;
    int duration; // in hours
    Course(String courseName, int duration) {
        this.courseName = courseName;
        this.duration = duration;
    }
}
// Derived Class
class OnlineCourse extends Course {
    String platform;
    boolean isRecorded;
//  Constructor
    OnlineCourse(String courseName, int duration,
                 String platform, boolean isRecorded) {
        super(courseName, duration);
        this.platform = platform;
        this.isRecorded = isRecorded;
    }
}
// Further Derived Class
class PaidOnlineCourse extends OnlineCourse {
    double fee;
    double discount;
// Constructor
    PaidOnlineCourse(String courseName, int duration,
                     String platform, boolean isRecorded,
                     double fee, double discount) {
        super(courseName, duration, platform, isRecorded);
        this.fee = fee;
        this.discount = discount;
    }
}
public class CourseSystem {
    public static void main(String[] args) {
        // Creating PaidOnlineCourse object
        PaidOnlineCourse c =new PaidOnlineCourse("Java", 40, "Udemy", true, 3000, 500);
        System.out.println("Course: " + c.courseName);
        System.out.println("Fee after discount: " + (c.fee - c.discount));
    }
}
