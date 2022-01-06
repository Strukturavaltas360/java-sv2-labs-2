package collectionslist;

import java.util.ArrayList;
import java.util.List;

public class Postman {
    List<String> addresses = new ArrayList<>();

    public void addAddress(String address) {
        addresses.add(address);
    }

    public void removeAddress(String address) {
        addresses.remove(address);
    }

    public List<String> getAddresses() {
        return addresses;
    }
}
