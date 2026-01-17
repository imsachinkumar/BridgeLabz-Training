public class ReverseString{
    public static void main(String[] args) {
        String input = "hello";
        StringBuilder builder = new StringBuilder();
        // Add the string into StringBuilder
        builder.append(input);
        builder.reverse();
        //Convert StringBuilder back to String
        String reversedString = builder.toString();
        System.out.println("Reversed String: " + reversedString);
    }
}
