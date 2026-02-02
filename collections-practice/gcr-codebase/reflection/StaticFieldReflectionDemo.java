import java.lang.reflect.Field;
class Configuration {
    // Private static field
    private static String API_KEY = "OLD_KEY";
}

public class StaticFieldReflectionDemo {

    public static void main(String[] args) {
        try {
            Class<?> cls = Configuration.class;
            // Get field
            Field field = cls.getDeclaredField("API_KEY");

            // Allow access
            field.setAccessible(true);

            // Modify value
            field.set(null, "NEW_API_KEY");

            // Get value
            String value = (String) field.get(null);

            // Print value
            System.out.println("API_KEY: " + value);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
