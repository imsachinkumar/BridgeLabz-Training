import java.util.*;
public class EmailNotifications {

    public static void main(String[] args) {
        List<String> emails = Arrays.asList(
            "user1@gmail.com",
            "user2@gmail.com",
            "user3@gmail.com"
        );
        // Send notification email to each user
        emails.forEach(email -> sendEmailNotification(email));
    }

    // Dummy method to simulate email sending
    static void sendEmailNotification(String email) {
        System.out.println("Notification email sent to: " + email);
    }
}
