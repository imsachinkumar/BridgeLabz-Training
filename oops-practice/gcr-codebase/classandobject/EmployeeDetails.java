public class EmployeeDetails {
    String name;
    int id;
    int salary;

    //Method to display details
     void displayDetails(){
        System.out.println("Employee name is :" + name);
        System.out.println("Employee id is :" +id);
        System.out.println("Employee salary is :" +salary);

    }
    public static void main(String[] args) {
        //Creating Object
        EmployeeDetails emp=new EmployeeDetails();

        //Assigning value
        emp.name="Sachin";
        emp.id=1;
        emp.salary=20000;
        emp.displayDetails(); //calling method
    }
}