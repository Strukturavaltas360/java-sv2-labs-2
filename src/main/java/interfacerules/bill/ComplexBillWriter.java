package interfacerules.bill;

import java.util.ArrayList;
import java.util.List;

public class ComplexBillWriter extends AbstractBillWriter implements BillWriter {
    @Override
    protected String formatBillItem(BillItem bi) {
        return String.format("%s; darabszám: %d, egységár: %d, összesen: %d Ft\n",
                bi.getName(),
                bi.getQuantity(),
                bi.getPrice(),
                bi.getValue());
    }
}
