import java.lang.annotation.*;
import java.lang.reflect.Method;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@Repeatable(BugReports.class)
@interface BugReport {
    String description();
}

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface BugReports {
    BugReport[] value();
}

class Service {

    @BugReport(description = "Null pointer issue")
    @BugReport(description = "Performance problem")
    void process() {}
}

public class BugReportt{
    public static void main(String[] args) throws Exception {
        Method m = Service.class.getDeclaredMethod("process");
        BugReport[] bugs = m.getAnnotationsByType(BugReport.class);

        for (BugReport bug : bugs) {
            System.out.println(bug.description());
        }
    }
}
