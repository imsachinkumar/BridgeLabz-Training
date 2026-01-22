import java.util.*;
public class VotingSystem {

    // HashMap for storing votes
    static Map<String, Integer> voteMap = new HashMap<>();

    // LinkedHashMap for maintaining order of voting
    static Map<String, Integer> voteOrderMap = new LinkedHashMap<>();
    public static void castVote(String candidate) {
    voteMap.put(candidate, voteMap.getOrDefault(candidate, 0) + 1);

        // Update LinkedHashMap (maintains order)
        voteOrderMap.put(candidate,
                voteOrderMap.getOrDefault(candidate, 0) + 1);
    }
    public static void displayVoteOrder() {
        System.out.println("\nVotes in Order of Casting:");
        for (Map.Entry<String, Integer> entry : voteOrderMap.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
    public static void displaySortedResults() {
        // TreeMap sorts keys automatically
        TreeMap<String, Integer> sortedResults = new TreeMap<>(voteMap);

        System.out.println("\nFinal Results (Sorted Order):");
        for (Map.Entry<String, Integer> entry : sortedResults.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
    public static void main(String[] args) {

        // Cast votes
        castVote("Alice");
        castVote("Bob");
        castVote("Alice");
        castVote("Charlie");
        castVote("Bob");
        castVote("Alice");

        // Display vote order
        displayVoteOrder();

        // Display sorted results
        displaySortedResults();
    }
}
