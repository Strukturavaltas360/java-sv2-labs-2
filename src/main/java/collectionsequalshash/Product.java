package collectionsequalshash;

import java.util.Objects;

public class Product {
    private String name;
    private String regNo;

    public Product(String name, String regNo) {
        this.name = name;
        this.regNo = regNo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return Objects.equals(regNo, product.regNo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(regNo);
    }

    public String getName() {
        return name;
    }

    public String getRegNo() {
        return regNo;
    }
}
