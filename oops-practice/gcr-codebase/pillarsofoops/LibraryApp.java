// Interface
interface Reservable{
    void reserveItem();
    boolean checkAvailability();
}
// Abstract class
abstract class LibraryItem{
    private int itemId;
    private String title,author;
    protected boolean available=true;
    //Constructor
    LibraryItem(int id,String t,String a){
        itemId=id;title=t;author=a;
    }
    public void getItemDetails(){
        System.out.println(title+" | "+author+" | "+(available?"Available":"Issued"));
    }
    abstract int getLoanDuration();
}
// Subclasses
class Book extends LibraryItem{
    Book(int i,String t,String a){
        super(i,t,a);
    }
    int getLoanDuration(){
        return 14;
    }
}
class Magazine extends LibraryItem{
    Magazine(int i,String t,String a){
        super(i,t,a);
    }
    int getLoanDuration(){
        return 7;
    }
}
class DVD extends LibraryItem implements Reservable{
    DVD(int i,String t,String a){
        super(i,t,a);
    }
    int getLoanDuration(){
        return 3;
    }
    public void reserveItem(){
        available=false;
    }
    public boolean checkAvailability(){
        return available;
    }
}
public class LibraryApp{
    public static void main(String[]args){
        LibraryItem[]items={
            new Book(1,"Java","James"),
            new Magazine(2,"Tech","Mark"),
            new DVD(3,"Movie","Nolan")
        };
        for(LibraryItem i:items){
            i.getItemDetails();
            System.out.println("Loan Days:"+i.getLoanDuration());
        }
    }
}
