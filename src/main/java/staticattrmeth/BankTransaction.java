package staticattrmeth;

public class BankTransaction {
    private static final long MIN_TRANSACTION_VALUE = 1;
    private static final long MAX_TRANSACTION_VALUE = 10_000_000;
    private static long countOfTransactions;
    private static long sumOfTransactions;
    private static long currentMinValue;
    private static long currentMaxValue;

    private long transactionValue;

    public BankTransaction(long transactionValue) {
        if (transactionValue < MIN_TRANSACTION_VALUE) {
            throw new IllegalArgumentException("Kisebb a minimumnál!");
        }
        if (transactionValue >MAX_TRANSACTION_VALUE) {
            throw new IllegalArgumentException("Nagyobb a maximunál!");
        }
        this.transactionValue = transactionValue;
        if (countOfTransactions == 0) {
            currentMinValue = transactionValue;
            currentMaxValue = transactionValue;
        } else {
            if (transactionValue < currentMinValue) {
                currentMinValue = transactionValue;
            }
            if (transactionValue > currentMaxValue) {
                currentMaxValue = transactionValue;
            }
        }
        sumOfTransactions += transactionValue;
        countOfTransactions++;
    }

    public static void initTheDay() {
        countOfTransactions = 0;
        sumOfTransactions = 0;
        currentMinValue = 0;
        currentMaxValue = 0;
    }

    public static long getAverageOfTransaction() {
        return countOfTransactions > 0 ? sumOfTransactions / countOfTransactions : 0;
    }

    public static long getCurrentMinValue() {
        return countOfTransactions > 0 ? currentMinValue : 0;
    }

    public static long getCurrentMaxValue() {
        return countOfTransactions > 0 ? currentMaxValue : 0;

    }

    public static long getSumOfTransactions() {
        return countOfTransactions > 0 ? sumOfTransactions : 0;
    }

    public long getTransactionValue() {
        return transactionValue;
    }
}
