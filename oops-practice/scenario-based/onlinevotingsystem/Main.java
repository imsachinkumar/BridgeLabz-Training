package onlinevotingsystem;
public class Main {
    public static void main(String[] args) {
        try {
            // Register voters
            Voter v1 = new Voter(1, "Sachin");
            Voter v2 = new Voter(2, "Rahul");

            // Create candidates
            Candidate c1 = new Candidate(101, "Candidate A");
            Candidate c2 = new Candidate(102, "Candidate B");

            Candidate[] candidates = { c1, c2 };

            // Election service
            ElectionService service = new ElectionServiceImpl();

            // Cast votes
            service.castVote(v1, c1);
            service.castVote(v2, c2);

            // Uncomment to test duplicate voting exception
            // service.castVote(v1, c2);

            // Declare result
            service.declareResult(candidates);

        } catch (DuplicateVoteException e) {
            System.out.println(e.getMessage());
        }
    }
}
