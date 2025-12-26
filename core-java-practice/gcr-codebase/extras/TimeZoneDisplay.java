import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
public class TimeZoneDisplay{
    //Method to display current time of given zone
    static void showTime(String name,String id){
        ZonedDateTime time=ZonedDateTime.now(ZoneId.of(id));
        DateTimeFormatter fmt=DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss z");
        System.out.println(name+" Time: "+time.format(fmt));
    }
    public static void main(String[] args){
        showTime("GMT","GMT"); //Greenwich Mean Time
        showTime("IST","Asia/Kolkata"); //Indian Standard Time
        showTime("PST","America/Los_Angeles"); //Pacific Standard Time
    }
}
