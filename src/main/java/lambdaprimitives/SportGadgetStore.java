package lambdaprimitives;

import java.util.IntSummaryStatistics;
import java.util.List;

public class SportGadgetStore {
    List<Product> products;

    public SportGadgetStore(List<Product> products) {
        if (products == null) {
            throw new IllegalArgumentException("Products must not be null!");
        }
        this.products = products;
    }

    public int getNumberOfProducts() {
        return products.stream()
                .mapToInt(product -> product.getQuantity())
                .sum();
    }

    public double getAveragePrice() {
        return products.stream()
                .mapToInt(product -> product.getPrice())
                .average().orElse(0);
    }

    public String getExpensiveProductStatistics(double minPrice) {
        IntSummaryStatistics summary = products.stream()
                .filter(product -> product.getPrice() > minPrice)
                .mapToInt(product -> product.getQuantity())
                .summaryStatistics();
        if (summary.getCount() == 0) {
            return "Nincs ilyen termék.";
        }
        return String.format("Összesen %d féle termék, amelyekből minimum %d db, maximum %d db, összesen %d db van.",
                summary.getCount(), summary.getMin(), summary.getMax(), summary.getSum());
    }

    public List<Product> getProducts() {
        return products;
    }
}
