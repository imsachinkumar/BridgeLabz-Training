import java.util.*;

// Custom Exception
class InvalidWaterLevelException extends Exception {
    public InvalidWaterLevelException(String message) {
        super(message);
    }
}

// WaterTank Class
class WaterTank {
    private String tankId;
    private double capacity;
    private double currentLevel;

    public WaterTank(String tankId, double capacity, double currentLevel)
            throws InvalidWaterLevelException {

        if (currentLevel > capacity) {
            throw new InvalidWaterLevelException(
                    "Current level cannot exceed capacity for Tank " + tankId);
        }

        this.tankId = tankId;
        this.capacity = capacity;
        this.currentLevel = currentLevel;
    }

    public String getTankId() {
        return tankId;
    }

    public double getCapacity() {
        return capacity;
    }

    public double getCurrentLevel() {
        return currentLevel;
    }

    // Calculate usage percentage
    public double getUsagePercentage() {
        return (currentLevel / capacity) * 100;
    }

    // Alert if below 20%
    public void checkAlert() {
        if (getUsagePercentage() < 20) {
            System.out.println("⚠ ALERT: Tank " + tankId + " is below 20% level!");
        }
    }

    @Override
    public String toString() {
        return "Tank ID: " + tankId +
                ", Capacity: " + capacity +
                ", Current Level: " + currentLevel +
                ", Usage%: " + String.format("%.2f", getUsagePercentage());
    }
}

// Main Class
public class SmartWaterTankSystem {

    public static void main(String[] args) {
        List<WaterTank> tanks = new ArrayList<>();

        try {
            tanks.add(new WaterTank("T1", 1000, 800));
            tanks.add(new WaterTank("T2", 1500, 200));
            tanks.add(new WaterTank("T3", 1200, 100));
            tanks.add(new WaterTank("T4", 2000, 50));
            // tanks.add(new WaterTank("T5", 1000, 1200)); // Exception Example
        } catch (InvalidWaterLevelException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("Tank Details");

        for (WaterTank tank : tanks) {
            System.out.println(tank);
            tank.checkAlert();
        }

        // Sort tanks by lowest water level
        tanks.sort(Comparator.comparingDouble(WaterTank::getCurrentLevel));

        System.out.println("\n---- Tanks Sorted By Lowest Level ----");
        for (WaterTank tank : tanks) {
            System.out.println(tank);
        }
    }
}