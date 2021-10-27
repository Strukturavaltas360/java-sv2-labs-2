package stringseparate;

import java.util.List;

public class Codes {
    String getCodesStartWithLetter(List<String> codes) {
        StringBuilder sb = new StringBuilder("Betűvel kezdődő kódok: ");
        int counter = 0;
        for (String code: codes) {
            if (code != null && Character.isLetter(code.charAt(0))) {
                if (counter > 0) {
                    sb.append(", ");
                }
                counter++;
                sb.append(code);
            }
        }
        return sb.toString();
    }
}
