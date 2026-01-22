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

    // Ensure uniqueness based on policy number
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Policy)) return false;
        Policy p = (Policy) obj;
        return this.policyNumber == p.policyNumber;
    }

    @Override
    public int hashCode() {
        return Objects.hash(policyNumber);
    }

    @Override
    public String toString() {
        return policyNumber + " | " + policyHolderName + " | " +
               expiryDate + " | " + coverageType + " | " + premiumAmount;
    }
}
public class PolicyStorage {
    public static void main(String[] args) {
        //HashSet → fast lookup
        Set<Policy> hashSet = new HashSet<>();

        // LinkedHashSet → insertion order
        Set<Policy> linkedHashSet = new LinkedHashSet<>();

        // TreeSet → sorted by expiry date
        Set<Policy> treeSet = new TreeSet<>(
            (p1, p2) -> {
                int cmp = p1.expiryDate.compareTo(p2.expiryDate);
                if (cmp == 0) {
                    return p1.policyNumber - p2.policyNumber;
                }
                return cmp;
            }
        );
        Policy p1 = new Policy(101, "Rahul",
                LocalDate.now().plusDays(20), "Health", 12000);

        Policy p2 = new Policy(102, "Amit",
                LocalDate.now().plusDays(10), "Auto", 8000);

        Policy p3 = new Policy(101, "Duplicate Rahul",
                LocalDate.now().plusDays(30), "Health", 12000); // duplicate

        // Add policies to all sets
        hashSet.add(p1);
        hashSet.add(p2);
        hashSet.add(p3);

        linkedHashSet.add(p1);
        linkedHashSet.add(p2);
        linkedHashSet.add(p3);

        treeSet.add(p1);
        treeSet.add(p2);
        treeSet.add(p3);
        System.out.println("HashSet:");
        for (Policy p : hashSet) System.out.println(p);

        System.out.println("\nLinkedHashSet:");
        for (Policy p : linkedHashSet) System.out.println(p);

        System.out.println("\nTreeSet (Sorted by Expiry Date):");
        for (Policy p : treeSet) System.out.println(p);
    }
}
