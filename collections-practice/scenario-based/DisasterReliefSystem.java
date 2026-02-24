import java.util.*;

// Custom Exception
class InsufficientResourceException extends Exception {
    public InsufficientResourceException(String message) {
        super(message);
    }
}

// AreaRequest Class
class AreaRequest {
    private String areaName;
    private String resourceName;
    private int quantity;

    public AreaRequest(String areaName, String resourceName, int quantity) {
        this.areaName = areaName;
        this.resourceName = resourceName;
        this.quantity = quantity;
    }

    public String getAreaName() {
        return areaName;
    }

    public String getResourceName() {
        return resourceName;
    }

    public int getQuantity() {
        return quantity;
    }
}

// ReliefCenter Class
class ReliefCenter {
    private String centerName;
    private HashMap<String, Integer> resources;  
    private Queue<AreaRequest> requestQueue;   

    public ReliefCenter(String centerName) {
        this.centerName = centerName;
        this.resources = new HashMap<>();
        this.requestQueue = new LinkedList<>();
    }

    public String getCenterName() {
        return centerName;
    }

    // Add Resource
    public void addResource(String item, int quantity) {
        resources.put(item, resources.getOrDefault(item, 0) + quantity);
    }

    // Add Area Request
    public void addRequest(AreaRequest request) {
        requestQueue.offer(request); // FIFO
    }

    // Allocate Resources (FIFO)
    public void allocateResources() {
        System.out.println("\nAllocation Report for Center: " + centerName);

        while (!requestQueue.isEmpty()) {
            AreaRequest request = requestQueue.poll();

            try {
                processRequest(request);
                System.out.println("Allocated " + request.getQuantity() + " "
                        + request.getResourceName() + " to "
                        + request.getAreaName());
            } catch (InsufficientResourceException e) {
                System.out.println("Allocation Failed for "
                        + request.getAreaName() + ": " + e.getMessage());
            }
        }
    }

    private void processRequest(AreaRequest request)
            throws InsufficientResourceException {

        String item = request.getResourceName();
        int requestedQty = request.getQuantity();

        int availableQty = resources.getOrDefault(item, 0);

        if (availableQty < requestedQty) {
            throw new InsufficientResourceException(
                    "Not enough " + item + " in stock."
            );
        }

        resources.put(item, availableQty - requestedQty);
    }

    // Display Remaining Resources
    public void showRemainingResources() {
        System.out.println("\nRemaining Resources in " + centerName);
        resources.forEach((k, v) ->
                System.out.println(k + " : " + v));
    }
}

public class DisasterReliefSystem {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Map of relief centers
        Map<String, ReliefCenter> centerMap = new HashMap<>();

        // Create one Relief Center
        ReliefCenter center = new ReliefCenter("Central Relief Hub");

        // Add resources
        center.addResource("Food", 100);
        center.addResource("Water", 200);
        center.addResource("MedicalKit", 50);

        // Store in Map
        centerMap.put(center.getCenterName(), center);

        // Add Area Requests (FIFO order)
        center.addRequest(new AreaRequest("AreaA", "Food", 30));
        center.addRequest(new AreaRequest("AreaB", "Water", 100));
        center.addRequest(new AreaRequest("AreaC", "MedicalKit", 60)); // Will fail
        center.addRequest(new AreaRequest("AreaD", "Food", 50));

        // Allocate Resources
        center.allocateResources();

        // Show Remaining Stock
        center.showRemainingResources();

        sc.close();
    }
}