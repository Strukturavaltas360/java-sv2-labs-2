package nestedclasses.dns;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NameServerTest {
    NameServer nameServer = new NameServer();

    @BeforeEach
    void init() {
        nameServer.addEntry("host1", "192.168.1.1");
        nameServer.addEntry("host2", "192.168.1.2");
        nameServer.addEntry("host3", "192.168.1.3");
        nameServer.addEntry("host4", "192.168.1.4");
    }

    @Test
    void addEntryExceptionTest() {
        int count = nameServer.getEntries().size();
        IllegalArgumentException iae = assertThrows(IllegalArgumentException.class,
                () -> nameServer.addEntry("host4", "0.0.0.0"));
        assertEquals("Already exists", iae.getMessage());

        iae = assertThrows(IllegalArgumentException.class,
                () -> nameServer.addEntry("dummy", "192.168.1.1"));
        assertEquals("Already exists", iae.getMessage());
        assertEquals(count, nameServer.getEntries().size());
    }

    @Test
    void removeEntryByNameTest() {
        int count = nameServer.getEntries().size();
        nameServer.removeEntryByName("host1");
        assertEquals(count - 1, nameServer.getEntries().size());
    }

    @Test
    void removeEntryByNameNotExistTest() {
        int count = nameServer.getEntries().size();
        nameServer.removeEntryByName("dummy");
        assertEquals(count, nameServer.getEntries().size());
    }

    @Test
    void removeEntryByIpTest() {
        int count = nameServer.getEntries().size();
        nameServer.removeEntryByIp("192.168.1.4");
        assertEquals(count - 1, nameServer.getEntries().size());
    }

    @Test
    void removeEntryByIpNotExistsTest() {
        int count = nameServer.getEntries().size();
        nameServer.removeEntryByIp("0.0.0.0");
        assertEquals(count, nameServer.getEntries().size());
    }

    @Test
    void getIpByNameTest() {
        assertEquals("192.168.1.2", nameServer.getIpByName("host2"));
    }

    @Test
    void getIpByNameExceptionTest() {
        IllegalArgumentException iae = assertThrows(IllegalArgumentException.class,
                () -> nameServer.getIpByName("dummy"));
        assertEquals("Element not found", iae.getMessage());
    }

    @Test
    void getNameByIpTest() {
        assertEquals("host3", nameServer.getNameByIp("192.168.1.3"));
    }

    @Test
    void getNameByIpExceptionTest() {
        IllegalArgumentException iae = assertThrows(IllegalArgumentException.class,
                () -> nameServer.getNameByIp("1.1.1.1"));
        assertEquals("Element not found", iae.getMessage());
    }
}