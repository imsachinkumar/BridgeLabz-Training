public class NullPointerDemo {
    static void generateException() {           // Method to generate NullPointerException
        String text = null; // null reference
        System.out.println(text.length()); // causes exception
    }
    // Method to handle NullPointerException
    static void handleException() {
        String text = null;
        try {
            System.out.println(text.length()); // risky statement
        } catch (NullPointerException e) {
            System.out.println("NullPointerException handled");
        }
    }
    public static void main(String[] args) {
        try {                                            // Calling method that generates exception

            generateException();
        } catch (NullPointerException e) {
            System.out.println("Exception caught in main");
        }
        // Calling method that handles exception
        handleException();
    }
}
