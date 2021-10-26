package primitivetypes.exam;

import java.util.ArrayList;
import java.util.List;

public class Exam {
    List<Person> participants = new ArrayList<>();

    public void addPerson(Person person) {
        participants.add(person);
    }

    public List<Person> getParticipants() {
        return participants;
    }
}
