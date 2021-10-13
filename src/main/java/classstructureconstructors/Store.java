package classstructureconstructors;

public class Store {
    private String product;
    private int stock;

    public Store(String product) {
        this.product = product;
    }

    public void store(int quantity) {
        stock += quantity;
    }

    public void dispatch(int quantity) {
        stock -= quantity;
    }

    public String getProductAndStock() {
        return product + " (" + stock + ")";
    }

    public String getProduct() {
        return product;
    }

    public int getStock() {
        return stock;
    }
}
