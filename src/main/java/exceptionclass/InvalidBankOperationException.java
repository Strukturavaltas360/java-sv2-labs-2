package exceptionclass;

public class InvalidBankOperationException extends RuntimeException {
    public InvalidBankOperationException(String message) {
        super(message);
    }
}
