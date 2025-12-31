class Course{
    String courseName;
    int duration;
    double fee;
    // Class variable 
    static String instituteName="Tech Academy";
    // Constructor to initialize course details
    Course(String name,int d,double f){
        courseName=name;
        duration=d;
        fee=f;
    }
    // Instance method to display course details
    void displayDetails(){
        System.out.println("Institute: "+instituteName);
        System.out.println("Course Name: "+courseName);
        System.out.println("Duration: "+duration+" weeks");
        System.out.println("Fee: "+fee);
        System.out.println();
    }
    // Class method to update institute name
    static void updateName(String newName){
        instituteName=newName;
    }
    public static void main(String[] args){
        Course c1=new Course("Java Programming",8,8000);
        Course c2=new Course("Web Development",10,10000);
        c1.displayDetails();
        c2.displayDetails();
        Course.updateName("Code Learning Hub");
        c1.displayDetails();
        c2.displayDetails();
    }
}
