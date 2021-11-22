package algorithmscount.bankaccount;

import java.util.List;

public class BankAccountConditionCounter {
    public int countWithBalanceGreaterThan(List<BankAccount> bankAccounts, double minBalance) {
        int counter = 0;
        for (BankAccount bankAccount: bankAccounts) {
            if (bankAccount.getBalance() > minBalance) {
                counter++;
            }
        }
        return counter;
    }
}
