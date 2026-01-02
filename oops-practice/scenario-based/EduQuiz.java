public class EduQuiz{
    static int calculateScore(String[] correct,String[] student){
        int score=0; // stores number of correct answers
        // Loop through all questions
        for(int i=0;i<correct.length;i++){
            // Compare answers
            if(correct[i].equalsIgnoreCase(student[i])){
                // increase score if answer is correct
                score++; 
            }
        }
        return score;
    }
    public static void main(String[] args){
        // Array storing correct answers
        String[] correctAnswers={
            "A","B","C","D","A",
            "C","B","D","A","C"
        };
        // Array storing student's answers
        String[] studentAnswers={
            "A","b","C","A","A",
            "c","B","D","B","C"
        };
        System.out.println("---- Quiz Result ----");
        // Loop to print question-wise feedback
        for(int i=0;i<correctAnswers.length;i++){
            if(correctAnswers[i].equalsIgnoreCase(studentAnswers[i])){
                System.out.println("Question "+(i+1)+": Correct");
            }else{
                System.out.println("Question "+(i+1)+": Incorrect");
            }
        }
        int score=calculateScore(correctAnswers,studentAnswers);
        int totalQuestions=correctAnswers.length;
        double percentage=(score*100.0)/totalQuestions;
        System.out.println("\nScore: "+score+"/"+totalQuestions);
        System.out.println("Percentage: "+percentage+"%");
        //Fail or Pass Condition
        if(percentage>=50){
            System.out.println("Result: PASS");
        }else{
            System.out.println("Result: FAIL");
        }
    }
}
