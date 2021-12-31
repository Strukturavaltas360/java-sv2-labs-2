package exceptionclass.course;

public enum InvalidTimeReason {
    INVALID_HOUR("Hour is invalid (0-23)"),
    INVALID_MINUTE("Minute is invalid (0-59)"),
    TIME_IS_NULL("Time is null"),
    INVALID_TIME_FORMAT("Time is not hh:mm");

    private String message;

    InvalidTimeReason(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}
