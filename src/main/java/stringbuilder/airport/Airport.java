package stringbuilder.airport;

import java.util.ArrayList;
import java.util.List;

public class Airport {
    public static void main(String[] args) {
        Airport bud = new Airport();
        Flight flight1 = new Flight("FN-123", Status.ACTIVE);
        Flight flight2 = new Flight("B-2351", Status.DELETED);
        Flight flight3 = new Flight("S-35", Status.ACTIVE);
        bud.addFlight(flight1);
        bud.addFlight(flight2);
        bud.addFlight(flight3);

        flight3.setStatus(Status.DELETED);
        System.out.println(bud.getDeletedFlights());
    }

    private List<Flight> flights = new ArrayList<>();

    public void addFlight(Flight flight) {
        flights.add(flight);
    }

    public String getDeletedFlights() {
        StringBuilder sb = new StringBuilder("Törölt járatok:");
        for (Flight flight: flights) {
            if (flight.getStatus() == Status.DELETED) {
                sb.append('\n');
                sb.append(flight.getFlightNumber());
            }
        }
        return sb.toString();
    }
}
