package methodstructure.pendrives;

import java.util.List;

public class Pendrives {
    public Pendrive getBest(List<Pendrive> pendrives) {
        Pendrive best = null;
        for (Pendrive pendrive: pendrives) {
            if (best == null || pendrive.comparePricePerCapacity(best) < 0) {
                best = pendrive;
            }
        }
        return best;
    }

    public Pendrive getCheapest(List<Pendrive> pendrives) {
        Pendrive cheapest = null;
        for (Pendrive pendrive: pendrives) {
            if (cheapest == null || pendrive.isCheaperThan(cheapest)) {
                cheapest = pendrive;
            }
        }
        return cheapest;
    }

    public void risePriceWhereCapacity(List<Pendrive> pendrives, int percent, int capacity) {
        for (Pendrive pendrive: pendrives) {
            if (pendrive.getCapacity() == capacity) {
                pendrive.risePrice(percent);
            }
        }
    }
}
