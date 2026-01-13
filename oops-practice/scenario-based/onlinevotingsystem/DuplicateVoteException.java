package onlinevotingsystem;

// Custom exception thrown when a voter tries to vote more than once
public class DuplicateVoteException extends Exception {
    public DuplicateVoteException(String message) {
        super(message);
    }
}
