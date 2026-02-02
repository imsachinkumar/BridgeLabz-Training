import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;

class Student {
    String name;
    int age;
}

public class ObjectMapperDemo {
    // Mapper method
    static <T> T toObject(Class<T> cls, Map<String, Object> map) throws Exception {
        // Create object
        T obj = cls.getDeclaredConstructor().newInstance();

        // Fields
        for (Field f : cls.getDeclaredFields()) {
            f.setAccessible(true);
            if (map.containsKey(f.getName())) {
                f.set(obj, map.get(f.getName()));
            }
        }
        return obj;
    }

    public static void main(String[] args) throws Exception {
        Map<String, Object> data = new HashMap<>();
        data.put("name", "Sachin");
        data.put("age", 22);

        // Convert
        Student s = toObject(Student.class, data);
        System.out.println(s.name + " " + s.age);
    }
}
