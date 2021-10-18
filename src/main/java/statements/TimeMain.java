package statements;

import java.util.Scanner;

public class TimeMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Kérem adja meg az első időpontot!");
        Time time1 = readNewTime(scanner);

        System.out.println("Kérem adja meg a második időpontot!");
        Time time2 = readNewTime(scanner);

        System.out.println("Első időpont: " + time1.toString() + " = " + time1.getInMinutes() + " perc");
        System.out.println("Második időpont: " + time2.toString() + " = " + time2.getInSeconds() + " mp");
        System.out.println("Első korábbi mint második? " + time1.earlierThan(time2));
    }

    private static Time readNewTime(Scanner scanner) {
        int hour, minute, second;
        System.out.print("  Óra: ");
        hour = scanner.nextInt();
        System.out.print("  Perc: ");
        minute = scanner.nextInt();
        System.out.print("  Másodperc: ");
        second = scanner.nextInt();
        return new Time(hour, minute, second);
    }
}
