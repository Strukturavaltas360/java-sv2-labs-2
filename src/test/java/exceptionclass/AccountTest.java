package exceptionclass;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AccountTest {
    @Test
    void createTest() {
        Account account = new Account("accNr", 1000);
        assertEquals("accNr", account.getAccountNumber());
        assertEquals(1000, account.getBalance());
        assertEquals(100_000, account.getMaxSubtract());
    }

    @Test
    void createTestNull() {
        assertThrows(IllegalArgumentException.class, () -> new Account(null, 1000));
    }

    @Test
    void subtract() {
        Account account = new Account("accNr", 1000);
        account.subtract(1000);
        assertEquals(0, account.getBalance());
    }

    @Test
    void subtractException() {
        Account account = new Account("accNr", 1000);
        assertThrows(InvalidAmountBankOperationException.class, () -> account.subtract(-100));
        assertThrows(InvalidAmountBankOperationException.class, () -> account.subtract(100_001));
        assertThrows(LowBalanceBankOperationException.class, () -> account.subtract(1001));
    }

    @Test
    void deposit() {
        Account account = new Account("accNr", 1000);
        account.deposit(100);
        assertEquals(1100, account.getBalance());
    }

    @Test
    void depositException() {
        Account account = new Account("accNr", 1000);
        assertThrows(InvalidAmountBankOperationException.class, () -> account.deposit(-100));
    }
}