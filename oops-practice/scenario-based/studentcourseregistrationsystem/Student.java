package studentcourseregistrationsystem;
// Student class extending Person
class Student extends Person {

    private String[] courses;
    private String[] grades;
    private int courseCount;
    private final int MAX_COURSES = 3;

    Student(int id, String name) {
        super(id, name);
        courses = new String[MAX_COURSES];
        grades = new String[MAX_COURSES];
        courseCount = 0;
    }

    // Enroll course
    void enrollCourse(String course) throws CourseLimitExceededException {
        if (courseCount == MAX_COURSES) {
            throw new CourseLimitExceededException("Maximum course limit exceeded");
        }
        courses[courseCount] = course;
        grades[courseCount] = "Not Assigned";
        courseCount++;
    }

    // Drop course
    void dropCourse(String course) {
        for (int i = 0; i < courseCount; i++) {
            if (courses[i].equals(course)) {

                // Shift elements left
                for (int j = i; j < courseCount - 1; j++) {
                    courses[j] = courses[j + 1];
                    grades[j] = grades[j + 1];
                }
                courseCount--;
                break;
            }
        }
    }

    // Assign grade
    void assignGrade(String course, String grade) {
        for (int i = 0; i < courseCount; i++) {
            if (courses[i].equals(course)) {
                grades[i] = grade;
                break;
            }
        }
    }

    // View grades
    void viewGrades() {
        System.out.println("Student Name: " + name);
        for (int i = 0; i < courseCount; i++) {
            System.out.println(courses[i] + " : " + grades[i]);
        }
    }
}
