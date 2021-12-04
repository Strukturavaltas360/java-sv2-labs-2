package interfacedependencyinversion.amount;

public class Cash implements Payable {
    @Override
    public int getPayableAmount(int amount) {
        return ((amount + 2) / 5) * 5;
    }
}
