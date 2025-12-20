import java.util.Scanner;

public class FriendsInfo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Amar's age: ");
        int amarAge=sc.nextInt();
        System.out.print("Enter Amar's height: ");
        double amarHeight=sc.nextDouble();

        System.out.print("Enter Akbar's age: ");
        int akbarAge=sc.nextInt();
        System.out.print("Enter Akbar's height: ");
        double akbarHeight=sc.nextDouble();

        System.out.print("Enter Anthony's age: ");
        int anthonyAge=sc.nextInt();
        System.out.print("Enter Anthony's height: ");
        double anthonyHeight=sc.nextDouble();

        // Finding for youngest
        if(amarAge<akbarAge && amarAge<anthonyAge){
            System.out.println("Youngest friend is Amar");
        }else if(akbarAge<amarAge && akbarAge<anthonyAge){
            System.out.println("Youngest friend is Akbar");
        }else{
            System.out.println("Youngest friend is Anthony");
        }

        // Finding for tallest
        if(amarHeight>akbarHeight && amarHeight>anthonyHeight){
            System.out.println("Tallest friend is Amar");
        }else if(akbarHeight>amarHeight && akbarHeight>anthonyHeight){
            System.out.println("Tallest friend is Akbar");
        }else{
            System.out.println("Tallest friend is Anthony");
        }

        sc.close();
    }
}
