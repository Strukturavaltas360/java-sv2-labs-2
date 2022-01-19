package optional;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class BucketListTest {
    Destination dest1 = new Destination("dest1", "descr1", 300);
    Destination dest2 = new Destination("dest2", "descr2", 200);
    Destination dest3 = new Destination("dest3", "descr3", 1000);
    BucketList bucketList = new BucketList(List.of(dest1, dest2, dest3));

    @Test
    void getDestinationWithKeyword() {
        assertEquals(dest3, bucketList.getDestinationWithKeyword("3").get());
    }

    @Test
    void getDestinationNearerThanGiven() {
        assertEquals(dest2, bucketList.getDestinationNearerThanGiven(300).get());
    }
}