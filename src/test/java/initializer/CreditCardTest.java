package initializer;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CreditCardTest {
    CreditCard creditCard;

    @Test
    void ratesTest() {
        assertEquals(Currency.values().length - 1, CreditCard.RATES.size());
        assertEquals(Currency.EUR, CreditCard.RATES.get(0).getCurrency());
        assertTrue(CreditCard.RATES.get(0).getConversionFactor() > 1);
    }

    @Test
    void paymentUsdTest() {
        creditCard = new CreditCard(1_000, Currency.USD);
        assertEquals(330_400, creditCard.getBalance());
        assertFalse(creditCard.payment(1_001, Currency.USD));
        assertTrue(creditCard.payment(1_000, Currency.USD));
        assertEquals(0, creditCard.getBalance());
        assertThrows(IllegalArgumentException.class, () -> creditCard.payment(-1, Currency.USD));
    }

    @Test
    void paymentHufTest() {
        creditCard = new CreditCard(1_000);
        assertEquals(1_000, creditCard.getBalance());
        assertFalse(creditCard.payment(1_001));
        assertTrue(creditCard.payment(1_000));
        assertEquals(0, creditCard.getBalance());
        assertThrows(IllegalArgumentException.class, () -> creditCard.payment(-1));
    }

}