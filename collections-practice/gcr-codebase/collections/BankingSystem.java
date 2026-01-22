import java.util.*;
public class BankingSystem {
    // HashMap → AccountNumber -> Balance
    static Map<Integer, Integer> accountMap = new HashMap<>();

    // Queue → withdrawal requests (AccountNumber, Amount)
    static Queue<int[]> withdrawalQueue = new LinkedList<>();

    public static void createAccount(int accountNumber, int balance) {
        accountMap.put(accountNumber, balance);
    }

    public static void requestWithdrawal(int accountNumber, int amount) {
        withdrawalQueue.add(new int[]{accountNumber, amount});
    }
    public static void processWithdrawals() {
        System.out.println("\nProcessing Withdrawals:");

        while (!withdrawalQueue.isEmpty()) {
            int[] request = withdrawalQueue.remove();
            int accNo = request[0];
            int amount = request[1];

            if (!accountMap.containsKey(accNo)) {
                System.out.println("Account not found: " + accNo);
                continue;
            }

            int balance = accountMap.get(accNo);

            if (balance >= amount) {
                accountMap.put(accNo, balance - amount);
                System.out.println("Withdrawal successful for Account "
                        + accNo + " | Remaining Balance: " + (balance - amount));
            } else {
                System.out.println("Insufficient balance for Account " + accNo);
            }
        }
    }

    public static void displayAccountsSortedByBalance() {

        // TreeMap → Balance -> List of Account Numbers
        TreeMap<Integer, List<Integer>> sortedMap = new TreeMap<>();

        for (Map.Entry<Integer, Integer> entry : accountMap.entrySet()) {
            int accNo = entry.getKey();
            int balance = entry.getValue();

            sortedMap.putIfAbsent(balance, new ArrayList<>());
            sortedMap.get(balance).add(accNo);
        }

        System.out.println("\nAccounts Sorted by Balance:");
        for (Map.Entry<Integer, List<Integer>> entry : sortedMap.entrySet()) {
            for (int accNo : entry.getValue()) {
                System.out.println("Account: " + accNo +
                        " | Balance: " + entry.getKey());
            }
        }
    }
    public static void main(String[] args) {
        // Create accounts
        createAccount(101, 5000);
        createAccount(102, 12000);
        createAccount(103, 8000);

        // Withdrawal requests
        requestWithdrawal(101, 2000);
        requestWithdrawal(103, 9000);
        requestWithdrawal(102, 3000);

        // Process withdrawals
        processWithdrawals();

        // Display accounts sorted by balance
        displayAccountsSortedByBalance();
    }
}
