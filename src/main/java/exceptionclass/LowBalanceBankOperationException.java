package exceptionclass;

public class LowBalanceBankOperationException extends InvalidBankOperationException {
    private double amount;
    private double balance;

    public LowBalanceBankOperationException(double amount, double balance) {
        super(String.format("Balance is low for this operation! (%.2f - %.2f < 0)", balance, amount));
        this.amount = amount;
        this.balance = balance;
    }

    public double getAmount() {
        return amount;
    }

    public double getBalance() {
        return balance;
    }
}
