package onlineexaminationsystem;
// Custom checked exception for exam time expiry
public class ExamTimeExpiredException extends Exception {

    public ExamTimeExpiredException(String message) {
        super(message);
    }
}
