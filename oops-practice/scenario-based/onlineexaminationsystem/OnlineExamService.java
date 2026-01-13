package onlineexaminationsystem;

// Service class for exam operations
public class OnlineExamService {

    private long examStartTime;

    // Start exam
    public void startExam() {
        examStartTime = System.currentTimeMillis();
    }

    // Submit answers
    public int submitExam(
            Exam exam,
            String[] answers,
            EvaluationStrategy strategy
    ) throws ExamTimeExpiredException {

        long currentTime = System.currentTimeMillis();
        long elapsedMinutes = (currentTime - examStartTime) / (1000 * 60);

        if (elapsedMinutes > exam.getDurationInMinutes()) {
            throw new ExamTimeExpiredException("Exam time has expired!");
        }

        return strategy.evaluate(exam.getQuestions(), answers);
    }
}
