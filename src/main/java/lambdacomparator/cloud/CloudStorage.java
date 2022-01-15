package lambdacomparator.cloud;

import java.util.Objects;

public class CloudStorage implements Comparable<CloudStorage> {
    private final String provider;
    private final int space;
    private final double price;
    private final PayPeriod payPeriod;

    public CloudStorage(String provider, int space, double price, PayPeriod payPeriod) {
        if (provider == null || provider.isBlank() || space <= 0) {
            throw new IllegalArgumentException("Invalid parameters!");
        }
        this.provider = provider;
        this.space = space;
        this.price = price;
        this.payPeriod = payPeriod;
    }

    public CloudStorage(String provider, int space) {
        this(provider, space, 0.0, null);
    }

    @Override
    public int compareTo(CloudStorage o) {
        return Double.compare(this.getAnnualFeePerTb(), o.getAnnualFeePerTb());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CloudStorage that = (CloudStorage) o;
        return Double.compare(that.getAnnualFeePerTb(), getAnnualFeePerTb()) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(getAnnualFeePerTb());
    }

    double getAnnualFeePerTb() {
        if (payPeriod != null) {
            return 12.0 * price / payPeriod.getLength() * 1000 / space;
        }
        return 0;
    }

    @Override
    public String toString() {
        return "CloudStorage{" +
                "provider='" + provider + '\'' +
                ", space=" + space +
                ", price=" + price +
                ", payPeriod=" + payPeriod +
                '}';
    }

    public String getProvider() {
        return provider;
    }

    public int getSpace() {
        return space;
    }

    public double getPrice() {
        return price;
    }

    public PayPeriod getPayPeriod() {
        return payPeriod;
    }
}
