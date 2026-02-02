import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.regex.Pattern;

public class ValidateCSVData {

    // Regex patterns
    private static final Pattern EMAIL_PATTERN = Pattern.compile("^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$");
    private static final Pattern PHONE_PATTERN =Pattern.compile("^\\d{10}$");

    public static void main(String[] args) {
        String filePath = "users.csv";
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;

            // Skip header
            br.readLine();
            while ((line = br.readLine()) != null) {

                String[] data = line.split(",");
                int id = Integer.parseInt(data[0]);
                String name = data[1];
                String email = data[2];
                String phone = data[3];

                boolean valid = true;

                // Validate email
                if (!EMAIL_PATTERN.matcher(email).matches()) {
                    System.out.println("Invalid Email at ID " + id + ": " + email);
                    valid = false;
                }
                // Validate phone
                if (!PHONE_PATTERN.matcher(phone).matches()) {
                    System.out.println("❌ Invalid Phone at ID " + id + ": " + phone);
                    valid = false;
                }
                // If row is valid
                if (valid) {
                    System.out.println("✅ Valid Record -> " + name + " | " + email + " | " + phone);
                }
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
