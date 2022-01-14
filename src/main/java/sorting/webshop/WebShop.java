package sorting.webshop;

import java.text.Collator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class WebShop {
    private enum Order {
        BY_NAME, BY_PRICE, BY_FROM
    }
    List<Product> products;

    public WebShop(List<Product> products) {
        this.products = products;
    }

    public List<Product> getProductsByName() {
        return getOrderedProducts(Order.BY_NAME);
    }

    public List<Product> getProductsByPrice() {
        return getOrderedProducts(Order.BY_PRICE);

    }

    public List<Product> getProductsByFrom() {
        return getOrderedProducts(Order.BY_FROM);
    }

    private List<Product> getOrderedProducts(Order order) {
        List<Product> result = new ArrayList<>(products);
        Collections.sort(result, new Comparator<Product>() {
            @Override
            public int compare(Product o1, Product o2) {
                switch(order) {
                    case BY_NAME:
                        Collator collator = Collator.getInstance();
                        return collator.compare(o1.getName().toLowerCase(), o2.getName().toLowerCase());
                    case BY_PRICE:
                        return o1.getPrice() - o2.getPrice();
                    case BY_FROM:
                        return o1.getFrom().compareTo(o2.getFrom());
                }
                throw new IllegalStateException("Invalid sorting type!");
            }
        });
        return result;
    }

    public List<Product> getProducts() {
        return products;
    }
}
