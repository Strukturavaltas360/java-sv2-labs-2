package introexceptionthrow;

public class Patient {
    public static void main(String[] args) {
        try {
            Patient patient = new Patient("", "",2020);
            System.out.println(patient.getName());
        } catch (IllegalArgumentException exception) {
            System.out.println(exception.getMessage());
        }

        try {
            Patient patient = new Patient("Ödön", "",1848);
            System.out.println(patient.getName());
        } catch (IllegalArgumentException exception) {
            System.out.println(exception.getMessage());
        }

        try {
            Patient patient = new Patient("Lipót", "",2000);
            System.out.println(patient.getName());
        } catch (IllegalArgumentException exception) {
            System.out.println(exception.getMessage());
        }
    }

    private String name;
    private String socialSecurityNumber;
    private int yearOfBirth;

    public Patient(String name, String ssn, int year) {
        if (name == null || name.length() == 0) {
            throw new IllegalArgumentException("A név nem lehet üres!");
        }
        if (year < 1900) {
            throw new IllegalArgumentException("A születési év minimum 1900!");
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
