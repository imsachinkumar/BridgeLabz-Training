import java.util.*;
public class PatientIdPrint {
    public static void main(String[] args) {
        // List of patient IDs
        List<Integer> Ids = Arrays.asList(101, 102, 103, 104);

        // Print all patient IDs
        Ids.forEach(System.out::println);
    }
}
