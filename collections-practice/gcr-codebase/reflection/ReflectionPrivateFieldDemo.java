import java.lang.reflect.Field;
class Person {
    private int age = 25;
}

public class ReflectionPrivateFieldDemo {
    public static void main(String[] args) {
        try {
            // Create object
            Person p = new Person();

            // Load class
            Class<?> cls = p.getClass();

            // Get private field
            Field field = cls.getDeclaredField("age");

            // Allow access
            field.setAccessible(true);

            // Get value
            int oldAge = (int) field.get(p);
            System.out.println("Old Age: " + oldAge);

            // Modify value
            field.set(p, 30);

            // Get updated value
            int newAge = (int) field.get(p);
            System.out.println("New Age: " + newAge);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
