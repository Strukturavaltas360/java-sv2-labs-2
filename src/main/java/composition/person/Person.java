package composition.person;

public class Person {
    private String name;
    private String identificationCard;
    private Address address;

    public Person(String name, String identificationCard, Address address) {
        this.name = name;
        this.identificationCard = identificationCard;
        this.address = address;
    }

    public void correctData(String name, String identificationCard, Address address) {
        this.name = name;
        this.identificationCard = identificationCard;
        this.address = address;
    }

    public void moveTo(Address address) {
        this.address = address;
    }

    public String personToString() {
        return "name: " + name + ", idCard: " + identificationCard + ", address: " + (address != null ? address.addressToString() : "");
    }

    public String getName() {
        return name;
    }

    public String getIdentificationCard() {
        return identificationCard;
    }

    public Address getAddress() {
        return address;
    }
}
