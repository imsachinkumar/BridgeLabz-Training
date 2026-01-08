// MovieNode
class MovieNode {
    String title;
    String director;
    int year;
    double rating;

    MovieNode next; // pointer to next node
    MovieNode prev; // pointer to previous node
    // Constructor
    MovieNode(String title, String director, int year, double rating) {
        this.title = title;
        this.director = director;
        this.year = year;
        this.rating = rating;
        this.next = null;
        this.prev = null;
    }
}
// MovieManagement class 
class MovieManagement {
    private MovieNode head; // first node
    private MovieNode tail; // last node
    // Constructor
    MovieManagement() {
        head = null;
        tail = null;
    }
    // Add at the beginning
    public void addAtBeginning(String title, String director, int year, double rating) {
        MovieNode newNode = new MovieNode(title, director, year, rating);

        if (head == null) {
            head = tail = newNode;
        } else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
    }
    // Add at the end
    public void addAtEnd(String title, String director, int year, double rating) {
        MovieNode newNode = new MovieNode(title, director, year, rating);
        if (tail == null) { // empty list
            head = tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
    }
    // Add at specific position
    public void addAtPosition(int position, String title, String director, int year, double rating) {
        if (position <= 1) {
            addAtBeginning(title, director, year, rating);
            return;
        }
        MovieNode newNode = new MovieNode(title, director, year, rating);
        MovieNode temp = head;
        int count = 1;
        while (temp != null && count < position - 1) {
            temp = temp.next;
            count++;
        }

        if (temp == null || temp.next == null) {
            addAtEnd(title, director, year, rating);
        } else {
            newNode.next = temp.next;
            newNode.prev = temp;
            temp.next.prev = newNode;
            temp.next = newNode;
        }
    }
    // Remove movie by title
    public void removeByTitle(String title) {
        MovieNode temp = head;
        while (temp != null) {
            if (temp.title.equalsIgnoreCase(title)) {

                // If node is head
                if (temp == head) {
                    head = head.next;
                    if (head != null)
                        head.prev = null;
                }
                // If node is tail
                else if (temp == tail) {
                    tail = tail.prev;
                    tail.next = null;
                }
                // Middle node
                else {
                    temp.prev.next = temp.next;
                    temp.next.prev = temp.prev;
                }
                System.out.println("Movie removed successfully.");
                return;
            }
            temp = temp.next;
        }
        System.out.println("Movie not found.");
    }

    // Search movie by director
    public void searchByDirector(String director) {
        MovieNode temp = head;
        boolean found = false;
        while (temp != null) {
            if (temp.director.equalsIgnoreCase(director)) {
                displayMovie(temp);
                found = true;
            }
            temp = temp.next;
        }
        if (!found)
            System.out.println("No movies found for this director.");
    }

    // Search movie by rating
    public void searchByRating(double rating) {
        MovieNode temp = head;
        boolean found = false;
        while (temp != null) {
            if (temp.rating == rating) {
                displayMovie(temp);
                found = true;
            }
            temp = temp.next;
        }

        if (!found)
            System.out.println("No movies found with this rating.");
    }
    // Update movie rating by title
    public void updateRating(String title, double newRating) {
        MovieNode temp = head;

        while (temp != null) {
            if (temp.title.equalsIgnoreCase(title)) {
                temp.rating = newRating;
                System.out.println("Rating updated successfully.");
                return;
            }
            temp = temp.next;
        }
        System.out.println("Movie not found.");
    }
    // Display all movies forward
    public void displayForward() {
        if (head == null) {
            System.out.println("Movie list is empty.");
            return;
        }
        MovieNode temp = head;
        while (temp != null) {
            displayMovie(temp);
            temp = temp.next;
        }
    }
    // Display all movies in reverse
    public void displayReverse() {
        if (tail == null) {
            System.out.println("Movie list is empty.");
            return;
        }

        MovieNode temp = tail;
        while (temp != null) {
            displayMovie(temp);
            temp = temp.prev;
        }
    }
    // Helper method to display one movie
    private void displayMovie(MovieNode movie) {
        System.out.println("Title: " + movie.title +
                ", Director: " + movie.director +
                ", Year: " + movie.year +
                ", Rating: " + movie.rating);
    }
}
public class MovieManagementSystem {
    public static void main(String[] args) {
        MovieManagement list = new MovieManagement();
        list.addAtBeginning("Inception", "Christopher Nolan", 2010, 8.8);
        list.addAtEnd("Interstellar", "Christopher Nolan", 2014, 8.6);
        list.addAtEnd("Avatar", "James Cameron", 2009, 7.8);

        System.out.println("Movies (Forward):");
        list.displayForward();
        System.out.println("\nMovies (Reverse):");
        list.displayReverse();

        System.out.println("\nSearch by Director:");
        list.searchByDirector("Christopher Nolan");
        System.out.println("\nUpdate Rating:");
        list.updateRating("Avatar", 8.0);

        System.out.println("\nRemove Movie:");
        list.removeByTitle("Inception");
        System.out.println("\nFinal Movie List:");
        list.displayForward();
    }
}
