package interfacedependencyinversion.vaccine;

import java.util.ArrayList;
import java.util.List;

public abstract class AbstractVaccine {

    protected List<Person> selectPersons(List<Person> registrated, SelectCase selectCase) {
        List<Person> result = new ArrayList<>();
        for (Person person : registrated) {
            if (testSelectCase(person, selectCase)) {
                result.add(person);
            }
        }
        return result;
    }

    protected boolean testSelectCase(Person person, SelectCase selectCase) {
        switch (selectCase) {
            case PREGNANT:
                return person.getPregnant() == Pregnancy.YES;
            case WITH_CHRONIC_DISEASE:
                return person.getChronic() == ChronicDisease.YES;
            case OLDER_THAN_65_NOT_PREGNANT_WITHOUT_CHRONIC_DISEASE:
                return person.getAge() > 65 &&
                        person.getPregnant() == Pregnancy.NO &&
                        person.getChronic() == ChronicDisease.NO;
            case NOT_OLDER_THAN_65_NOT_PREGNANT_WITHOUT_CHRONIC_DISEASE:
                return person.getAge() <= 65 &&
                        person.getPregnant() == Pregnancy.NO &&
                        person.getChronic() == ChronicDisease.NO;
        }
        return false;
    }
}
