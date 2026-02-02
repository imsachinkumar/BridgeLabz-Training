import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.io.*;
import java.util.Base64;

public class SecureCSVExample {

    // Secret key for AES encryption 
    private static final String SECRET_KEY = "1234567890123456";
    public static void main(String[] args) throws Exception {
        // Write CSV with encrypted Email and Salary
        writeEncryptedCSV("employees6.csv");

        // Read CSV and decrypt Email and Salary
        readAndDecryptCSV("employees6.csv");
    }

    // Encryption
    private static String encrypt(String data) throws Exception {
        Cipher cipher = Cipher.getInstance("AES");
        SecretKeySpec key = new SecretKeySpec(SECRET_KEY.getBytes(), "AES");
        cipher.init(Cipher.ENCRYPT_MODE, key);
        byte[] encryptedBytes = cipher.doFinal(data.getBytes());
        return Base64.getEncoder().encodeToString(encryptedBytes);
    }
    // Decrypt encrypted text using AES
    private static String decrypt(String encryptedData) throws Exception {
        Cipher cipher = Cipher.getInstance("AES");
        SecretKeySpec key = new SecretKeySpec(SECRET_KEY.getBytes(), "AES");
        cipher.init(Cipher.DECRYPT_MODE, key);
        byte[] decryptedBytes = cipher.doFinal(Base64.getDecoder().decode(encryptedData));
        return new String(decryptedBytes);
    }

    // Write employee data to CSV with encrypted fields
    private static void writeEncryptedCSV(String fileName) throws Exception {

        BufferedWriter bw = new BufferedWriter(new FileWriter(fileName));
        // Write CSV header
        bw.write("ID,Name,Department,Email,Salary");
        bw.newLine();

        // Write employee records with encrypted Email and Salary
        bw.write("101,Rahul,IT," + encrypt("rahul@gmail.com") + "," + encrypt("55000"));
                bw.newLine();

        bw.write("102,Priya,HR," + encrypt("priya@gmail.com") + "," + encrypt("48000"));
        bw.newLine();

        bw.close();

        System.out.println("CSV written with encrypted fields");
    }

    // Read CSV and decrypt Email and Salary
    private static void readAndDecryptCSV(String fileName) throws Exception {

        BufferedReader br = new BufferedReader(new FileReader(fileName));
        String line;

        // Skip header row
        br.readLine();
        System.out.println("Decrypted Records:");
        while ((line = br.readLine()) != null) {

            String[] data = line.split(",");
            String id = data[0];
            String name = data[1];
            String department = data[2];
            String email = decrypt(data[3]);
            String salary = decrypt(data[4]);

            System.out.println(id + " | " + name + " | " + department + " | " + email + " | " + salary);
        }
        br.close();
    }
}
