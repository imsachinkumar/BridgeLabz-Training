 class Book {
    String title;
    String author;
    double price;

    //Default constructor
    Book(){
        title="Unknown";
        author="Unknown";
        price=0.0;
    }
    //Parameterized constructor
    Book(String t,String a,double p){
        title=t;
        author=a;
        price=p;
    }
    //Method to display details

    void display(){
        System.out.println("Author is : " +author);
        System.out.println("Title is : " +title);
        System.out.println("Price is : " +price);
    }
    public static void main(String[] args) {
        //Object created using default constructor
        Book b1=new Book();
        b1.display();
        //Object created using Parameterized constructor 
        Book b2=new Book("Java Basics","James Gasling",455.8);
        b2.display();
        
    }
}