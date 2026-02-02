import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CSVToStudentObjects {

    // Student class
    static class Student {
        private int id;
        private String name;
        private int age;
        private int marks;

        public Student(int id, String name, int age, int marks) {
            this.id = id;
            this.name = name;
            this.age = age;
            this.marks = marks;
        }

        @Override
        public String toString() {
            return "Student{" + "id=" + id +", name='" + name + '\'' + ", age=" + age + ", marks=" + marks +'}';
        }
    }

    public static void main(String[] args) {

        String filePath = "students2.csv";
        List<Student> students = new ArrayList<>();

        // READ CSV & CONVERT TO OBJECTS
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {

            String line;
            // Skip header row
            br.readLine();

            while ((line = br.readLine()) != null) {
                String[] data = line.split(",");

                int id = Integer.parseInt(data[0]);
                String name = data[1];
                int age = Integer.parseInt(data[2]);
                int marks = Integer.parseInt(data[3]);

                Student student = new Student(id, name, age, marks);
                students.add(student);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

        // PRINT STUDENT OBJECTS
        System.out.println("Student List:");
        for (Student s : students) {
            System.out.println(s);
        }
    }
}
