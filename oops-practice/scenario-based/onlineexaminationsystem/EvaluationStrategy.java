package onlineexaminationsystem;
// Interface for evaluation strategy
public interface EvaluationStrategy {
    int evaluate(Question[] questions, String[] answers);
}
