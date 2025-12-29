public class EmployeeWages{
    static final int wage_per_hour = 20;
    static final int full_day_hour = 8;
    static final int part_time_hour = 8;
    static final int totalDay_per_month = 20;
    static final int totalHour_per_month = 100;
    static final int part_time=2;
    static final int full_time=1;
    static final int absent=0;
    public static void main(String[] args) {
        System.out.println("Welcome to Employee Wage Computation Program");
        int totalhour = 0;
        int totalday = 0;
        int totalWage = 0;
        while(totalhour<totalHour_per_month || totalday<totalDay_per_month){
            totalday++;
            int emp = (int)(Math.random()*3);  //Generate value  0, 1, 2
            int hour = 0;
            switch (emp) {
                case full_time:           //Case -> 1
                    hour = full_day_hour;
                    break;
                case part_time:          // Case -> 2
                    hour = part_time_hour;
                    break;
                default:                 // Case -> 0
                    hour = 0;
            }
            totalhour += hour;
            int dailyWage = hour * wage_per_hour;
            totalWage += dailyWage;

            System.out.println("Day " + totalday + " Hours: " + hour + " Daily Wage: " + dailyWage);
        }
        System.out.println("Total Working Days: " + totalday);
        System.out.println("Total Working Hours: " + totalhour);
        System.out.println("Total Monthly Wage: " + totalWage);
    }
}