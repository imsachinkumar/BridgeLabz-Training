import java.util.Scanner;

public class TriangleArea {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter base ");
        double b = sc.nextDouble();
        System.out.print("Enter height ");
        double h = sc.nextDouble();
        double area = 0.5*b*h;
        double squarecm = area*6.4516;
        System.out.println(+area+" and in square centimeters is "+squarecm);
        sc.close();
    }
}
