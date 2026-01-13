package onlinevotingsystem;

// Concrete implementation of ElectionService
public class ElectionServiceImpl extends ElectionService {

    @Override
    public void castVote(Voter voter, Candidate candidate)
            throws DuplicateVoteException {

        if (voter.hasVoted()) {
            throw new DuplicateVoteException("Voter has already voted!");
        }

        Vote vote = new Vote(voter, candidate);
        vote.getCandidate().addVote();
        voter.markVoted();
    }

    @Override
    public void declareResult(Candidate[] candidates) {
        System.out.println("Election Results:");

        for (int i = 0; i < candidates.length; i++) {
            System.out.println(
                candidates[i].getName() + " : " +
                candidates[i].getVoteCount() + " votes"
            );
        }
    }
}
