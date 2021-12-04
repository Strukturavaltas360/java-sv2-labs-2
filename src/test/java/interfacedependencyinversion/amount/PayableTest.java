package interfacedependencyinversion.amount;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PayableTest {

    @Test
    void getPayableAmountTestAmount() {
        Payable payable = new Amount();
        assertEquals(2, payable.getPayableAmount(2));
        assertEquals(9, payable.getPayableAmount(9));
    }

    @Test
    void getPayableAmountTestCash() {
        Payable payable = new Cash();
        assertEquals(90, payable.getPayableAmount(90));
        assertEquals(90, payable.getPayableAmount(92));
        assertEquals(95, payable.getPayableAmount(93));
        assertEquals(95, payable.getPayableAmount(97));
        assertEquals(100, payable.getPayableAmount(98));
    }

    @Test
    void getPayableAmountTestBankAtm() {
        Payable payable = new BankAtm();
        assertEquals(0, payable.getPayableAmount(0));
        assertEquals(1000, payable.getPayableAmount(1));
        assertEquals(1000, payable.getPayableAmount(1000));
        assertEquals(2000, payable.getPayableAmount(1001));
    }
}