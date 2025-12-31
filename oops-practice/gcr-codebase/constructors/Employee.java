class Employee{
    public int employeeID;
    protected String department;
    private double salary;
    // Constructor
    Employee(int id,String dept,double sal){
        employeeID=id;
        department=dept;
        salary=sal;
    }
    // Public method to modify salary
    public void setSalary(double s){
        salary=s;
    }
    // Public method to get salary
    public double getSalary(){
        return salary;
    }
}
// Subclass to demonstrate access
class Manager extends Employee{
    Manager(int id,String dept,double sal){
        super(id,dept,sal);
    }
    void displayDetails(){
        System.out.println("Employee ID: "+employeeID); // public
        System.out.println("Department: "+department);  // protected
        System.out.println("Salary: ₹"+getSalary());    // private via method
    }
    public static void main(String[] args){
        Manager m=new Manager(501,"IT",75000);
        m.displayDetails();
    }
}
