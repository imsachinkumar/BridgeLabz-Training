import java.util.ArrayList;
import java.util.List;
// Custom exception for invalid marks
class InvalidMarkException extends Exception{
    public InvalidMarkException(String message){
        super(message);
    }
}
// Student class
class Student{
    private String name;
    private String[]subjects;
    private int[]marks;
    public Student(String name,String[]subjects,int[]marks){
        this.name=name;
        this.subjects=subjects;
        this.marks=marks;
    }
    public String getName(){
        return name;
    }
    public String[]getSubjects(){
        return subjects;
    }
    public int[]getMarks(){
        return marks;
    }
}
// Report generator class
class ReportGenerator{
    // Validate marks
    public static void validateMarks(int[]marks)throws InvalidMarkException{
        for(int i=0;i<marks.length;i++){
            if(marks[i]<0||marks[i]>100){
                throw new InvalidMarkException("Marks must be between 0 and 100");
            }
        }
    }
    // Calculate average
    public static double calculateAverage(int[]marks){
        int sum=0;
        for(int i=0;i<marks.length;i++){
            sum+=marks[i];
        }
        return (double)sum/marks.length;
    }
    // Assign grade
    public static String getGrade(double avg){
        if(avg>=80){
            return "A";
        }else if(avg>=60){
            return "B";
        }else if(avg>=40){
            return "C";
        }else{
            return "Fail";
        }
    }
    // Display report card
    public static void displayReport(Student s)throws InvalidMarkException{
        validateMarks(s.getMarks());
        double avg=calculateAverage(s.getMarks());
        String grade=getGrade(avg);

        System.out.println("--- REPORT CARD ---");
        System.out.println("Student Name :"+s.getName());
        String[]subjects=s.getSubjects();
        int[]marks=s.getMarks();
        for(int i=0;i<subjects.length;i++){
            System.out.println(subjects[i]+" : "+marks[i]);
        }
        System.out.printf("Average Marks : %.2f%n",avg);
        System.out.println("Grade : "+grade);
    }
}
public class StudentReportApp{
    public static void main(String[]args){
        String[]subjects={"Math","Science","English"};
        Student s1=new Student("Amit",subjects,new int[]{85,78,90});
        Student s2=new Student("Riya",subjects,new int[]{65,70,60});
        List<Student>studentList=new ArrayList<>();
        studentList.add(s1);
        studentList.add(s2);
        try{
            for(Student s:studentList){
                ReportGenerator.displayReport(s);
            }
        }catch(InvalidMarkException e){
            System.out.println(e.getMessage());
        }
    }
}
