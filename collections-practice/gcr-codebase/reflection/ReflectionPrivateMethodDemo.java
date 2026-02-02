import java.lang.reflect.Method;

class Calculator {
    // Private method
    private int multiply(int a, int b) {
        return a * b;
    }
}
public class ReflectionPrivateMethodDemo {
    public static void main(String[] args) {
        try {
            // Create object
            Calculator calc = new Calculator();

            // Load class
            Class<?> cls = calc.getClass();

            // Get private method
            Method method = cls.getDeclaredMethod("multiply", int.class, int.class);

            // Allow access
            method.setAccessible(true);
            // Invoke method
            int result = (int) method.invoke(calc, 5, 4);
            System.out.println("Result: " + result);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
