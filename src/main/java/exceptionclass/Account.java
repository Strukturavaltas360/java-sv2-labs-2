package exceptionclass;

public class Account {
    private String accountNumber;
    private double balance;
    private double maxSubtract;

    public Account(String accountNumber, double balance) {
        if (accountNumber == null) {
            throw new IllegalArgumentException("Accountnumber is null!");
        }
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.maxSubtract = 100_000.0;
    }

    public void subtract(double amount) {
        if (amount < 0 || amount > maxSubtract) {
            throw new InvalidAmountBankOperationException(amount, maxSubtract);
        }
        if (amount > balance) {
            throw new LowBalanceBankOperationException(amount, balance);
        }
        balance -= amount;
    }

    public void deposit(double amount) {
        if (amount < 0) {
            throw new InvalidAmountBankOperationException(amount);
        }
        balance += amount;
    }

    public void setMaxSubtract(double maxSubtract) {
        this.maxSubtract = maxSubtract;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public double getMaxSubtract() {
        return maxSubtract;
    }
}
