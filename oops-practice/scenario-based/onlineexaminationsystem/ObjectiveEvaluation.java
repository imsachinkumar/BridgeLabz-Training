package onlineexaminationsystem;

// Objective question evaluation logic
public class ObjectiveEvaluation implements EvaluationStrategy {

    @Override
    public int evaluate(Question[] questions, String[] answers) {
        int score = 0;
        for (int i = 0; i < questions.length; i++) {
            if (questions[i].getCorrectAnswer().equalsIgnoreCase(answers[i])) {
                score++;
            }
        }
        return score;
    }
}
