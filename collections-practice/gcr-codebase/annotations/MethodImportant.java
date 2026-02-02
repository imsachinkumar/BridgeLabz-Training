import java.lang.annotation.*;
import java.lang.reflect.Method;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface ImportantMethod {
    String level() default "HIGH";
}

class Demo {
    @ImportantMethod
    void method1() {}

    @ImportantMethod(level = "LOW")
    void method2() {}
}

public class MethodImportant{
    public static void main(String[] args) {

        for (Method m : Demo.class.getDeclaredMethods()) {
            if (m.isAnnotationPresent(ImportantMethod.class)) {
                ImportantMethod im = m.getAnnotation(ImportantMethod.class);
                System.out.println(m.getName() + " → " + im.level());
            }
        }
    }
}
