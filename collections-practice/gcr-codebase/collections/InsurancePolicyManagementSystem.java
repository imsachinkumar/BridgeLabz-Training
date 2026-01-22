import java.time.LocalDate;
import java.util.*;

// Policy class
class Policy {
    int policyNumber;
    String policyHolderName;
    LocalDate expiryDate;
    String coverageType;
    double premiumAmount;

    public Policy(int policyNumber, String policyHolderName,
                  LocalDate expiryDate, String coverageType,
                  double premiumAmount) {
        this.policyNumber = policyNumber;
        this.policyHolderName = policyHolderName;
        this.expiryDate = expiryDate;
        this.coverageType = coverageType;
        this.premiumAmount = premiumAmount;
    }

    @Override
    public String toString() {
        return policyNumber + " | " + policyHolderName + " | " +
               expiryDate + " | " + coverageType + " | " + premiumAmount;
    }
}

//Main Management Class
public class InsurancePolicyManagementSystem {

    //HashMap → fast access by policy number
    static Map<Integer, Policy> hashMap = new HashMap<>();
    static Map<Integer, Policy> linkedHashMap = new LinkedHashMap<>();     // LinkedHashMap → insertion order

    // TreeMap → sorted by expiry date
    static TreeMap<LocalDate, List<Policy>> treeMap = new TreeMap<>();

    // add policy
    public static void addPolicy(Policy policy) {

        hashMap.put(policy.policyNumber, policy);
        linkedHashMap.put(policy.policyNumber, policy);
        treeMap.putIfAbsent(policy.expiryDate, new ArrayList<>());
        treeMap.get(policy.expiryDate).add(policy);
    }

    //Retrieve Policy by number
    public static Policy getPolicyByNumber(int policyNumber) {
        return hashMap.get(policyNumber);
    }
    public static void policiesExpiringSoon() {

        System.out.println("\nPolicies expiring in next 30 days:");
        LocalDate today = LocalDate.now();
        LocalDate limit = today.plusDays(30);

        for (Map.Entry<LocalDate, List<Policy>> entry : treeMap.entrySet()) {
            LocalDate expiry = entry.getKey();

            if (!expiry.isBefore(today) && !expiry.isAfter(limit)) {
                for (Policy p : entry.getValue()) {
                    System.out.println(p);
                }
            }
        }
    }

    // Policy by name
    public static void policiesByHolder(String name) {

        System.out.println("\nPolicies for policyholder: " + name);

        for (Policy p : hashMap.values()) {
            if (p.policyHolderName.equalsIgnoreCase(name)) {
                System.out.println(p);
            }
        }
    }
// Remove Expire policies
    public static void removeExpiredPolicies() {

        LocalDate today = LocalDate.now();
        Iterator<Map.Entry<Integer, Policy>> iterator = hashMap.entrySet().iterator();

        while (iterator.hasNext()) {
            Policy p = iterator.next().getValue();

            if (p.expiryDate.isBefore(today)) {
                iterator.remove();
                linkedHashMap.remove(p.policyNumber);
            }
        }
        treeMap.headMap(today).clear();
    }
    public static void displayAllPolicies() {
        System.out.println("\nAll Policies (Insertion Order):");
        for (Policy p : linkedHashMap.values()) {
            System.out.println(p);
        }
    }
    public static void main(String[] args) {

        Policy p1 = new Policy(101, "Rahul",
                LocalDate.now().plusDays(10), "Health", 12000);

        Policy p2 = new Policy(102, "Amit",
                LocalDate.now().plusDays(40), "Auto", 8000);

        Policy p3 = new Policy(103, "Rahul",
                LocalDate.now().plusDays(20), "Home", 15000);

        Policy p4 = new Policy(104, "Neha",
                LocalDate.now().minusDays(5), "Health", 9000); // expired

        addPolicy(p1);
        addPolicy(p2);
        addPolicy(p3);
        addPolicy(p4);

        // Retrieve by policy number
        System.out.println("Policy 101: " + getPolicyByNumber(101));

        // Policies expiring soon
        policiesExpiringSoon();

        // Policies by policyholder
        policiesByHolder("Rahul");

        // Remove expired policies
        removeExpiredPolicies();

        // Display all remaining policies
        displayAllPolicies();
    }
}
