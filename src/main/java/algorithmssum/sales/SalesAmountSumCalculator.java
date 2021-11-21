package algorithmssum.sales;

import java.util.List;

public class SalesAmountSumCalculator {
    public double sumSalesAmount(List<Salesperson> persons) {
        double sum = 0;
        for (Salesperson person : persons) {
            sum += person.getAmount();
        }
        return sum;
    }
}
