class Person{
    String name;
    int age;
    // Parameterized constructor
    Person(String n,int a){
        name=n;
        age=a;
    }
    // Copy constructor Creates a new object by copying another Person object
    Person(Person p){
        name=p.name;
        age=p.age;
    }
    // Method to display details
    void display(){
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
        System.out.println();
    }
    public static void main(String[] args){
        // Original object
        Person p1=new Person("Amit",22);
        // New object created using copy constructor
        Person p2=new Person(p1);
        System.out.println("Original Person:");
        p1.display();
        System.out.println("Cloned Person:");
        p2.display();
    }
}
