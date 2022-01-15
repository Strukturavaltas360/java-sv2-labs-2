package lambdacomparator.account;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class BankAccountsTest {
    BankAccount ba1 = new BankAccount("3451", "owner1", -100);
    BankAccount ba2 = new BankAccount("3251", "owner1", 110);
    BankAccount ba3 = new BankAccount("3431", "", 0);
    BankAccount ba4 = new BankAccount("3651", "owner4", 30);
    BankAccount ba5 = new BankAccount("3491", "owner5", -200);
    BankAccounts bankAccounts = new BankAccounts(List.of(ba1, ba2, ba3, ba4, ba5));

    @Test
    void listBankAccountsByAccountNumber() {
        assertEquals(List.of(ba2, ba3, ba1, ba5, ba4), bankAccounts.listBankAccountsByAccountNumber());
    }

    @Test
    void listBankAccountsByBalance() {
        assertEquals(List.of(ba3, ba4, ba1, ba2, ba5), bankAccounts.listBankAccountsByBalance());
    }

    @Test
    void listBankAccountsByBalanceDesc() {
        assertEquals(List.of(ba2, ba4, ba3, ba1, ba5), bankAccounts.listBankAccountsByBalanceDesc());
    }

    @Test
    void listBankAccountsByNameThenAccountNumber() {
        assertEquals(List.of(ba3, ba2, ba1, ba4, ba5), bankAccounts.listBankAccountsByNameThenAccountNumber());
    }
}