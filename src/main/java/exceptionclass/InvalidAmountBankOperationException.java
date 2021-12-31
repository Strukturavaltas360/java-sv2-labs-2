package exceptionclass;

public class InvalidAmountBankOperationException extends InvalidBankOperationException {
    private double subtractAmount;
    private double maxSubtract;
    private double depositAmount;

    public InvalidAmountBankOperationException(double subtractAmount, double maxSubtract) {
        super(String.format("Invalid subtract amount (%.2f, maxSubtract=%.2f)!", subtractAmount, maxSubtract));
        this.subtractAmount = subtractAmount;
        this.maxSubtract = maxSubtract;
    }

    public InvalidAmountBankOperationException(double depositAmount) {
        super(String.format("Invald deposit amount (%.2f)!", depositAmount));
        this.depositAmount = depositAmount;
    }

    public double getSubtractAmount() {
        return subtractAmount;
    }

    public double getMaxSubtract() {
        return maxSubtract;
    }

    public double getDepositAmount() {
        return depositAmount;
    }
}
