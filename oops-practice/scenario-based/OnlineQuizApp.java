import java.util.ArrayList;
import java.util.List;
// Custom Exception
class InvalidQuizSubmissionException extends Exception{
    public InvalidQuizSubmissionException(String message){
        super(message);
    }
}
class ResultProcessor{
    public static int calculateScore(String[]correctAnswers,String[]userAnswers)
            throws InvalidQuizSubmissionException{
        // Length validation
        if(correctAnswers.length!=userAnswers.length){
            throw new InvalidQuizSubmissionException(
                    "Number of answers does not match the quiz questions."
            );
        }
        int score=0;
        // Compare answers
        for(int i=0;i<correctAnswers.length;i++){
            if(correctAnswers[i].equalsIgnoreCase(userAnswers[i])){
                score++;
            }
        }
        return score;
    }
    // Calculate grade
    public static String getGrade(int score,int totalQuestions){
        double percentage=(score*100.0)/totalQuestions;
        if(percentage>=80){
            return "A";
        }else if(percentage>=60){
            return "B";
        }else if(percentage>=40){
            return "C";
        }else{
            return "Fail";
        }
    }
}
public class OnlineQuizApp{
    public static void main(String[]args){
        String[]correctAnswers={"A","B","C","D","A"};
        String[]user1Answers={"A","B","C","A","A"};
        String[]user2Answers={"A","C","C","D","B"};
        List<Integer>scoreList=new ArrayList<>();
        try{
            int score1=ResultProcessor.calculateScore(correctAnswers,user1Answers);
            scoreList.add(score1);
            System.out.println("User 1 Score:"+score1);
            System.out.println("User 1 Grade:"+
                    ResultProcessor.getGrade(score1,correctAnswers.length));
            int score2=ResultProcessor.calculateScore(correctAnswers,user2Answers);
            scoreList.add(score2);
            System.out.println("User 2 Score:"+score2);
            System.out.println("User 2 Grade:"+
                    ResultProcessor.getGrade(score2,correctAnswers.length));
        }catch(InvalidQuizSubmissionException e){
            System.out.println(e.getMessage());
        }
        System.out.println("All User Scores:"+scoreList);
    }
}
