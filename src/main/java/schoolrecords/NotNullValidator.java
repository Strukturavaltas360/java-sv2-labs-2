package schoolrecords;

public class NotNullValidator {
    private final String paramName;

    public NotNullValidator(String paramName) {
        this.paramName = paramName;
    }

    public void validate(Object param) {
        if (param == null) {
            throw new NullPointerException(paramName + " must not be null!");
        }
    }
}
