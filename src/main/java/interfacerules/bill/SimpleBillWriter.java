package interfacerules.bill;

import java.util.ArrayList;
import java.util.List;

public class SimpleBillWriter extends AbstractBillWriter implements BillWriter {
    protected String formatBillItem(BillItem bi) {
        return String.format("%s, %d * %d = %d Ft\n",
                bi.getName(),
                bi.getQuantity(),
                bi.getPrice(),
                bi.getValue());
    }
}
