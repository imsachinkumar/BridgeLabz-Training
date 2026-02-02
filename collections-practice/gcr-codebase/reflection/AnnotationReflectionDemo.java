import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

// Annotation
@Retention(RetentionPolicy.RUNTIME)
@interface Author {
    String name();
}
// Apply annotation
@Author(name = "Sachin")
class Book {
}
public class AnnotationReflectionDemo {

    public static void main(String[] args) {
        // Load class
        Class<Book> cls = Book.class;
        // Get annotation
        Author author = cls.getAnnotation(Author.class);
        System.out.println("Author Name: " + author.name());
    }
}
