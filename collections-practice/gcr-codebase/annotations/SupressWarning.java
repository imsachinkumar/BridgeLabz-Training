import java.util.ArrayList;
public class SupressWarning{

    @SuppressWarnings("unchecked")
    public static void main(String[] args) {
        ArrayList list = new ArrayList(); // raw type
        list.add("Java");
        list.add(10);

        for (Object obj : list) {
            System.out.println(obj);
        }
    }
}
