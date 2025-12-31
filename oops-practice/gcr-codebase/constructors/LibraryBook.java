class Book{
    String title;
    String author;
    double price;
    boolean availability;
    // Parameterized constructor
    Book(String t,String a,double p){
        title=t;
        author=a;
        price=p;
        availability=true; // book is available by default
    }
    // Method to borrow a book
    void borrowBook(){
        if(availability){
            availability=false;
            System.out.println("Book borrowed successfully.");
        }else{
            System.out.println("Sorry, this book is already borrowed.");
        }
    }
    // Method to display book details
    void displayDetails(){
        System.out.println("Title: "+title);
        System.out.println("Author: "+author);
        System.out.println("Price: "+price);
        System.out.println("Available: "+availability);
        System.out.println();
    }
    public static void main(String[] args){
        // Creating object
        Book b1=new Book("Java Programming","Herbert Schildt",550.0);
        b1.displayDetails();
        b1.borrowBook();
        b1.borrowBook();
        b1.displayDetails();
    }
}
