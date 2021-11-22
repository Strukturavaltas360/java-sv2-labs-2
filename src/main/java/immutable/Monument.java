package immutable;

import java.time.LocalDate;

public class Monument {
    private final String name;
    private final String address;
    private final LocalDate dateOfRegistration;
    private final String registrationNo;

    public Monument(String name, String address, LocalDate dateOfRegistration, String registrationNo) {
        if (isEmpty(name)) {
            throw new IllegalStateException("Hiba: üres a név!");
        }
        if (isEmpty(address)) {
            throw new IllegalStateException("Hiba: üres a cím!");
        }
        if (dateOfRegistration == null) {
            throw new IllegalStateException("Hiba: üres nyilvántartásba vételi dátum!");
        }
        if (isEmpty(registrationNo)) {
            throw new IllegalStateException("Hiba: üres a nyilvántartásba vételi szám!");
        }
        this.name = name;
        this.address = address;
        this.dateOfRegistration = dateOfRegistration;
        this.registrationNo = registrationNo;
    }

    private boolean isEmpty(String text) {
        return text == null || text.trim().length() == 0;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public LocalDate getDateOfRegistration() {
        return dateOfRegistration;
    }

    public String getRegistrationNo() {
        return registrationNo;
    }
}
