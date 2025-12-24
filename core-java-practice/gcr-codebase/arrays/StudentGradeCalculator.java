import java.util.Scanner;

public class StudentGradeCalculator {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int n=sc.nextInt();

        // Arrays to store marks, percentage and grade
        int[][] marks=new int[n][3]; 
        double[] percentage=new double[n];
        char[] grade=new char[n];

        for(int i=0;i<n;i++){                       // Input marks for each student

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
                    System.out.println("Invalid marks! Enter positive value again.");
                    j--; // retry same subject
                    continue;
                }
                marks[i][j]=value;
            }
        }
        // Calculate percentage and grade
        for(int i=0;i<n;i++){
            int total=marks[i][0]+marks[i][1]+marks[i][2];
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
        System.out.println("\n----- STUDENT RESULT -----");
        for(int i=0;i<n;i++){
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
