class Student {
    public Student() {
        System.out.println("Student object created");
    }
    void sayHello() {
        System.out.println("Hello from Student");
    }
}
public class ReflectionCreateObjectDemo {

    public static void main(String[] args) {
        try {
            Class<?> cls = Class.forName("Student");
            // Create object
            Object obj = cls.getDeclaredConstructor().newInstance();
            // Type cast
            Student s = (Student) obj;
            s.sayHello();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
