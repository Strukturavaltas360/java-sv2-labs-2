package lambdacomparator.account;

import java.text.Collator;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;

public class BankAccounts {
    private List<BankAccount> bankAccounts;

    public BankAccounts(List<BankAccount> bankAccounts) {
        if (bankAccounts == null || bankAccounts.isEmpty()) {
            throw new IllegalArgumentException("List is empty!");
        }
        this.bankAccounts = bankAccounts;
    }

    public List<BankAccount> listBankAccountsByAccountNumber() {
        List<BankAccount> result = new ArrayList<>(bankAccounts);
        result.sort(Comparator.naturalOrder());
        return result;
    }

    public List<BankAccount> listBankAccountsByBalance() {
        List<BankAccount> result = new ArrayList<>(bankAccounts);
        result.sort(Comparator.comparing(BankAccount::getBalance,
                (o1, o2) -> Math.abs(o1) - Math.abs(o2)));
        return result;
    }

    public List<BankAccount> listBankAccountsByBalanceDesc() {
        List<BankAccount> result = new ArrayList<>(bankAccounts);
        result.sort(Comparator.comparing(BankAccount::getBalance, Comparator.reverseOrder()));
        return result;
    }

    public List<BankAccount> listBankAccountsByNameThenAccountNumber() {
        List<BankAccount> result = new ArrayList<>(bankAccounts);
        result.sort(Comparator
                .comparing(BankAccount::getNameOfOwner,
                        (o1, o2) -> Collator.getInstance().compare(o1.trim().toLowerCase(), o2.trim().toLowerCase()))
                .thenComparing(Comparator.naturalOrder()));
        return result;
    }

    public List<BankAccount> getBankAccounts() {
        return bankAccounts;
    }
}
