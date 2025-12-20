import java.util.Scanner;

public class StudentGrade {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Input marks for three subjects
        System.out.print("Enter phy marks: ");
        int phy = sc.nextInt();
        System.out.print("Enter chem marks: ");
        int chem = sc.nextInt();
        System.out.print("Enter Maths marks: ");
        int maths = sc.nextInt();

        int total = phy + chem + maths;  // Calculate total and average
        double average = total / 3.0;   // percentage

        // Variables for grade and remarks
        char grade;
        String remarks;

        // Grade calculation based on average marks
        
        if (average >= 80) {
            grade = 'A';
            remarks = "Level 4, above agency-normalized standards";
        } else if (average >= 70) {
            grade = 'B';
            remarks = "Level 3, at agency-normalized standards";
        } else if (average >= 60) {
            grade = 'C';
            remarks = "Level 2, below but approaching standards";
        } else if (average >= 50) {
            grade = 'D';
            remarks = "Level 1, well below standards";
        } else if (average >= 40) {
            grade = 'E';
            remarks = "Level 1-, too below standards";
        } else {
            grade = 'R';
            remarks = "Remedial standards";
        }
        System.out.println("\n----- Result -----");
        System.out.println("Average Marks: " + average + "%");
        System.out.println("Grade: " + grade);
        System.out.println("Remarks: " + remarks);
        sc.close();
    }
}
