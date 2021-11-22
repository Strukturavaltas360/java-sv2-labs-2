package algorithmssum;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TransactionTest {
    Transaction transaction = new Transaction("OTP123", TransactionOperation.CREDIT, 123.0);

    @Test
    void getAccountNumber() {
        assertEquals("OTP123", transaction.getAccountNumber());
    }

    @Test
    void getTransactionOperation() {
        assertEquals(TransactionOperation.CREDIT, transaction.getTransactionOperation());
    }

    @Test
    void getAmount() {
        assertEquals(123.0, transaction.getAmount());
    }
}