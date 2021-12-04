package interfacedependencyinversion.vaccine;

import java.util.ArrayList;
import java.util.List;

public class SecondVaccine extends AbstractVaccine implements Vaccine {
    List<Person> vaccinationList = new ArrayList<>();

    @Override
    public List<Person> getVaccinationList() {
        return vaccinationList;
    }

    @Override
    public void generateVaccinationList(List<Person> registrated) {
        vaccinationList.addAll(selectPersons(registrated, SelectCase.NOT_OLDER_THAN_65_NOT_PREGNANT_WITHOUT_CHRONIC_DISEASE));
        vaccinationList.addAll(selectPersons(registrated, SelectCase.OLDER_THAN_65_NOT_PREGNANT_WITHOUT_CHRONIC_DISEASE));
    }
}
