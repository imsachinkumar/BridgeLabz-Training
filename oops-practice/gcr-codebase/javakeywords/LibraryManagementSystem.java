class Books{
    // static variable shared by all Books objects
    static String libraryName="Egmore Library";
    String title;
    String author;
    // final variable
    final String isbn;
    // constructor using 'this' to initialize instance variables
    Books(String title,String author,String isbn){
        this.title=title;
        this.author=author;
        this.isbn=isbn;
    }
    // static method to display library name
    static void displayLibraryName(){
        System.out.println("Library Name: "+libraryName);
    }
    // method to display Books details using instanceof
    void displayDetails(Object obj){
        if(obj instanceof Books){
            System.out.println("Title: "+title);
            System.out.println("Author: "+author);
            System.out.println("ISBN: "+isbn);
        }else{
            System.out.println("Invalid Books Object");
        }
    }
}
public class LibraryManagementSystem{
    public static void main(String[] args){
        // creating  object
        Books b1=new Books("Effective Java","Joshua Bloch","978-0134685991");
        Books.displayLibraryName();
        b1.displayDetails(b1);
    }
}
