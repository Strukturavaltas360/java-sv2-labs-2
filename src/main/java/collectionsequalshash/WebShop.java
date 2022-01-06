package collectionsequalshash;

import java.util.ArrayList;
import java.util.List;

public class WebShop {
    public static void main(String[] args) {
        WebShop webShop = new WebShop(List.of(
                new Product("pr1", "no1"),
                new Product("pr2", "no2"),
                new Product("pr3", "no3"),
                new Product("pr4", "no1"),
                new Product("pr5", "no1")));
        System.out.println(webShop.findHowMany(new Product("pr1", "no1")));
    }

    List<Product> products = new ArrayList<>();

    public WebShop(List<Product> products) {
        this.products = products;
    }

    public int findHowMany(Product product) {
        int count = 0;
        for (Product actual: products) {
            if (actual.equals(product)) {
                count++;
            }
        }
        return count;
    }
}
