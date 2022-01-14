package sorting;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class MedicalSurgeryTest {
    Patient p1 = new Patient("patient1", "taj1", LocalDateTime.parse("2022-01-14T11:30"));
    Patient p2 = new Patient("patient2", "taj2", LocalDateTime.parse("2022-01-14T10:15"));
    Patient p3 = new Patient("patient3", "taj3", LocalDateTime.parse("2022-01-14T08:00"));
    Patient p4 = new Patient("patient4", "taj4", LocalDateTime.parse("2022-01-14T10:30"));
    Patient p5 = new Patient("patient5", "taj5", LocalDateTime.parse("2022-01-14T09:15"));
    MedicalSurgery ms = new MedicalSurgery(List.of(p1, p2, p3, p4, p5));

    @Test
    void getPatientsInTimeOrder() {
        assertEquals(List.of(p3, p5, p2, p4, p1), ms.getPatientsInTimeOrder());
        assertEquals(List.of(p1, p2, p3, p4, p5), ms.getPatients());
    }

}