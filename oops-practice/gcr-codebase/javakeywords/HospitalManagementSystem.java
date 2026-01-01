class Patient{
    static String hospitalName="City Hospital";
    static int totalPatients=0;
    final String patientID;
    // instance variables
    String name;
    int age;
    String ailment;
    // constructor using this keyword
    Patient(String patientID,String name,int age,String ailment){
        this.patientID=patientID;
        this.name=name;
        this.age=age;
        this.ailment=ailment;
        totalPatients++;
    }
    // static method to display total patients
    static void getTotalPatients(){
        System.out.println("Total Patients Admitted: "+totalPatients);
    }
    // method using instanceof to display details
    void displayDetails(Object obj){
        if(obj instanceof Patient){
            System.out.println("Hospital Name: "+hospitalName);
            System.out.println("Patient ID: "+patientID);
            System.out.println("Name: "+name);
            System.out.println("Age: "+age);
            System.out.println("Ailment: "+ailment);
        }
    }
}
public class HospitalManagementSystem{
    public static void main(String[] args){
        Patient p1=new Patient("P001","Lathika",30,"Flu");
        Patient p2=new Patient("P002","Lidiya",45,"Fracture");
        Patient.getTotalPatients();
        p1.displayDetails(p1);
        System.out.println();
        p2.displayDetails(p2);
    }
}
