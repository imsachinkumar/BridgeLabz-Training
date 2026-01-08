// Book node for doubly linked list
class BookNode{
    String title,author,genre;
    int bookId;
    boolean available;
    BookNode next,prev;

    // Constructor
    BookNode(String title,String author,String genre,int bookId,boolean available){
        this.title=title;
        this.author=author;
        this.genre=genre;
        this.bookId=bookId;
        this.available=available;
        next=prev=null;
    }
}

// Library class
class Library{
    BookNode head,tail;

    // Add book at end
    void addBook(String title,String author,String genre,int id,boolean available){
        BookNode newNode=new BookNode(title,author,genre,id,available);

        if(head==null){
            head=tail=newNode;
        }else{
            tail.next=newNode;
            newNode.prev=tail;
            tail=newNode;
        }
    }

    // Remove book by ID
    void removeBook(int id){
        BookNode temp=head;

        while(temp!=null){
            if(temp.bookId==id){
                if(temp==head){
                    head=head.next;
                    if(head!=null) head.prev=null;
                }else if(temp==tail){
                    tail=tail.prev;
                    tail.next=null;
                }else{
                    temp.prev.next=temp.next;
                    temp.next.prev=temp.prev;
                }
                System.out.println("Book removed");
                return;
            }
            temp=temp.next;
        }
        System.out.println("Book not found");
    }

    // Display forward
    void displayForward(){
        BookNode temp=head;
        while(temp!=null){
            System.out.println(temp.bookId+" "+temp.title+" "+temp.author+" "+temp.available);
            temp=temp.next;
        }
    }

    // Display reverse
    void displayReverse(){
        BookNode temp=tail;
        while(temp!=null){
            System.out.println(temp.bookId+" "+temp.title+" "+temp.author+" "+temp.available);
            temp=temp.prev;
        }
    }

    // Count books
    int countBooks(){
        int count=0;
        BookNode temp=head;
        while(temp!=null){
            count++;
            temp=temp.next;
        }
        return count;
    }
}
public class LibraryManagementSystem{
    public static void main(String[] args){
        Library lib=new Library();

        lib.addBook("Java","James","Programming",101,true);
        lib.addBook("DSA","Mark","CS",102,false);

        lib.displayForward();
        System.out.println("Total books: "+lib.countBooks());

        lib.removeBook(101);
        lib.displayReverse();
    }
}
