import java.util.*;
import java.util.stream.*;

public class TransformCustomerNames {

    public static void main(String[] args) {

        List<String> customerNames = Arrays.asList("sachin","amit","neha","ravi","pooja");

        // Stream API logic
        customerNames.stream()
            .map(name -> name.toUpperCase()) // convert to uppercase
            .sorted()                        // sort alphabetically
            .forEach(System.out::println);  // display result
    }
}
