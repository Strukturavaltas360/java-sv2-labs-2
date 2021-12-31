package exceptionclass;

public class InvalidAccountNumberBankOperationException extends InvalidBankOperationException {
    private String accountNumber;

    public InvalidAccountNumberBankOperationException(String accountNumber) {
        super(String.format("Can not found account (%s)!", accountNumber));
        this.accountNumber = accountNumber;
    }
}
