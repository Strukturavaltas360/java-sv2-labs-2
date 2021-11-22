package algorithmscount.transaction;

import java.util.List;

public class TransactionCounter {
    public int countEntryLessThan(List<Transaction> transactions, double amountLimit) {
        int counter = 0;
        for (Transaction transaction: transactions) {
            if (transaction.isCredit() && transaction.getAmount() < amountLimit) {
                counter++;
            }
        }
        return counter;
    }
}
