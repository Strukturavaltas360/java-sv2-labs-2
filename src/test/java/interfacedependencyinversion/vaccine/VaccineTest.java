package interfacedependencyinversion.vaccine;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class VaccineTest {
    Vaccine vaccine;
    List<Person> persons;

    @BeforeEach
    void init() {
        persons = new ArrayList<>();
        persons.add(new Person("Fiatal Férfi", 23, ChronicDisease.NO, Pregnancy.NO));
        persons.add(new Person("Terhes Nő", 25, ChronicDisease.NO, Pregnancy.YES));
        persons.add(new Person("Idős Beteg Férfi", 78, ChronicDisease.YES, Pregnancy.NO));
        persons.add(new Person("Idős Férfi", 75, ChronicDisease.NO, Pregnancy.NO));
        persons.add(new Person("Középkorú Nő", 45, ChronicDisease.NO, Pregnancy.NO));
    }

    @Test
    void generateVaccinationListFirsTest() {
        vaccine = new FirstVaccine();
        vaccine.generateVaccinationList(persons);
        List<Person> vl = vaccine.getVaccinationList();
        assertEquals(5, vl.size());
        assertTrue(vl.get(0).getPregnant() == Pregnancy.YES);
        assertTrue(vl.get(1).getAge() > 65);
        assertTrue(vl.get(2).getAge() > 65);
    }

    @Test
    void generateVaccinationListSecondTest() {
        vaccine = new SecondVaccine();
        vaccine.generateVaccinationList(persons);
        List<Person> vl = vaccine.getVaccinationList();
        assertEquals(3, vl.size());
        assertTrue(vl.get(0).getAge() <= 65 &&
                vl.get(0).getPregnant() == Pregnancy.NO &&
                vl.get(0).getChronic() == ChronicDisease.NO);
        assertTrue(vl.get(2).getAge() > 65 &&
                vl.get(2).getPregnant() == Pregnancy.NO &&
                vl.get(2).getChronic() == ChronicDisease.NO);


    }
}