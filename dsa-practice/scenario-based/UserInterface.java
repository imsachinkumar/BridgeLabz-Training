import java.util.Scanner;

class InvalidFlightException extends Exception{
	public InvalidFlightException(String message) {
		super(message);
		
	}
}

class FlightUtil{
	
	public boolean validateFlightNumber(String flightNumber) throws InvalidFlightException{
		if(!flightNumber.matches("FL-[1-9][0-9]{3}")) {
			throw new InvalidFlightException("The flight number "+ flightNumber + "is invalid");
		}
		return true;
	}
	
	public boolean validateFlightName(String flightName) throws InvalidFlightException{
		if(!(flightName.equals("SpiceJet")|| 
		   flightName.equals("Vistara") ||
		   flightName.equals("IndiGo")  ||
		   flightName.equals("Air Arabia"))) {
			throw new InvalidFlightException("The flightName "+ flightName + "is invalid");
		}
		return true;
	}
	
	
	public boolean validatePassengerCount(int passengerCount, String flightName) throws InvalidFlightException{
		int maxCapacity = 0;

        if (flightName.equals("SpiceJet"))
            maxCapacity = 396;
        else if (flightName.equals("Vistara"))
            maxCapacity = 615;
        else if (flightName.equals("IndiGo"))
            maxCapacity = 230;
        else if (flightName.equals("Air Arabia"))
            maxCapacity = 130;

        if (passengerCount <= 0 || passengerCount > maxCapacity) {
            throw new InvalidFlightException(
                "The passenger count " + passengerCount +
                " is invalid for " + flightName
            );
        }
        return true;
	}
	public double calculateFuelToFillTank(String flightName, double currentFuelLevel) throws InvalidFlightException {
		int capacity=0;
		if(flightName.equals("SpiceJet"))
			capacity=200000;
		
		if(flightName.equals("Vistara"))
			capacity=200000;
		if(flightName.equals("IndiGo"))
			capacity=200000;
		if(flightName.equals("Air Arabia"))
			capacity=200000;
		
		if(currentFuelLevel<=0 || currentFuelLevel>capacity) {
			throw new InvalidFlightException("Invalid fuel level for "+ flightName);
		}
		return capacity-currentFuelLevel;
		
	}
}


public class UserInterface{

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		FlightUtil util=new FlightUtil();
		try {
		// TODO Auto-generated method stub
		System.out.println("Enter Flight Details :");
		
		String input=sc.nextLine();
		String[] data=input.split(":");
		
		String flightNumber = data[0];
        String flightName = data[1];
        int passengerCount = Integer.parseInt(data[2]);
        double fuelLevel = Double.parseDouble(data[3]);
		

        util.validateFlightNumber(flightNumber);
        util.validateFlightName(flightName);
        util.validatePassengerCount(passengerCount, flightName);

        double fuelRequired =
            util.calculateFuelToFillTank(flightName, fuelLevel);

        System.out.println(
            "Fuel required to fill the tank: " +
            fuelRequired + " liters"
        );

    } catch (InvalidFlightException e) {
        System.out.println(e.getMessage());
		
		}
		

	}

}
