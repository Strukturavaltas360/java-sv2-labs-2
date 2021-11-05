package meetingrooms;

import java.util.ArrayList;
import java.util.List;

public class Office {
    private List<MeetingRoom> meetingRooms = new ArrayList<>();

    public void addMeetingRoom(MeetingRoom meetingRoom) {
        meetingRooms.add(meetingRoom);
    }

    public void printNames() {
        for (MeetingRoom mr: meetingRooms) {
            System.out.println(mr.getName());
        }
    }

    public void printNamesReverse() {
        for (int i = meetingRooms.size() - 1; i >= 0 ; i--) {
            System.out.println(meetingRooms.get(i).getName());
        }
    }

    public void printEvenNames() {
        for (int i = 1; i < meetingRooms.size(); i += 2) {
            System.out.println(meetingRooms.get(i).getName());
        }
    }

    public void printAreas() {
        for (MeetingRoom mr: meetingRooms) {
            System.out.println(mr);
        }
    }

    public void printMeetingRoomsWithName(String name) {
        int counter = 0;
        for (MeetingRoom mr: meetingRooms) {
            if (mr.getName().equals(name)) {
                System.out.println(mr);
                counter++;
            }
        }
        if (counter == 0) {
            System.out.println("Nincs találat!");
        }
    }

    public void printMeetingRoomsContains(String part) {
        int counter = 0;
        for (MeetingRoom mr: meetingRooms) {
            if (mr.getName().toLowerCase().contains(part.toLowerCase())) {
                System.out.println(mr);
                counter++;
            }
        }
        if (counter == 0) {
            System.out.println("Nincs találat!");
        }
    }

    public void printAreasLargerThan(int area) {
        int counter = 0;
        for (MeetingRoom mr: meetingRooms) {
            if (mr.getArea() > area) {
                System.out.println(mr);
                counter++;
            }
        }
        if (counter == 0) {
            System.out.println("Nincs találat!");
        }
    }
}
