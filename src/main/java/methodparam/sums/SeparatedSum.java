package methodparam.sums;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SeparatedSum {

    public PlusMinusDouble sum(String floatingNumbers) {
        List<Double> doubles = parseFloatingNumbers(floatingNumbers);
        double plus = sumAllPositiveNumbers(doubles);
        double minus = sumAllNegativeNumbers(doubles);
        return new PlusMinusDouble(plus, minus);
    }

    private double sumAllNegativeNumbers(List<Double> doubles) {
        double sum = 0;
        for (Double d: doubles) {
            if (d < 0) {
                sum += d;
            }
        }
        return sum;
    }

    private double sumAllPositiveNumbers(List<Double> doubles) {
        double sum = 0;
        for (Double d: doubles) {
            if (d > 0) {
                sum += d;
            }
        }
        return sum;
    }

    private List<Double> parseFloatingNumbers(String floatingNumbers) {
        List<Double> doubles = new ArrayList<>();
        Scanner scanner = new Scanner(floatingNumbers);
        scanner.useDelimiter(";");
        while (scanner.hasNext()) {
            doubles.add(scanner.nextDouble());
        }
        return doubles;
    }
}
