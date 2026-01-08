//StudentNode class
class StudentNode{
    int rollNo;
    String name;
    int age;
    String grade;
    StudentNode next;
 //Constructor
    StudentNode(int rollNo,String name,int age,String grade){
        this.rollNo=rollNo;
        this.name=name;
        this.age=age;
        this.grade=grade;
        this.next=null;
    }
}
//LinkedList
class StudentLinkedList{
    StudentNode head;
    //Method for add at beginning
    public void addAtBeginning(int rollNo,String name,int age,String grade){
        StudentNode newNode=new StudentNode(rollNo, name, age, grade);
        newNode.next=head;
        head=newNode;
    }
    //Method for add at end
    public void addAtEnd(int rollNo,String name,int age,String grade){
        StudentNode newNode=new StudentNode(rollNo, name, age, grade);
        if(head==null){
            head=newNode;
        }
        StudentNode temp=head;
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=newNode;
    }
    //Method for add At specific position
     public void addAtPosition(int position, int rollNo, String name, int age, String grade) {
        if (position <= 1) {
            addAtBeginning(rollNo, name, age, grade);
            return;
        }
        StudentNode newNode = new StudentNode(rollNo, name, age, grade);
        StudentNode temp = head;
        for (int i=1;i<position-1 && temp!=null;i++) {
            temp=temp.next;
        }
        if (temp==null) {
            System.out.println("Invalid position!");
            return;
        }
        newNode.next=temp.next;
        temp.next=newNode;
    }
    // 4. Delete student by Roll Number
    public void deleteByRollNo(int rollNo) {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }
        if (head.rollNo == rollNo) {
            head = head.next;
            System.out.println("Student deleted successfully.");
            return;
        }

        StudentNode temp = head;
        while (temp.next != null && temp.next.rollNo != rollNo) {
            temp = temp.next;
        }
        if (temp.next == null) {
            System.out.println("Student not found.");
        } else {
            temp.next = temp.next.next;
            System.out.println("Student deleted successfully.");
        }
    }
    // 5. Search student by Roll Number
    public void searchByRollNo(int rollNo) {
        StudentNode temp = head;

        while (temp != null) {
            if (temp.rollNo == rollNo) {
                System.out.println("Student Found:");
                displayStudent(temp);
                return;
            }
            temp = temp.next;
        }
        System.out.println("Student not found.");
    }
    // 6. Update student grade by Roll Number
    public void updateGrade(int rollNo, String newGrade) {
        StudentNode temp = head;
        while (temp != null) {
            if (temp.rollNo == rollNo) {
                temp.grade = newGrade;
                System.out.println("Grade updated successfully.");
                return;
            }
            temp = temp.next;
        }
        System.out.println("Student not found.");
    }
    // 7. Display all students
    public void displayAllStudents() {
        if (head == null) {
            System.out.println("No student records available.");
            return;
        }
        StudentNode temp = head;
        while (temp != null) {
            displayStudent(temp);
            temp = temp.next;
        }
    }

    //display
    private void displayStudent(StudentNode student) {
        System.out.println("Roll No: " + student.rollNo);
        System.out.println("Name  : " + student.name);
        System.out.println("Age   : " + student.age);
        System.out.println("Grade : " + student.grade);
    }
}
public class StudentManagementSystem {
    public static void main(String[] args) {
        //Creating object for Linked list class
        StudentLinkedList list = new StudentLinkedList();
        list.addAtBeginning(101, "Amit", 20, "A");
        list.addAtEnd(102, "Neha", 21, "B");
        list.addAtEnd(103, "Rahul", 19, "A");
        list.addAtPosition(2, 104, "Priya", 22, "C");

        System.out.println("All Student Records:");
        list.displayAllStudents();
        list.searchByRollNo(102);
        list.updateGrade(103, "A+");
        list.deleteByRollNo(101);

        System.out.println("Updated Student Records:");
        list.displayAllStudents();
        
    }
}