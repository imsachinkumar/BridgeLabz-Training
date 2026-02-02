import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Field;

// Inject annotation
@Retention(RetentionPolicy.RUNTIME)
@interface Inject {
}

class Engine {
    void start() {
        System.out.println("Engine started");
    }
}

class Car {

    @Inject
    Engine engine;

    void drive() {
        engine.start();
        System.out.println("Car running");
    }
}

public class SimpleDIDemo {

    static void inject(Object obj) throws Exception {
        Class<?> cls = obj.getClass();
        for (Field f : cls.getDeclaredFields()) {
            if (f.isAnnotationPresent(Inject.class)) {
                f.setAccessible(true);
                Object dep = f.getType().getDeclaredConstructor().newInstance();
                f.set(obj, dep);
            }
        }
    }

    public static void main(String[] args) throws Exception {
        Car car = new Car();
        inject(car);
        car.drive();
    }
}
