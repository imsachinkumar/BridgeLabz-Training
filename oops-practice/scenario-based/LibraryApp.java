import java.util.*;
// Custom Exception
class BookNotAvailableException extends Exception{
    public BookNotAvailableException(String msg){
        super(msg);
    }
}
// Book class
class Book{
    String title,author;
    boolean available;
   //constuctor
    Book(String t,String a,boolean av){
        title=t;
        author=a;
        available=av;
    }
}
public class LibraryApp{
    // Search by partial title
    static void search(List<Book>list,String key){
        for(Book b:list){
            if(b.title.toLowerCase().contains(key.toLowerCase())){
                System.out.println(b.title+" | "+b.author+" | "+
                        (b.available?"Available":"Checked Out"));
            }
        }
    }
    // Checkout book
    static void checkout(List<Book>list,String title)
            throws BookNotAvailableException{
        for(Book b:list){
            if(b.title.equalsIgnoreCase(title)){
                if(!b.available)
                    throw new BookNotAvailableException("Book not available");
                b.available=false;
                System.out.println("Book checked out");
                return;
            }
        }
        System.out.println("Book not found");
    }

    public static void main(String[]args){
        // Book data stored in array
        Book[]arr={
                new Book("Java Basics","James",true),
                new Book("Clean Code","Robert",false),
                new Book("DSA","Mark",true)
        };
        // Array → List
        List<Book>library=new ArrayList<>(Arrays.asList(arr));
        // Search
        search(library,"java");
        // Checkout
        try{
            checkout(library,"Clean Code");
        }catch(BookNotAvailableException e){
            System.out.println(e.getMessage());
        }
    }
}
