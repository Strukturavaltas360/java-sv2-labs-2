package introexceptionthrow;

public class Validation {
    public void validateName(String name) {
        if (name == null || name.length() == 0) {
            throw new IllegalArgumentException("A megadott név üres!");
        }
    }

    public void validateAge(String ageString) {
        if (ageString == null || ageString.length() == 0) {
            throw new IllegalArgumentException("A megadott életkor üres!");
        }

        int age;
        try {
            age = Integer.parseInt(ageString);
        } catch (NumberFormatException exception) {
            throw new IllegalArgumentException("A megadott életkor nem szám!");
        }

        if (age < 0 || age > 120) {
            throw new IllegalArgumentException("A megadott életkor nem a megengedett értékek között van!");
        }
    }
}
