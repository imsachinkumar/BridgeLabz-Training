class Student{
    // static variable shared by all students
    static String universityName="Global University";
    static int totalStudents=0;
    // final variable 
    final int rollNumber;
    String name;
    String grade;
    // constructor using this keyword
    Student(int rollNumber,String name,String grade){
        this.rollNumber=rollNumber;
        this.name=name;
        this.grade=grade;
        totalStudents++;
    }
    // static method to display total students
    static void displayTotalStudents(){
        System.out.println("Total Students Enrolled: "+totalStudents);
    }
    // method to display student details using instanceof
    void displayDetails(Object obj){
        if(obj instanceof Student){
            System.out.println("University Name: "+universityName);
            System.out.println("Roll Number: "+rollNumber);
            System.out.println("Name: "+name);
            System.out.println("Grade: "+grade);
        }
    }
    void updateGrade(Object obj,String newGrade){
        if(obj instanceof Student){
            grade=newGrade;
            System.out.println("Grade updated to: "+grade);
        }
    }
}
public class StudentManagement{
    public static void main(String[] args){
        // creating student objects
        Student s1=new Student(101,"Hemashree","A");
        Student s2=new Student(102,"Sharmila","B");
        Student.displayTotalStudents();
        // displaying first student
        s1.displayDetails(s1);
        System.out.println();
        // displaying second student
        s2.displayDetails(s2);
        // updating grade for second student
        s2.updateGrade(s2,"A");
        // displaying updated details
        s2.displayDetails(s2);
    }
}
