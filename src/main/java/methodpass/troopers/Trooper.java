package methodpass.troopers;

public class Trooper {
    private String name;
    private Position position = new Position(0, 0);

    public Trooper(String name) {
        if (name != null && name.trim().length() > 0) {
            this.name = name;
        } else {
            throw new IllegalArgumentException("A név null/üres!");
        }
    }

    public void changePosition(Position target) {
        if (target != null) {
            position = target;
        } else {
            throw new IllegalArgumentException("A target null!");
        }
    }

    public double distanceFrom(Position target) {
        if (target != null) {
            return position.distanceFrom(target);
        } else {
            throw new IllegalArgumentException("A target null!");
        }
    }

    public String getName() {
        return name;
    }

    public Position getPosition() {
        return position;
    }
}
