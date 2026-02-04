import java.util.*;
import java.util.function.Predicate;

public class NotificationFilter {
    static class Alert {
        String type;
        String message;

        Alert(String type, String message) {
            this.type = type;
            this.message = message;
        }
    }

    public static void main(String[] args) {
        List<Alert> alerts = Arrays.asList(
                new Alert("Emergency", "Heart rate critical"),
                new Alert("Reminder", "Medicine time"),
                new Alert("General", "Doctor visit tomorrow")
        );

        // User wants only Emergency alerts
        Predicate<Alert> emergencyOnly =alert -> alert.type.equals("Emergency");

        System.out.println("Filtered Alerts:");
        for (Alert a : alerts) {
            if (emergencyOnly.test(a)) {
                System.out.println(a.type + ": " + a.message);
            }
        }
    }
}
