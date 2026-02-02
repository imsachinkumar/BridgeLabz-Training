import java.lang.reflect.Method;

class Task {
    void run() throws Exception {
        Thread.sleep(500);
    }
}

public class MethodTimingDemo {
    public static void main(String[] args) throws Exception {
        Task obj = new Task();
        Method method = obj.getClass().getDeclaredMethod("run");

        long start = System.currentTimeMillis();
        method.invoke(obj);

        long end = System.currentTimeMillis();
        System.out.println("Execution Time: " + (end - start) + " ms");
    }
}
