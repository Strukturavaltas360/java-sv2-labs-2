package inheritanceconstructor.classroom;

public class ClassRoom extends Room {
    Facility facility;

    public ClassRoom(String location, int capacity, Facility facility) {
        super(location, capacity);
        this.facility = facility;
    }

    public boolean isSuitable(Course course) {
        if (course.getParticipants() > getCapacity()) {
            return false;
        }
        if (course.getFacilityNeeded() != null && course.getFacilityNeeded() != facility) {
            return false;
        }
        return true;
    }
}
