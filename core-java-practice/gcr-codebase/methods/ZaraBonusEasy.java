public class ZaraBonusEasy{
    static final int N=10; // number of employees
    // generate old salary and years of service
    static double[][] generateData(){
        double[][] emp=new double[N][2];
        for(int i=0;i<N;i++){
            emp[i][0]=10000+(int)(Math.random()*90000);
            emp[i][1]=1+(int)(Math.random()*10);
        }
        return emp;
    }
    // calculate bonus and new salary

    static double[][] calculate(double[][] emp){
        double[][] res=new double[N][2];
        for(int i=0;i<N;i++){
            double sal=emp[i][0]; 
            double yrs=emp[i][1]; // years of service
            double rate=(yrs>5)?0.05:0.02;
            double bonus=sal*rate; // bonus amount
            res[i][0]=sal+bonus;   // new salary
            res[i][1]=bonus;       
        }
        return res;
    }
    static void display(double[][] emp,double[][] res){
        double sumOld=0,sumNew=0,sumBonus=0;
        System.out.println("Emp OldSal Years Bonus NewSal");
        for(int i=0;i<N;i++){
            double oldS=emp[i][0];
            double yrs=emp[i][1];
            double bonus=res[i][1];
            double newS=res[i][0];

            sumOld+=oldS;    
            sumNew+=newS; 
            sumBonus+=bonus;
            System.out.printf("%d %.0f %.0f %.2f %.2f\n", i+1,oldS,yrs,bonus,newS);
        }
        System.out.println("-----------------------------");
        System.out.printf("Tot %.0f %.2f %.2f\n",sumOld,sumBonus,sumNew);
    }
    public static void main(String[] args){
        double[][] emp=generateData();
        double[][] res=calculate(emp);
        display(emp,res);
    }
}
