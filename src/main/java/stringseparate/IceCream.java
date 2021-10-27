package stringseparate;

import java.util.Arrays;

public class IceCream {
    private String[] sortiment;
    private String prefix;
    private String postfix;


    public IceCream(String[] sortiment, String prefix, String postfix) {
        this.sortiment = sortiment;
        this.prefix = prefix;
        this.postfix = postfix;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder(prefix);
        int counter = 0;
        for (String product: sortiment) {
            if (counter++ > 0) sb.append(", ");
            sb.append(product);
        }
        sb.append(postfix);
        return sb.toString();
    }
}
