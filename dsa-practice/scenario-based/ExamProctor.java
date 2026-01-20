import java.util.*;
public class ExamProctor {
    // Stack to track question navigation
    private Stack<Integer> navigationStack = new Stack<>();

    // Map to store answers
    private Map<Integer, String> answerMap = new HashMap<>();
    private Map<Integer, String> correctAnswers = new HashMap<>();  // Map for correct answers 
    public ExamProctor() {
        correctAnswers.put(1, "A");
        correctAnswers.put(2, "B");
        correctAnswers.put(3, "C");
        correctAnswers.put(4, "D");
    }

    // Visit a question
    public void visitQuestion(int questionId) {
        navigationStack.push(questionId);
        System.out.println("Visited Question: " + questionId);
    }

    // Answer a question
    public void answerQuestion(int questionId, String answer) {
        answerMap.put(questionId, answer);
        System.out.println("Answered Question " + questionId + " with " + answer);
    }

    // Go back to last visited question
    public void goBack() {
        if (navigationStack.isEmpty()) {
            System.out.println("No previous question");
            return;
        }
        int lastQuestion = navigationStack.pop();
        System.out.println("Back from Question: " + lastQuestion);
    }
    // Function to calculate score
    public int calculateScore() {
        int score = 0;

        for (int qId : correctAnswers.keySet()) {
            if (answerMap.containsKey(qId) &&
                answerMap.get(qId).equals(correctAnswers.get(qId))) {
                score++;
            }
        }
        return score;
    }
    // Submit exam
    public void submitExam() {
        int score = calculateScore();
        System.out.println("Exam Submitted");
        System.out.println("Final Score: " + score);
    }
    public static void main(String[] args) {
        ExamProctor exam = new ExamProctor();

        exam.visitQuestion(1);
        exam.answerQuestion(1, "A");

        exam.visitQuestion(2);
        exam.answerQuestion(2, "C");

        exam.visitQuestion(3);
        exam.answerQuestion(3, "C");
        exam.goBack();

        exam.visitQuestion(4);
        exam.answerQuestion(4, "D");
        exam.submitExam();
    }
}
