import java.io.*;
public class ConsoleToFile{

    public static void main(String[] args) throws IOException {
        BufferedReader console=new BufferedReader(new InputStreamReader(System.in));
        FileWriter writer=new FileWriter("output.txt");
        String input;
        System.out.println("Enter text (type 'exit' to stop):");
        while (true) {
            input = console.readLine();

            if (input.equalsIgnoreCase("exit")) {
                break;
            }
            writer.write(input + "\n");
        }
        writer.close();
        System.out.println("Data saved to file.");
    }
}
