package intromethods.employee;

public class EmployeeMain {
    public static void main(String[] args) {
        Employee joe = new Employee("Joe Turner", 2015, 150_000);
        System.out.println(joe);
        joe.setName("Dr. Joe Turner");
        System.out.println(joe);
        joe.raiseSalary(20_000);
        System.out.println(joe);
    }
}
