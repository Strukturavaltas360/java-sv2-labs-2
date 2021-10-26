package enumtype.position;

public enum Position {
    RAKTÁROS(200_000, "havi prémium"),
    KÖNYVELŐ(300_000, "étkezési utalvány, éves prémium"),
    SOFŐR(250_000, "kmpénz");

    private final int salary;
    private final String benefit;

    Position(int salary, String benefit) {
        this.salary = salary;
        this.benefit = benefit;
    }

    public int getSalary() {
        return salary;
    }

    public String getBenefit() {
        return benefit;
    }
}
