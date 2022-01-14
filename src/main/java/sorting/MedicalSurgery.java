package sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MedicalSurgery {
    List<Patient> patients;

    public MedicalSurgery(List<Patient> patients) {
        this.patients = new ArrayList<>(patients);
    }

    public List<Patient> getPatientsInTimeOrder() {
        List<Patient> result = new ArrayList<>(patients);
        Collections.sort(result, new PatientComparator());
        return result;
    }

    public List<Patient> getPatients() {
        return patients;
    }
}
