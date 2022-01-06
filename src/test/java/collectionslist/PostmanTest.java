package collectionslist;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PostmanTest {

    @Test
    void test() {
        Postman postman = new Postman();
        postman.addAddress("address1");
        postman.addAddress("address2");
        postman.addAddress("address3");
        postman.addAddress("address10");
        postman.addAddress("address4");

        assertEquals(5, postman.getAddresses().size());
        assertEquals("address1", postman.getAddresses().get(0));
        postman.removeAddress("address1");

        assertEquals(4, postman.getAddresses().size());
        assertEquals("address2", postman.getAddresses().get(0));

        postman.removeAddress("address10");
        assertEquals(3, postman.getAddresses().size());
        assertEquals("address2", postman.getAddresses().get(0));
    }

}