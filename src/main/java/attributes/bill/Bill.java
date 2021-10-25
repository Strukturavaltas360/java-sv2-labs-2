package attributes.bill;

public class Bill {
    public static void main(String[] args) {
        BillItem item = new BillItem("monitor", 42000, 2, 0.27);
        System.out.println(item.calculateTotalPrice());
    }
}
