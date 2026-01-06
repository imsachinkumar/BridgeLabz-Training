// Interface
interface GPS{
    void updateLocation(String l);
    String getCurrentLocation();
}
// Abstract class
abstract class Vehicle{
    private String id,driver;
    protected double rate;
    Vehicle(String i,String d,double r){
        id=i;driver=d;rate=r;
    }
    public void getVehicleDetails(){
        System.out.println(driver+" | Rate:"+rate);
    }
    abstract double calculateFare(double km);
}
// Subclasses
class Car extends Vehicle implements GPS{
    private String loc="Unknown";
    Car(String i,String d){super(i,d,15);}
    double calculateFare(double km){
        return km*rate;
    }
    public void updateLocation(String l){
        loc=l;
    }
    public String getCurrentLocation(){
        return loc;
    }
}

class Bike extends Vehicle{
    Bike(String i,String d){
        super(i,d,8);
    }
    double calculateFare(double km){
        return km*rate;
    }
}

class Auto extends Vehicle{
    Auto(String i,String d){
        super(i,d,10);
    }
    double calculateFare(double km){
        return km*rate;
    }
}
public class RideApp{
    public static void main(String[]args){
        Vehicle[]rides={
            new Car("C1","John"),
            new Bike("B1","Alex"),
            new Auto("A1","Sam")
        };

        for(Vehicle v:rides){
            v.getVehicleDetails();
            System.out.println("Fare for 10km:"+v.calculateFare(10));
        }
    }
}
