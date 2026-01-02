import java.util.*;
public class LibraryManagementSystem{
    // Arrays to store book details
    static String[] titles={
        "Java Programming",
        "Data Structures",
        "Clean Code",
        "Python Basics",
        "Web Development"
    };
    static String[] authors={
        "James Gosling",
        "Mark Weiss",
        "Robert Martin",
        "Guido Rossum",
        "John Doe"
    };
    // true=available,false=checked out
    static boolean[] isAvailable={
        true,true,true,true,true
    };
    // Method to display all books
    static void displayBooks(){
        System.out.println("\n--- Library Books ---");
        for(int i=0;i<titles.length;i++){
            System.out.println(
                (i+1)+". "+
                titles[i]+" | Author: "+authors[i]+
                " | Status: "+(isAvailable[i]?"Available":"Checked Out")
            );
        }
    }
    // Method to search books by partial title
    static void searchBook(String keyword){
        boolean found=false;
        System.out.println("\nSearch Results:");
        for(int i=0;i<titles.length;i++){
            if(titles[i].toLowerCase().contains(keyword.toLowerCase())){
                System.out.println(
                    (i+1)+". "+
                    titles[i]+" | Status: "+
                    (isAvailable[i]?"Available":"Checked Out")
                );
                found=true;
            }
        }
        if(!found){
            System.out.println("No book found with given title keyword.");
        }
    }
    // Method to checkout or return a book
    static void updateBookStatus(int bookNumber){
        int index=bookNumber-1;

        if(index<0||index>=titles.length){
            System.out.println("Invalid book number.");
            return;
        }
        if(isAvailable[index]){
            isAvailable[index]=false;
            System.out.println("Book checked out successfully.");
        }else{
            isAvailable[index]=true;
            System.out.println("Book returned and now available.");
        }
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int choice;
        do{
            System.out.println("\n=== Library Menu ===");
            System.out.println("1. Display all books");
            System.out.println("2. Search book by title");
            System.out.println("3. Checkout / Return book");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice=sc.nextInt();
            sc.nextLine();
            switch(choice){
                case 1:
                    displayBooks();
                    break;
                case 2:
                    System.out.print("Enter part of book title: ");
                    String keyword=sc.nextLine();
                    keyword=keyword.trim().replaceAll("\\s+"," ");
                    searchBook(keyword);
                    break;
                case 3:
                    displayBooks();
                    System.out.print("Enter book number to checkout/return: ");
                    int bookNo=sc.nextInt();
                    updateBookStatus(bookNo);
                    break;
                case 4:
                    System.out.println("Exiting Library System...");
                    break;
                default:
                    System.out.println("Invalid choice. Try again.");
            }

        }while(choice!=4);

        sc.close();
    }
}
