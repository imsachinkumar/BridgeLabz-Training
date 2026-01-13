package onlineexaminationsystem;
public class Main {
    public static void main(String[] args) {

        try {
            // Create questions
            Question q1 = new Question(1, "Java is OOP?", "Yes");
            Question q2 = new Question(2, "Java supports multiple inheritance?", "No");
            Question[] questions = { q1, q2 };

            // Create exam
            Exam exam = new Exam(101, "Java Basics", questions, 30);
            Student student = new Student(1, "Sachin");
            String[] answers = { "Yes", "No" };
            EvaluationStrategy strategy = new ObjectiveEvaluation();
            // Start exam
            OnlineExamService service = new OnlineExamService();
            service.startExam();
            // Submit exam
            int result = service.submitExam(exam, answers, strategy);
            System.out.println("Student: " + student.getName());
            System.out.println("Score: " + result);

        } catch (ExamTimeExpiredException e) {
            System.out.println(e.getMessage());
        }
    }
}
