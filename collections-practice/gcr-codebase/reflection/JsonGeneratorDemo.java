import java.lang.reflect.Field;
class Person {
    String name = "Amit";
    int age = 30;
}

public class JsonGeneratorDemo {
    static String toJson(Object obj) throws Exception {

        Class<?> cls = obj.getClass();
        StringBuilder sb = new StringBuilder("{");
        Field[] fields = cls.getDeclaredFields();

        for (int i = 0; i < fields.length; i++) {
            fields[i].setAccessible(true);
            sb.append("\"").append(fields[i].getName()).append("\":");
            sb.append("\"").append(fields[i].get(obj)).append("\"");
            if (i < fields.length - 1) sb.append(", ");
        }

        sb.append("}");
        return sb.toString();
    }

    public static void main(String[] args) throws Exception {
        Person p = new Person();
        System.out.println(toJson(p));
    }
}
