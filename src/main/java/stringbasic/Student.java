package stringbasic;

public class Student {
    private Person person;
    private String neptunId;
    private String oktId;
    private String entryCardNumber;

    public Student(Person person, String neptunId, String oktId) {
        this.person = person;
        this.neptunId = neptunId;
        this.oktId = oktId;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public String getNeptunId() {
        return neptunId;
    }

    public void setNeptunId(String neptunId) {
        this.neptunId = neptunId;
    }

    public String getOktId() {
        return oktId;
    }

    public void setOktId(String oktId) {
        this.oktId = oktId;
    }

    public String getEntryCardNumber() {
        return entryCardNumber;
    }

    public void setEntryCardNumber(String entryCardNumber) {
        this.entryCardNumber = entryCardNumber;
    }
}

