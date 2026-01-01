class Employee{
    // static variable shared by all employees
    static String companyName="Tech Solutions Inc.";
    static int totalEmployees=0;
    final int id;
    // instance variables
    String name;
    String designation;

    // constructor using this keyword
    Employee(int id,String name,String designation){
        this.id=id;
        this.name=name;
        this.designation=designation;
        totalEmployees++;
    }
    // static method to display total employees
    static void displayTotalEmployees(){
        System.out.println("Total Employees: "+totalEmployees);
    }
    // method using instanceof to display details
    void displayDetails(Object obj){
        if(obj instanceof Employee){
            System.out.println("Company Name: "+companyName);
            System.out.println("Employee ID: "+id);
            System.out.println("Name: "+name);
            System.out.println("Designation: "+designation);
        }
    }
}
public class EmployeeManagementSystem{
    public static void main(String[] args){
        Employee e1=new Employee(101,"Thamarai","Software Engineer");
        Employee e2=new Employee(102,"Rohan","Project Manager");
        Employee.displayTotalEmployees();
        e1.displayDetails(e1);
        System.out.println();
        e2.displayDetails(e2);
    }
}
