package collectionsequalshash;

import java.util.Objects;

public class Company {
    private String name;
    private String vatNumber;

    public Company(String name, String vatNumber) {
        this.name = name;
        this.vatNumber = vatNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Company company = (Company) o;
        return Objects.equals(name, company.name) && Objects.equals(vatNumber, company.vatNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, vatNumber);
    }

    public String getName() {
        return name;
    }

    public String getVatNumber() {
        return vatNumber;
    }
}
