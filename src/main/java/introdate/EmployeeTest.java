package introdate;

import java.util.Scanner;

public class EmployeeTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Dolgozó neve: ");
        String name = scanner.nextLine();
        System.out.print("Születési év: ");
        int year = scanner.nextInt();
        System.out.print("Hónap: ");
        int month = scanner.nextInt();
        System.out.print("Nap: ");
        int day = scanner.nextInt();

        Employee employee = new Employee(year, month, day, name);
        System.out.println("Name: " + employee.getName());
        System.out.println("Date of birth: " + employee.getDateOfBirth());
        System.out.println("Start of employment: " + employee.getBeginEmployment());
    }
}
