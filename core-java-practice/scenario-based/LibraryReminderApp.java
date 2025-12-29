import java.util.*;
public class LibraryReminderApp{
    // Method to calculate fine based on due and return days

    public static int calculateFine(int dueDay,int returnDay){
        if(returnDay>dueDay){
            int lateDays=returnDay-dueDay;
            return lateDays*5; // ₹5 per day fine
        }
        // No fine if returned on time
        return 0; 
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int totalFine=0;
        System.out.println("Rohan's Library Fine Calculator");
        // Loop for 5 books

        for(int i=1;i<=5;i++){
            System.out.println("\nBook "+i);
            System.out.print("Enter due day (date): ");
            int due=sc.nextInt();
            System.out.print("Enter return day (date): ");
            int ret=sc.nextInt();
            int fine=calculateFine(due,ret);
            totalFine+=fine;
            if(fine>0){
                System.out.println("Late! Fine for this book: ₹"+fine);
            }else{
                System.out.println("Returned on time. No fine.");
            }
        }
        System.out.println("\nTotal fine for all books: ₹"+totalFine);
        sc.close();
    }
}
