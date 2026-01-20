import java.util.ArrayList;
import java.util.List;
// Custom Exception for invalid time
class InvalidTimeFormatException extends Exception {
    public InvalidTimeFormatException(String message) {
        super(message);
    }
}
// Cinema Manager class
class CinemaTime {

    private List<String> movieTitles = new ArrayList<>();
    private List<String> showTimes = new ArrayList<>();
    // Add movie method
    public void addMovie(String title, String time) throws InvalidTimeFormatException {
        validateTime(time);
        movieTitles.add(title);
        showTimes.add(time);
    }

    // Search movie using keyword
    public void searchMovie(String keyword) {
        try {
            boolean found = false;
            for (int i = 0; i < movieTitles.size(); i++) {
                if (movieTitles.get(i).contains(keyword)) {
                    System.out.println(
                        String.format("Movie: %s | Time: %s",
                                movieTitles.get(i), showTimes.get(i))
                    );
                    found = true;
                }
            }
            if (!found) {
                System.out.println("No movie found for keyword: " + keyword);
            }
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Invalid index accessed while searching.");
        }
    }
    // Display all movies
    public void displayAllMovies() {
        for (int i = 0; i < movieTitles.size(); i++) {
            System.out.println(
                String.format("Movie: %s | Time: %s",
                        movieTitles.get(i), showTimes.get(i))
            );
        }
    }

    // Convert List to Array for report
    public void generateReport() {
        String[] titlesArray = movieTitles.toArray(new String[0]);
        String[] timesArray = showTimes.toArray(new String[0]);

        System.out.println("\n--- Movie Schedule Report ---");
        for (int i = 0; i < titlesArray.length; i++) {
            System.out.println(titlesArray[i] + " at " + timesArray[i]);
        }
    }

    // Time validation (HH:MM)
    private void validateTime(String time) throws InvalidTimeFormatException {
        if (!time.matches("\\d{2}:\\d{2}")) {
            throw new InvalidTimeFormatException("Invalid time format: " + time);
        }

        String[] parts = time.split(":");
        int hour = Integer.parseInt(parts[0]);
        int minute = Integer.parseInt(parts[1]);

        if (hour > 23 || minute > 59) {
            throw new InvalidTimeFormatException("Invalid time value: " + time);
        }
    }
}

// Test class
public class Cinema{
    public static void main(String[] args) {
        CinemaTime cinema = new CinemaTime();

        try {
            cinema.addMovie("Inception", "18:30");
            cinema.addMovie("Avatar", "21:00");
            cinema.addMovie("Interstellar", "16:45");
            // cinema.addMovie("WrongTime", "25:99"); // Exception test
        } catch (InvalidTimeFormatException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("\nAll Movies:");
        cinema.displayAllMovies();
        System.out.println("\nSearch Result:");
        cinema.searchMovie("In");

        cinema.generateReport();
    }
}
