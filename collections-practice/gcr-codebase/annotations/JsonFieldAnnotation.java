import java.lang.annotation.*;
import java.lang.reflect.Field;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
@interface JsonField {
    String name();
}

class User {

    @JsonField(name = "user_name")
    String username = "Sachin";

    @JsonField(name = "age")
    int age = 22;
}

public class JsonFieldAnnotation{
    public static void main(String[] args) throws Exception {
        User u = new User();
        StringBuilder json = new StringBuilder("{");

        for (Field f : u.getClass().getDeclaredFields()) {
            if (f.isAnnotationPresent(JsonField.class)) {
                JsonField jf = f.getAnnotation(JsonField.class);
                json.append("\"").append(jf.name()).append("\":\"")
                    .append(f.get(u)).append("\",");
            }
        }
        json.setLength(json.length() - 1);
        json.append("}");

        System.out.println(json);
    }
}
