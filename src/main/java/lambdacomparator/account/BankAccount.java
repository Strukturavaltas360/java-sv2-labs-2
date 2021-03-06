package lambdacomparator.account;

import java.util.Objects;

public class BankAccount implements Comparable<BankAccount> {
    private String accountNumber;
    private String nameOfOwner;
    private int balance;

    public BankAccount(String accountNumber, String nameOfOwner, int balance) {
        this.accountNumber = accountNumber;
        this.nameOfOwner = nameOfOwner;
        this.balance = balance;
    }

    @Override
    public int compareTo(BankAccount o) {
        return accountNumber.compareTo(o.accountNumber);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BankAccount that = (BankAccount) o;
        return Objects.equals(accountNumber, that.accountNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(accountNumber);
    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "accountNumber='" + accountNumber + '\'' +
                ", nameOfOwner='" + nameOfOwner + '\'' +
                ", balance=" + balance +
                '}';
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public String getNameOfOwner() {
        return nameOfOwner;
    }

    public int getBalance() {
        return balance;
    }
}
