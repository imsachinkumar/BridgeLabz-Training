package onlinevotingsystem;

// Abstract service defining election operations
public abstract class ElectionService {
    public abstract void castVote(Voter voter, Candidate candidate)
        throws DuplicateVoteException;

    public abstract void declareResult(Candidate[] candidates);
}
