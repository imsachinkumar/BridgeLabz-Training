import java.io.*;
public class ImageByteArray {
    public static void main(String[] args) {
        try(FileInputStream fis=new FileInputStream("input.jpg");
            ByteArrayOutputStream baos=new ByteArrayOutputStream()) {

            byte[] buffer=new byte[4096];
            int bytesRead;
            while((bytesRead=fis.read(buffer))!=-1) {
                baos.write(buffer,0,bytesRead);
            }

            byte[] imageBytes=baos.toByteArray();

            ByteArrayInputStream bais=new ByteArrayInputStream(imageBytes);
            FileOutputStream fos=new FileOutputStream("output.jpg");

            while((bytesRead=bais.read(buffer))!=-1) {
                fos.write(buffer,0,bytesRead);
            }
            fos.close();
            System.out.println("Image copied successfully");

        } catch(IOException e) {
            e.printStackTrace();
        }
    }
}
