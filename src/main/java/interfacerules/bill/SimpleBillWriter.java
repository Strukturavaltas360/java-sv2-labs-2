package interfacerules.bill;

import java.util.ArrayList;
import java.util.List;

public class SimpleBillWriter implements BillWriter {
    @Override
    public String writeBill(List<String> billItems) {
        StringBuilder sb = new StringBuilder();
        for (BillItem bi : transformToBillItemList(billItems)) {
            sb.append(String.format(getFormatString(),
                    bi.getName(),
                    bi.getQuantity(),
                    bi.getPrice(),
                    bi.getValue()));
        }
        return sb.toString();
    }

    protected String getFormatString() {
        return "%s, %d * %d = %d Ft\n";
    }

    protected List<BillItem> transformToBillItemList(List<String> billItems) {
        List<BillItem> items = new ArrayList<>();
        for (String line: billItems) {
            items.add(new BillItem(line));
        }
        return items;
    }
}
