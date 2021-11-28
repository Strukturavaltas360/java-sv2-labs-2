package inheritancemethods.employee;

public class Boss extends Employee {
    static private final double LEADERSHIP_FACTOR = 0.1;
    int numberOfEmployees;

    public Boss(String name, String address, double salary, int numberOfEmployees) {
        super(name, address, salary);
        this.numberOfEmployees = numberOfEmployees;
    }

    @Override
    public double getSalary() {
        return super.getSalary() * (LEADERSHIP_FACTOR + 1);
    }

    public int getNumberOfEmployees() {
        return numberOfEmployees;
    }
}
