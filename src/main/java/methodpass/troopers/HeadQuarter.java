package methodpass.troopers;

import java.util.ArrayList;
import java.util.List;

public class HeadQuarter {
    List<Trooper> troopers = new ArrayList<>();

    public void moveTrooperByName(String name, Position target) {
        if (name == null || name.trim().length() == 0) {
            throw new IllegalArgumentException("A név null/üres!");
        }
        if (target == null) {
            throw new IllegalArgumentException("A target null!");
        }
        findTrooperByName(name).changePosition(target);
    }

    public void moveClosestTrooper(Position target) {
        if (target == null) {
            throw new IllegalArgumentException("A target null!");
        }
        findClosestTrooper(target).changePosition(target);
    }

    private Trooper findTrooperByName(String name) {
        for (Trooper trooper: troopers) {
            if (trooper.getName().equals(name)) {
                return trooper;
            }
        }
        throw new IllegalArgumentException("Nincs ilyen nevű trooper!");
    }

    private Trooper findClosestTrooper(Position target) {
        if (troopers.size() == 0) {
            throw new IllegalArgumentException("A troopers lista üres!");
        }
        Trooper closest = null;
        for (Trooper trooper: troopers) {
            if (closest == null || trooper.distanceFrom(target) < closest.distanceFrom(target)) {
                closest = trooper;
            }
        }
        return closest;
    }

    private void moveTrooper(Trooper trooper, Position target) {
        trooper.changePosition(target);
    }

    public void addTrooper(Trooper trooper) {
        if (trooper == null) {
            throw new IllegalArgumentException("A trooper null!");
        }
        troopers.add(trooper);
    }

    public List<Trooper> getTroopers() {
        return troopers;
    }
}
