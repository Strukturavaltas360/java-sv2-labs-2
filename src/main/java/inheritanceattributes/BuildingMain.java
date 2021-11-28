package inheritanceattributes;

public class BuildingMain {
    public static void main(String[] args) {
        Building building = new Building("Building", 100, 1);
        SchoolBuilding school = new SchoolBuilding("School", 1500, 3, 30);
        System.out.println(String.format("floors: %d", building.getFloors()));
        System.out.println(String.format("floors: %d, numberOfClassRooms: %d",school.getFloors(), school.getNumberOfClassRooms()));
    }
}
