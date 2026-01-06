// Interface
interface MedicalRecord{
    void addRecord(String r);
    void viewRecords();
}
// Abstract class
abstract class Patient{
    private int id;
    private String name;
    protected int age;
    Patient(int i,String n,int a){
        id=i;name=n;age=a;
    }
    public void getPatientDetails(){
        System.out.println(name+" | Age:"+age);
    }
    abstract double calculateBill();
}
// Subclasses
class InPatient extends Patient implements MedicalRecord{
    private String record="";
    InPatient(int i,String n,int a){
        super(i,n,a);
    }
    double calculateBill(){
        return 5000;
    }
    public void addRecord(String r){
        record=r;
    }
    public void viewRecords(){
        System.out.println(record);
    }
}
class OutPatient extends Patient{
    OutPatient(int i,String n,int a){
        super(i,n,a);
    }
    double calculateBill(){
        return 500;
    }
}
public class HospitalApp{
    public static void main(String[]args){
        Patient[]patients={
            new InPatient(1,"Amit",30),
            new OutPatient(2,"Riya",25)
        };
        for(Patient p:patients){
            p.getPatientDetails();
            System.out.println("Bill:"+p.calculateBill());
        }
    }
}
