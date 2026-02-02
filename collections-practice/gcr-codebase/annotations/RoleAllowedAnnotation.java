import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface RoleAllowed {
    String value();
}

class AdminService {

    @RoleAllowed("ADMIN")
    void deleteData() {
        System.out.println("Data deleted");
    }
}
public class RoleAllowedAnnotation{
    static String currentRole = "USER";

    public static void main(String[] args) throws Exception {
        AdminService s = new AdminService();
        var m = s.getClass().getDeclaredMethod("deleteData");
        RoleAllowed r = m.getAnnotation(RoleAllowed.class);

        if (r.value().equals(currentRole)) {
            m.invoke(s);
        } else {
            System.out.println("Access Denied!");
        }
    }
}
