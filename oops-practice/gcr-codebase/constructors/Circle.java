class Circle{
    double radius;
    // Calls the parameterized constructor with a default value
    Circle(){
        this(1.0); // constructor chaining
    }
    // Parameterized constructor
    Circle(double r){
        radius=r;
    }
    // Method to calculate area of the circle
    double calculateArea(){
        return Math.PI*radius*radius;
    }
    // Method to display circle details
    void display(){
        System.out.println("Radius: "+radius);
        System.out.println("Area: "+calculateArea());
        System.out.println();
    }
    public static void main(String[] args){
        // Object created using default constructor
        Circle c1=new Circle();
        c1.display();
        // Object created using parameterized constructor
        Circle c2=new Circle(5.5);
        c2.display();
    }
}
