public class Circle{
    double radius;
    // Method to calculate area
    double calculateArea(){
        return Math.PI*radius*radius;
    }
    // Method to calculate circumference
    double calculateCircumference(){
        return 2*Math.PI*radius;
    }
    public static void main(String[] args){
        Circle c=new Circle(); //creating object
        c.radius=2.5;
        System.out.printf("Area of circle: %.4f\n",c.calculateArea());
        System.out.printf("Circumference of circle: %.4f\n",c.calculateCircumference());
    }
}
