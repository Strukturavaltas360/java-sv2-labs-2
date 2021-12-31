package exceptionclass.course;

public class InvalidTimeException extends RuntimeException {

    public InvalidTimeException(InvalidTimeReason reason) {
        super(reason.getMessage());
    }
}
