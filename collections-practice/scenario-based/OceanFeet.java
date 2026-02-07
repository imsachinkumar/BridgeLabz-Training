import java.util.*;
class Vessel{
	
	private String vesselId;
	private String vesselName;
	private double averageSpeed;
	private String vesselType;
	
	//No Argument constructor
	public Vessel() {
	
	}
	
	public String getvesselId() {
		return vesselId;
	}
	
	public void setvesselId(String vesselId) {
		this.vesselId=vesselId;
	}
	
	public String getvesselName() {
		return vesselName;
	}
	
	public void setvesselName(String vesselName) {
		this.vesselName=vesselName;
	}
	
	public double getaverageSpeed() {
		return averageSpeed;
	}
	
	public void setaverageSpeed(double averageSpeed) {
		this.averageSpeed=averageSpeed;
	}
	
	public String getvesselType() {
		return vesselType;
	}
	
	public void setvesselType(String vesselType) {
		this.vesselType=vesselType;
	}
	
	public Vessel(String vesselId, String vesselName, double averageSpeed, String vesselType) {
        this.vesselId = vesselId;
        this.vesselName = vesselName;
        this.averageSpeed = averageSpeed;
        this.vesselType = vesselType;
    }
}


class VesselUtil{
	private List<Vessel> vesselList=new ArrayList<>();
	
	public List<Vessel> getvesselList() {
		return  vesselList;
	}
	public void setvesselList(List<Vessel> vesselList) {
		this.vesselList=vesselList;
	}
	
	public void addVesselPerformance(Vessel vessel) {
		vesselList.add(vessel);
	}
	
	public Vessel getVesselById(String vesselId) {
		for( Vessel v:vesselList) {
			if(v.getvesselId().equals(vesselId)) {
				return v;
			}
		}
		return null;
	}
	
	public List<Vessel> getHighPerformanceVessels(){
		List<Vessel> result=new ArrayList<>();
		double max_Speed=Double.MIN_VALUE;
		
		for(Vessel v:vesselList) {
			if(v.getaverageSpeed()>max_Speed) {
				max_Speed=v.getaverageSpeed();
			
				
				}
		}
		for(Vessel v:vesselList) {
			if(v.getaverageSpeed()==max_Speed) {
				result.add(v);
			}
		}
		return result;
		
		
	}
}

public class OceanFeet {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		VesselUtil util = new VesselUtil();
		System.out.print("Enter the number of vessels to be added :");
		int n=sc.nextInt();
		sc.nextLine();
		System.out.print("Enter vessel details :");
		for(int i=0;i<n;i++) {
			String input=sc.nextLine();
			String[]arr=input.split(":");
			
			Vessel obj=new Vessel(arr[0],arr[1],Double.parseDouble(arr[2]),arr[3]);
			util.addVesselPerformance(obj);
			
		}
		System.out.println("Enter the Vessel Id to cehck speed :");
		String id=sc.nextLine();
		
		Vessel found=util.getVesselById(id);
		if(found!=null) {
			System.out.print(found.getvesselId()+ "|" + found.getvesselName() + "|" + found.getvesselType() + "|" + found.getaverageSpeed() +"knots");
		}else {
			System.out.println("Vessel Id"+ id +" not found");
		}
		
		
		System.out.println("High performance vessels are");
		
		List<Vessel> ans=util.getHighPerformanceVessels();
		for(Vessel v:ans) {
			System.out.print(v.getvesselId()+ "|"+ v.getvesselName() + "|" + v.getvesselType() + "|" + v.getaverageSpeed() + "knots");
		}
		

	}

}
