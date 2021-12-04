package interfacerules.bill;

import java.util.ArrayList;
import java.util.List;

public class ComplexBillWriter extends SimpleBillWriter implements BillWriter {
    protected String getFormatString() {
        return "%s; darabszám: %d, egységár: %d, összesen: %d Ft\n";
    }
}
