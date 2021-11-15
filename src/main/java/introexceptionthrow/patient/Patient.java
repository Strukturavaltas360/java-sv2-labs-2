package introexceptionthrow.patient;

public class Patient {
    public static void main(String[] args) {
        try {
            Patient patient = new Patient("Ödön", "123456788",1994);
            System.out.println(patient.getName());
        } catch (IllegalArgumentException exception) {
            System.out.println(exception.getMessage());
        }

        try {
            Patient patient = new Patient("Lipót", "123456780",2000);
            System.out.println(patient.getName());
        } catch (IllegalArgumentException exception) {
            System.out.println(exception.getMessage());
        }
    }

    private String name;
    private String socialSecurityNumber;
    private int yearOfBirth;

    public Patient(String name, String ssn, int year) {
        SsnValidator ssnValidator = new SsnValidator();
        if (name == null || name.length() == 0) {
            throw new IllegalArgumentException("A név nem lehet üres!");
        }
        if (year < 1900) {
            throw new IllegalArgumentException("A születési év minimum 1900!");
        }
        if (!ssnValidator.isValidSsn(ssn)) {
            throw new IllegalArgumentException("Hibás TAJ szám!");
        }
        this.name = name;
        this.socialSecurityNumber = ssn;
        this.yearOfBirth = year;
    }

    public String getName() {
        return name;
    }

    public String getSocialSecurityNumber() {
        return socialSecurityNumber;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }
}
