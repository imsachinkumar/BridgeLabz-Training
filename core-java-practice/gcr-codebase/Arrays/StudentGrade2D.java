import java.util.Scanner;

public class StudentGrade2D {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int students=sc.nextInt();

        // 2D array to store marks
        int[][] marks=new int[students][3];
        double[] percentage=new double[students];           // Arrays to store percentage and grade
        char[] grade=new char[students];
        for(int i=0;i<students;i++){
            System.out.println("\nEnter marks for Student "+(i+1));
            for(int j=0;j<3;j++){
                String subject="";
                if(j==0) subject="Physics";
                else if(j==1) subject="Chemistry";
                else subject="Maths";

                System.out.print(subject+" marks: ");
                int value=sc.nextInt();

                // Validate marks
                if(value<0){
                    System.out.println("Invalid marks! Please enter positive value.");
                    j--; // retry the same subject
                    continue;
                }

                marks[i][j]=value;
            }
        }

        // Calculate percentage and grade 
        for(int i=0;i<students;i++){
            int total=0;
            for(int j=0;j<3;j++){
                total+=marks[i][j];
            }
            percentage[i]=total/3.0;
            if(percentage[i]>=80){
                grade[i]='A';
            }
            else if(percentage[i]>=70){
                grade[i]='B';
            }
            else if(percentage[i]>=60){
                grade[i]='C';
            }
            else if(percentage[i]>=50){
                grade[i]='D';
            }
            else if(percentage[i]>=40){
                grade[i]='E';
            }
            else{
                grade[i]='R';
            }
        }
        System.out.println("\n----- STUDENT RESULTS -----");
        for(int i=0;i<students;i++){
            System.out.println("Student "+(i+1));
            System.out.println("Physics: "+marks[i][0]);
            System.out.println("Chemistry: "+marks[i][1]);
            System.out.println("Maths: "+marks[i][2]);
            System.out.println("Percentage: "+percentage[i]);
            System.out.println("Grade: "+grade[i]);
            System.out.println();
        }
        sc.close();
    }
}
