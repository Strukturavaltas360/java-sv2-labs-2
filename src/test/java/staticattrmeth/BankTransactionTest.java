package staticattrmeth;

import classstructureintegrate.Bank;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BankTransactionTest {
    @BeforeEach
    void init() {
        BankTransaction.initTheDay();
        new BankTransaction(1_000);
        new BankTransaction(10_000);
        new BankTransaction(5_000);
        new BankTransaction(2_000);
    }

    @Test
    void getAverageOfTransaction() {
        assertEquals(18_000 / 4, BankTransaction.getAverageOfTransaction());
    }

    @Test
    void getCurrentMinValue() {
        assertEquals(1_000, BankTransaction.getCurrentMinValue());
    }

    @Test
    void getCurrentMaxValue() {
        assertEquals(10_000, BankTransaction.getCurrentMaxValue());
    }

    @Test
    void getSumOfTransactions() {
        assertEquals(18_000, BankTransaction.getSumOfTransactions());
    }

    @Test
    void getTransactionValue() {
    }
}