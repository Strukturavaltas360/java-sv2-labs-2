package finalmodifier;

public class TaxCalculator {
    static public final double VAT_PERCENT = 27;

    public static void main(String[] args) {
        System.out.println(tax(100));
        System.out.println(priceWithTax(100));
    }

    static double tax(double price) {
        return price * VAT_PERCENT / 100;
    }

    static double priceWithTax(double price) {
        return price * (100 + VAT_PERCENT) / 100;
    }
}
