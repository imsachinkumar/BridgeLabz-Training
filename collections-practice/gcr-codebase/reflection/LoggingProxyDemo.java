import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

interface Greeting {
    void sayHello();
}
class GreetingImpl implements Greeting {
    public void sayHello() {
        System.out.println("Hello World");
    }
}

public class LoggingProxyDemo {
    public static void main(String[] args) {
        Greeting obj = new GreetingImpl();

        // Proxy
        Greeting proxy = (Greeting) Proxy.newProxyInstance(
                obj.getClass().getClassLoader(),
                new Class[]{Greeting.class},
                new InvocationHandler() {
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        System.out.println("Calling: " + method.getName());
                        return method.invoke(obj, args);
                    }
                }
        );
        proxy.sayHello();
    }
}
