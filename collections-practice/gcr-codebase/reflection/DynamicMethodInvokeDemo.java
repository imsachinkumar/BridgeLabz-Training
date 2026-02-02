import java.lang.reflect.Method;
import java.util.Scanner;

class MathOperations {
    public int add(int a, int b) {
        return a + b;
    }
    public int subtract(int a, int b) {
        return a - b;
    }
    public int multiply(int a, int b) {
        return a * b;
    }
}

public class DynamicMethodInvokeDemo {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter method name: ");
            String methodName = sc.nextLine();

            // Object
            MathOperations obj = new MathOperations();
            Class<?> cls = obj.getClass();

            // Get method
            Method method = cls.getMethod(methodName, int.class, int.class);

            // Invoke method
            Object result = method.invoke(obj, 10, 5);
            System.out.println("Result: " + result);

            sc.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
