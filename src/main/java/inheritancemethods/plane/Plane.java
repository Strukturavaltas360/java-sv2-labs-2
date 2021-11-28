package inheritancemethods.plane;

public class Plane {
    public static void main(String[] args) {
        Passenger passenger = new Passenger("Passanger", 20000);
        PriorityPassenger priorityPassenger = new PriorityPassenger("PriorityPassanger", 20000, 33);
        FirstClassPassenger fcPassenger = new FirstClassPassenger("FirstClassPessenger", 20000, 33);

        System.out.println(String.format(
                "name: %s, priceOfPlaneTicket: %d", passenger.getName(), passenger.getPriceOfPlaneTicket()));
        System.out.println(String.format(
                "name: %s, priceOfPlaneTicket: %d", priorityPassenger.getName(), priorityPassenger.getPriceOfPlaneTicket()));
        System.out.println(String.format(
                "name: %s, priceOfPlaneTicket: %d", fcPassenger.getName(), fcPassenger.getPriceOfPlaneTicket()));
    }
}
