import java.util.Scanner;

public class EmployeeBonus {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        
        double[] salary=new double[10];     // Arrays to store salary and years of service of 10 employees
        double[] yearsOfService=new double[10];
        double[] bonus=new double[10];             // Arrays to store bonus amount and new salary
        double[] newSalary=new double[10];

        double totalBonus=0.0;
        double totalOldSalary=0.0;
        double totalNewSalary=0.0;

        // Loop to take input from the user
        for(int i=0;i<10;i++){
            System.out.println("Enter details for Employee "+(i+1));
            System.out.print("Salary: ");
            double sal=sc.nextDouble();
            System.out.print("Years of Service: ");
            double years=sc.nextDouble();

            if(sal<=0 || years<0){
                System.out.println("Invalid input! Please enter again.\n");
                i--;                    // decrement index to retry the same employee
                continue;
            }
            salary[i]=sal;
            yearsOfService[i]=years;
        }
        for(int i=0;i<10;i++){                 // Loop to calculate bonus and new salary
            if(yearsOfService[i]>5){                     // Calculate bonus
                bonus[i]=salary[i]*0.05;
            }else{
                bonus[i]=salary[i]*0.02;
            }
            // Calculate new salary
            newSalary[i]=salary[i]+bonus[i];
            // Calculate totals
            totalBonus+=bonus[i];
            totalOldSalary+=salary[i];
            totalNewSalary+=newSalary[i];
        }
        System.out.println("\n----- Salary Summary -----");
        System.out.println("Total Old Salary = "+totalOldSalary);
        System.out.println("Total Bonus Paid = "+totalBonus);
        System.out.println("Total New Salary = "+totalNewSalary);
        sc.close();
    }
}
