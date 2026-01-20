import java.util.*;
// Book class
class Book {
    private String title;
    private String author;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    // Needed to avoid duplicates using HashSet
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Book)) return false;
        Book book = (Book) o;
        return title.equals(book.title) &&
               author.equals(book.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, author);
    }

    @Override
    public String toString() {
        return title + " by " + author;
    }
}

// BookShelf class
class BookShelf {
    // genre -> list of books
    private Map<String, LinkedList<Book>> catalog = new HashMap<>();

    // optional: avoid duplicate books
    private Set<Book> bookSet = new HashSet<>();

    // Add book (return book)
    public void addBook(String genre, Book book) {

        if (bookSet.contains(book)) {
            System.out.println("Duplicate book not allowed: " + book);
            return;
        }

        catalog.putIfAbsent(genre, new LinkedList<>());
        catalog.get(genre).add(book);
        bookSet.add(book);

        System.out.println("Book added: " + book + " in genre " + genre);
    }

    // Remove book (borrow book)
    public void removeBook(String genre, Book book) {

        if (!catalog.containsKey(genre)) {
            System.out.println("Genre not found");
            return;
        }

        LinkedList<Book> list = catalog.get(genre);
        if (list.remove(book)) {
            bookSet.remove(book);
            System.out.println("Book borrowed: " + book);
        } else {
            System.out.println("Book not found in genre");
        }
    }

    public void printCatalog() {
        if (catalog.isEmpty()) {
            System.out.println("Library is empty");
            return;
        }

        for (String genre : catalog.keySet()) {
            System.out.println("Genre: " + genre);
            for (Book book : catalog.get(genre)) {
                System.out.println("  - " + book);
            }
        }
    }
}
public class LibraryApp{
    public static void main(String[] args) {

        BookShelf shelf = new BookShelf();
        Book b1 = new Book("Clean Code", "Robert Martin");
        Book b2 = new Book("Effective Java", "Joshua Bloch");
        Book b3 = new Book("The Hobbit", "J.R.R. Tolkien");

        shelf.addBook("Programming", b1);
        shelf.addBook("Programming", b2);
        shelf.addBook("Fantasy", b3);

        shelf.addBook("Programming", b1); // duplicate

        System.out.println("\nCurrent Library:");
        shelf.printCatalog();

        shelf.removeBook("Programming", b2);

        System.out.println("\nAfter Borrowing:");
        shelf.printCatalog();
    }
}
