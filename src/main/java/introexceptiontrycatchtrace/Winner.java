package introexceptiontrycatchtrace;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Random;

public class Winner {
    List<String> people = new ArrayList<>();

    public void addPerson(String person) {
        people.add(person);
    }

    public String getWinner() {
        Random random = new Random();
        int selected = random.nextInt(0, people.size());
        return people.get(selected).toUpperCase(Locale.ROOT);
    }
}
