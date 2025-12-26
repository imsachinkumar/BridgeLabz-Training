import java.util.*;
public class CalendarDisplay {
    // Method to get month name
    static String getMonthName(int month){
        String[] months={
            "January","February","March","April","May","June",
            "July","August","September","October","November","December"
        };
        return months[month-1];
    }
    // Method to check leap year
    static boolean isLeapYear(int year){
        return (year%400==0) || (year%4==0 && year%100!=0);
    }
    // Method to get number of days in a month
    static int getDaysInMonth(int month,int year){
        int[] days={31,28,31,30,31,30,31,31,30,31,30,31};
        if(month==2 && isLeapYear(year)) return 29;
        return days[month-1];
    }
    // Method to get first day using Gregorian calendar algorithm
    static int getFirstDay(int d,int m,int y){
        int y0=y-(14-m)/12;
        int x=y0+y0/4-y0/100+y0/400;
        int m0=m+12*((14-m)/12)-2;
        int d0=(d+x+(31*m0)/12)%7;
        return d0; // 0=Sun, 1=Mon, ... 6=Sat
    }
    static void displayCalendar(int month,int year){
        String monthName=getMonthName(month);
        int days=getDaysInMonth(month,year);
        int firstDay=getFirstDay(1,month,year);
        System.out.println("\n   "+monthName+" "+year);
        System.out.println("Sun Mon Tue Wed Thu Fri Sat");
        for(int i=0;i<firstDay;i++){
            System.out.print("    ");
        }
        for(int day=1;day<=days;day++){
            System.out.printf("%3d ",day);
            if((day+firstDay)%7==0) System.out.println();
        }
        System.out.println();
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter month (1-12): ");
        int month=sc.nextInt();
        System.out.print("Enter year: ");
        int year=sc.nextInt();
        displayCalendar(month,year);
        sc.close();
    }
}
