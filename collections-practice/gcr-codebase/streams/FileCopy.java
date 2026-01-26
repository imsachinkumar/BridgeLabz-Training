import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.File;

public class FileCopy{
    public static void main(String[] args) {
        String sourceFile = "source.txt";
        String destinationFile = "destination.txt";

        FileInputStream fis = null;
        FileOutputStream fos = null;

        try {
            File file = new File(sourceFile);

            // Check if source file exists
            if (!file.exists()) {
                System.out.println("Source file does not exist!");
                return;
            }

            fis=new FileInputStream(sourceFile);
            fos=new FileOutputStream(destinationFile);

            int data;
            while ((data = fis.read()) != -1) {
                fos.write(data);
            }

            System.out.println("File copied successfully!");

        } catch (IOException e) {
            System.out.println("Error occurred while handling the file.");
            e.printStackTrace();
        } finally {
            try {
                if (fis!=null)
                    fis.close();
                if (fos != null)
                    fos.close();
            } catch (IOException e) {
                System.out.println("Error while closing streams.");
            }
        }
    }
}
