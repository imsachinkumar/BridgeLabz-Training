class Book{
    public String ISBN;
    // Protected variable
    protected String title;
    // Private variable
    private String author;
    Book(String i,String t,String a){
        ISBN=i;
        title=t;
        author=a;
    }
    // Setter for author
    public void setAuthor(String a){
        author=a;
    }
    // Getter for author
    public String getAuthor(){
        return author;
    }
}
// Subclass to demonstrate access modifiers
class EBook extends Book{
    EBook(String i,String t,String a){
        super(i,t,a);
    }
    void displayDetails(){
        System.out.println("ISBN: "+ISBN);       // public
        System.out.println("Title: "+title);     // protected
        System.out.println("Author: "+getAuthor()); // private via method
    }
    public static void main(String[] args){
        EBook e=new EBook("978-12345","Java Guide","James");
        e.displayDetails();
    }
}
