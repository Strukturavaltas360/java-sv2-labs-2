package meetingrooms;

import java.util.Scanner;

public class MeetingRoomController {
    public static void main(String[] args) {
        MeetingRoomController meetingRoomController = new MeetingRoomController();
        meetingRoomController.runMenu();
    }

    private Office office = new Office();

    public void readOffice() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Tárgyaló rögzítése");
        System.out.print("- neve: ");
        String name = scanner.nextLine();
        System.out.print("- hossza: ");
        int length = scanner.nextInt();
        System.out.print("- szélessége: ");
        int width = scanner.nextInt();
        scanner.nextLine();

        office.addMeetingRoom(new MeetingRoom(name, length, width));
    }

    public void printMenu() {
        String[] menuItems = {
                "1. Tárgyaló rögzítése",
                "2. Tárgyalók sorrendben",
                "3. Tárgyalók visszafele sorrendben",
                "4. Minden második tárgyaló",
                "5. Területek",
                "6. Keresés pontos név alapján",
                "7. Keresés névtöredék alapján",
                "8. Keresés terület alapján",
                "9. Kilépés"
        };
        System.out.println();
        for (String item : menuItems) {
            System.out.println(item);
        }
        System.out.print("Kérem üsse be a funkció számát: ");
    }

    public void runMenu() {
        int function = 0;
        do {
            printMenu();

            Scanner scanner = new Scanner(System.in);
            function = scanner.nextInt();
            scanner.nextLine();
            System.out.println();

            switch (function) {
                case 1:
                    readOffice();
                    break;
                case 2:
                    office.printNames();
                    break;
                case 3:
                    office.printNamesReverse();
                    break;
                case 4:
                    office.printEvenNames();
                    break;
                case 5:
                    office.printAreas();
                    break;
                case 6:
                    System.out.print("Kérem adja meg a tárgyaló pontos nevét: ");
                    office.printMeetingRoomsWithName(scanner.nextLine());
                    break;
                case 7:
                    System.out.print("Kérem adja meg a tárgyaló nevének részletét (kisbetű, nagybetű mindegy): ");
                    office.printMeetingRoomsContains(scanner.nextLine());
                    break;
                case 8:
                    System.out.print("Kérem adja meg a területet, aminél nagyobbat keres: ");
                    int minArea = scanner.nextInt();
                    scanner.nextLine();
                    office.printAreasLargerThan(minArea);
                    break;
            }
        } while (function < 9);
    }
}
