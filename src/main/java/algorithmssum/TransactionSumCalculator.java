package algorithmssum;

import java.util.List;

public class TransactionSumCalculator {
    public double sumAmountOfCreditEntries(List<Transaction> transactions) {
        double sum = 0;
        for (Transaction transaction: transactions) {
            if (transaction.getTransactionOperation() == TransactionOperation.CREDIT) {
                sum += transaction.getAmount();
            }
        }
        return sum;
    }
}
