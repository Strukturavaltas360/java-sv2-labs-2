package stringseparate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CodesMain {
    public static void main(String[] args) {
        String[] codeArray = {"T57fbj", "12345", "xtcu45","f578GVHd","34kjk6"};
        List<String> codeList = new ArrayList(Arrays.asList(codeArray));
        Codes codes = new Codes();
        System.out.println(codes.getCodesStartWithLetter(codeList));
    }
}
