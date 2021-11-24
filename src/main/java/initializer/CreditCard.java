package initializer;

import java.util.Arrays;
import java.util.List;

public class CreditCard {
    static final List<Rate> RATES;

    static {
        RATES = Arrays.asList(
                new Rate(Currency.EUR, 370.1),
                new Rate(Currency.SFR, 350.2),
                new Rate(Currency.GBP, 440.3),
                new Rate(Currency.USD, 330.4));
    }

    private long balance;

    public CreditCard(long balance, Currency currency) {
        this.balance = calculateAmountInHuf(balance, currency);
    }

    public CreditCard(long balance) {
        this(balance, Currency.HUF);
    }

    public long getBalance() {
        return balance;
    }

    public boolean payment(long amount, Currency currency) {
        if (amount < 0) {
            throw new IllegalArgumentException("Negatív szám nem megengedett!");
        }
        long amountInHuf = calculateAmountInHuf(amount, currency);
        if (amountInHuf <= balance) {
            balance -= amountInHuf;
            return true;
        }
        return false;
    }

    private long calculateAmountInHuf(long amount, Currency currency) {
        long amountInHuf;
        if (currency == Currency.HUF) {
            amountInHuf = amount;
        } else {
            Rate rate = findRate(currency);
            amountInHuf = (long) (rate.getConversionFactor() * amount);
        }
        return amountInHuf;
    }

    private Rate findRate(Currency currency) {
        for (Rate rate: RATES) {
            if (rate.getCurrency() == currency) {
                return rate;
            }
        }
        throw new IllegalStateException("Nincs ehhez a valutához árfolyam!");
    }

    public boolean payment(long amount) {
        return payment(amount, Currency.HUF);
    }
}
