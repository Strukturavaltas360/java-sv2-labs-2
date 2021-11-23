package defaultconstructor;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SimpleDateFormatterTest {
    SimpleDate sd1 = new SimpleDate();
    SimpleDate sd2 = new SimpleDate();
    SimpleDateFormatter simpleDateFormatter = new SimpleDateFormatter();

    @BeforeEach
    void init() {
        sd1.setDate(2021, 11, 23);
        sd2.setDate(2021, 1, 3);
    }

    @Test
    void formatDateString() {
        assertEquals("2021-11-23", simpleDateFormatter.formatDateString(sd1));
        assertEquals("2021-1-3", simpleDateFormatter.formatDateString(sd2));
    }

    @Test
    void formatDateStringByCountryCode() {
        assertEquals("23-11-2021", simpleDateFormatter.formatDateStringByCountryCode(CountryCode.EN, sd1));
        assertEquals("3-1-2021", simpleDateFormatter.formatDateStringByCountryCode(CountryCode.EN, sd2));
        assertEquals("2021-11-23", simpleDateFormatter.formatDateStringByCountryCode(CountryCode.HU, sd1));
        assertEquals("11-23-2021", simpleDateFormatter.formatDateStringByCountryCode(CountryCode.US, sd1));

    }
}