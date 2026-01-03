class Book {     // Superclass
    String title;
    int publicationYear;
    // Constructor to initialize  details
    Book(String title, int publicationYear) {
        this.title = title;
        this.publicationYear = publicationYear;
    }
    // Method to display book details
    void displayInfo() {
        System.out.println("Book Title : " + title);
        System.out.println("Publication Year : " + publicationYear);
    }
}
// Subclass
class Author extends Book {
    // Extra author attributes
    String name;
    String bio;
    // Constructor to initialize both book and author details
    Author(String title, int publicationYear, String name, String bio) {
        super(title, publicationYear); // call parent constructor
        this.name = name;
        this.bio = bio;
    }
    @Override
    void displayInfo() {
        super.displayInfo(); // display book info
        System.out.println("Author Name : " + name);
        System.out.println("Author Bio  : " + bio);
    }
}
public class LibraryManagement {
    public static void main(String[] args) {
        // Creating  object
        Author a1 = new Author("Effective Java",2018,"Joshua Bloch","Expert in Java and software design");
        a1.displayInfo();
    }
}
