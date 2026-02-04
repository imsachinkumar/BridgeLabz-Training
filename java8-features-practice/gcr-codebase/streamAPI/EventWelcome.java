import java.util.*;
public class EventWelcome {
    public static void main(String[] args) {
        List<String> attendees = Arrays.asList("Amit", "Neha", "Ravi", "Pooja");

        // Welcome message
        attendees.forEach(name ->
            System.out.println("Welcome to the event, " + name + "!")
        );
    }
}
