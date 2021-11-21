package algorithmsmax.sales;

import java.util.List;

public class Sales {

    public Salesperson selectSalesPersonWithMaxSalesAmount(List<Salesperson> sales) {
        Salesperson selected = null;
        for (Salesperson sp: sales) {
            if (selected == null || sp.getAmount() > selected.getAmount()) {
                selected = sp;
            }
        }
        return selected;
    }

    public Salesperson selectSalesPersonWithFurthestAboveTarget(List<Salesperson> sales) {
        Salesperson selected = null;
        for (Salesperson sp: sales) {
            if (selected == null || sp.getAboveTarget() > selected.getAboveTarget()) {
                selected = sp;
            }
        }
        return selected;
    }


    public Salesperson selectSalesPersonWithFurthestBelowTarget(List<Salesperson> sales) {
        Salesperson selected = null;
        for (Salesperson sp: sales) {
            if (selected == null || sp.getBellowTarget() > selected.getBellowTarget()) {
                selected = sp;
            }
        }
        return selected;
    }
}
