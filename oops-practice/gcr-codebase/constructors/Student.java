class Student{
    // Public variable
    public int rollNumber;
    // Protected variable (accessible in same package & subclasses)
    protected String name;
    // Private variable
    private double cgpa;
    Student(int r,String n,double c){
        rollNumber=r;
        name=n;
        cgpa=c;
    }
    // Public method to get CGPA
    public double getCGPA(){
        return cgpa;
    }
    // Public method to update CGPA
    public void setCGPA(double c){
        cgpa=c;
    }
}
// Subclass
class PostgraduateStudent extends Student{
    PostgraduateStudent(int r,String n,double c){
        super(r,n,c);
    }
    void displayDetails(){
        System.out.println("Roll Number: "+rollNumber); // public
        System.out.println("Name: "+name);              // protected
        System.out.println("CGPA: "+getCGPA());         // private via method
    }
    public static void main(String[] args){
        PostgraduateStudent p=new PostgraduateStudent(101,"Ravi",8.4);
        p.displayDetails();
    }
}
