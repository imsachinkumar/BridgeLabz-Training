import java.util.*;
import java.util.stream.*;

public class InvoiceCreation {
    static class Invoice {
        int transactionId;

        Invoice(int transactionId) {
            this.transactionId = transactionId;
        }
    }

    public static void main(String[] args) {
        // Transaction IDs
        List<Integer> transactionIds = Arrays.asList(1001, 1002, 1003);

        // Create Invoice objects
        List<Invoice> invoices = transactionIds.stream().map(Invoice::new).collect(Collectors.toList());
        // Print invoice IDs
        invoices.forEach(i ->System.out.println("Invoice for Transaction ID: " + i.transactionId));
    }
}
