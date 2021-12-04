package interfacedependencyinversion.amount;

public class BankAtm implements Payable {
    @Override
    public int getPayableAmount(int amount) {
        return ((amount + 999) / 1000) * 1000;
    }
}
