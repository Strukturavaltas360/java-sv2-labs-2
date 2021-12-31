package exceptionclass;

import java.util.ArrayList;
import java.util.List;

public class Bank {
    private List<Account> accounts;

    public Bank(List<Account> accounts) {
        if (accounts == null) {
            throw new IllegalArgumentException("Accounts is null!");
        }
        this.accounts = accounts;
    }

    public void subtract(String accountNumber, double amount) {
        Account account = findAccount(accountNumber);
        account.subtract(amount);
    }

    public void deposit(String accountNumber, double amount) {
        Account account = findAccount(accountNumber);
        account.deposit(amount);
    }

    private Account findAccount(String accountNumber) {
        for (Account account: accounts) {
            if (account.getAccountNumber().equals(accountNumber)) {
                return account;
            }
        }
        throw new InvalidAccountNumberBankOperationException(accountNumber);
    }

    public List<Account> getAccounts() {
        return accounts;
    }
}
