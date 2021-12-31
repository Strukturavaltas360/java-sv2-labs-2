package exceptionclass;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class BankTest {
    Account account1 = new Account("account1", 1000);
    Account account2 = new Account("account2", 2000);

    List<Account> accounts = new ArrayList<>();

    @BeforeEach
    void init() {
        accounts.add(account1);
        accounts.add(account2);
    }

    @Test
    void createTest() {
        Bank bank = new Bank(accounts);
        assertEquals(accounts, bank.getAccounts());
    }

    @Test
    void createTestException() {
        assertThrows(IllegalArgumentException.class, () -> new Bank(null));
    }

    @Test
    void subtract() {
        Bank bank = new Bank(accounts);
        bank.subtract("account1", 100);
        assertEquals(900, account1.getBalance());
    }

    @Test
    void subtractException() {
        Bank bank = new Bank(accounts);
        assertThrows(InvalidAccountNumberBankOperationException.class, () -> bank.subtract("account3", 100));
        assertThrows(InvalidAmountBankOperationException.class, () -> bank.subtract("account1", -100));
        assertThrows(InvalidAmountBankOperationException.class, () -> bank.subtract("account1", 100_001));
        assertThrows(LowBalanceBankOperationException.class, () -> bank.subtract("account1", 1001));
    }

    @Test
    void deposit() {
        Bank bank = new Bank(accounts);
        bank.deposit("account2", 100);
        assertEquals(2100, account2.getBalance());
    }

    @Test
    void depositException() {
        Bank bank = new Bank(accounts);
        assertThrows(InvalidAccountNumberBankOperationException.class, () -> bank.deposit("account3", 100));
        assertThrows(InvalidAmountBankOperationException.class, () -> bank.deposit("account1", -100));
    }
}