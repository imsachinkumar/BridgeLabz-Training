package onlineexaminationsystem;

// Descriptive question evaluation logic (manual assumption)
public class DescriptiveEvaluation implements EvaluationStrategy {
    @Override
    public int evaluate(Question[] questions, String[] answers) {
        // Assume fixed marks for descriptive answers
        return questions.length * 2;
    }
}
