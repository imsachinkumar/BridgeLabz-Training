import java.io.*;
public class StudentData {
    public static void main(String[] args) {
        // Write data
        try(
            DataOutputStream dos=new DataOutputStream(new FileOutputStream("student.dat"))) {

            dos.writeInt(101);
            dos.writeUTF("Rahul");
            dos.writeDouble(8.7);

        } catch(IOException e) {
            e.printStackTrace();
        }
        // Read data
        try(
            DataInputStream dis=new DataInputStream(new FileInputStream("student.dat"))) {

            int roll=dis.readInt();
            String name=dis.readUTF();
            double gpa=dis.readDouble();

            System.out.println(roll+" "+name+" "+gpa);

        } catch(IOException e) {
            e.printStackTrace();
        }
    }
}
