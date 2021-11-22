package algorithmssum;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class TransactionSumCalculatorTest {
    TransactionSumCalculator transactionSumCalculator = new TransactionSumCalculator();

    @Test
    void sumAmountOfCreditEntriesEmptyTest() {
        List<Transaction> transactions = new ArrayList<>();
        assertEquals(0, transactionSumCalculator.sumAmountOfCreditEntries(transactions));
    }

    @Test
    void sumAmountOfCreditEntriesTest() {
        List<Transaction> transactions = new ArrayList<>();
        transactions.add(new Transaction("123", TransactionOperation.CREDIT, 123));
        transactions.add(new Transaction("234", TransactionOperation.CREDIT, 234));
        transactions.add(new Transaction("345", TransactionOperation.CREDIT, 345));
        transactions.add(new Transaction("123", TransactionOperation.DEBIT, 123));

        assertEquals(123 + 234 + 345, transactionSumCalculator.sumAmountOfCreditEntries(transactions));
    }
}