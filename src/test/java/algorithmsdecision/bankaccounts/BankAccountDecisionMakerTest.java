package algorithmsdecision.bankaccounts;

import org.junit.jupiter.api.Test;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class BankAccountDecisionMakerTest {

    @Test
    void containsBalanceGreaterThanTest() {
        BankAccount ba1 = new BankAccount("OW1", "AC111");
        BankAccount ba2 = new BankAccount("OW2", "AC222");
        BankAccount ba3 = new BankAccount("OW3", "AC333");
        BankAccount ba4 = new BankAccount("OW4", "AC444");
        ba1.deposit(2100);
        ba2.deposit(2200);
        ba3.deposit(2300);
        ba4.deposit(2400);
        ba1.withdraw(50);
        ba2.withdraw(51);
        ba3.withdraw(52);
        ba4.withdraw(53);
        List<BankAccount> bankAccounts = Arrays.asList(ba1, ba2, ba3, ba4);

        BankAccountDecisionMaker bankAccountDecisionMaker = new BankAccountDecisionMaker();

        assertTrue(bankAccountDecisionMaker.containsBalanceGreaterThan(bankAccounts, 2340));
        assertFalse(bankAccountDecisionMaker.containsBalanceGreaterThan(bankAccounts, 2400));
    }
}