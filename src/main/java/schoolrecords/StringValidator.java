package schoolrecords;

public class StringValidator {
    private final String paramName;

    public StringValidator(String paramName) {
        this.paramName = paramName;
    }

    public void validate(String param) {
        new NotNullValidator(paramName).validate(param);
        if (param.isEmpty()) {
            throw new IllegalArgumentException(paramName + " must not be empty!");
        }
    }
}
