package interfacerules.bill;

import java.util.ArrayList;
import java.util.List;

public abstract class AbstractBillWriter implements BillWriter {
    @Override
    public String writeBill(List<String> billItems) {
        StringBuilder sb = new StringBuilder();
        for (BillItem bi : transformToBillItemList(billItems)) {
            sb.append(formatBillItem(bi));
        }
        return sb.toString();
    }

    protected abstract String formatBillItem(BillItem bi) ;

    private List<BillItem> transformToBillItemList(List<String> billItems) {
        List<BillItem> items = new ArrayList<>();
        for (String line: billItems) {
            items.add(new BillItem(line));
        }
        return items;
    }
}
