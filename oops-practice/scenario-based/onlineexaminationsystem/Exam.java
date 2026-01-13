package onlineexaminationsystem;

// Exam entity class
public class Exam {

    private int examId;
    private String examName;
    private Question[] questions;
    private int durationInMinutes;

    public Exam(int examId, String examName, Question[] questions, int durationInMinutes) {
        this.examId = examId;
        this.examName = examName;
        this.questions = questions;
        this.durationInMinutes = durationInMinutes;
    }

    public Question[] getQuestions() {
        return questions;
    }

    public int getDurationInMinutes() {
        return durationInMinutes;
    }
}
