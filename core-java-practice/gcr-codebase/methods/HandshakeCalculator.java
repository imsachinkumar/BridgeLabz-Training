import java.util.*;
public class HandshakeCalculator{
    static int calculateHandshakes(int numberOfStudents){      // Method to calculate maximum handshakes
        return(numberOfStudents*(numberOfStudents-1))/2;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number of students: ");//Input for student
        int numberOfStudents=sc.nextInt();
        int handshakes=calculateHandshakes(numberOfStudents);//calling method
        System.out.println("The maximum number of possible handshakes is "+handshakes);
        sc.close();
    }
}
