package dynamictypes.publictransport;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PublicTransportTest {

    @Test
    void getVehiclesTest() {
        PublicVehicle pv1 = new Bus(7, 14.3, "Credo");
        PublicVehicle pv2 = new Tram(2, 17.4, 2);
        PublicVehicle pv3 = new Metro(4, 11.3, 9);
        PublicTransport publicTransport = new PublicTransport();
        publicTransport.addVehicle(pv1);
        publicTransport.addVehicle(pv2);
        publicTransport.addVehicle(pv3);
        assertEquals(3, publicTransport.getVehicles().size());
    }
}