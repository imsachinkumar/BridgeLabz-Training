import java.lang.annotation.*;
import java.lang.reflect.Method;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface Todo {
    String task();
    String assignedTo();
    String priority() default "MEDIUM";
}
class Project {

    @Todo(task = "Add login", assignedTo = "Rahul")
    void login() {}

    @Todo(task = "Improve UI", assignedTo = "Sachin", priority = "HIGH")
    void ui() {}
}

public class TodoAnnotation{
    public static void main(String[] args) {
        for (Method m : Project.class.getDeclaredMethods()) {
            if (m.isAnnotationPresent(Todo.class)) {
                Todo t = m.getAnnotation(Todo.class);
                System.out.println(t.task() + " | " + t.assignedTo() + " | " + t.priority());
            }
        }
    }
}
