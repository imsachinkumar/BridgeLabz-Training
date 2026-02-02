import java.lang.annotation.*;
import java.lang.reflect.Method;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface LogExecutionTime {}

class Service {

    @LogExecutionTime
    void slowMethod() {
        for (int i = 0; i < 1_000_000; i++);
    }
}
public class ExecutionTime{
    public static void main(String[] args) throws Exception {
        Service s = new Service();
        Method m = Service.class.getDeclaredMethod("slowMethod");

        long start = System.nanoTime();
        m.invoke(s);
        long end = System.nanoTime();

        System.out.println("Execution Time: " + (end - start));
    }
}
