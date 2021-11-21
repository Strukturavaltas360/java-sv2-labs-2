package algorithmssum;

public class Transaction {
    private String accountNumber;
    private TransactionOperation transactionOperation;
    private double amount;

    public Transaction(String accountNumber, TransactionOperation transactionOperation, double amount) {
        this.accountNumber = accountNumber;
        this.transactionOperation = transactionOperation;
        this.amount = amount;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public TransactionOperation getTransactionOperation() {
        return transactionOperation;
    }

    public double getAmount() {
        return amount;
    }
}
