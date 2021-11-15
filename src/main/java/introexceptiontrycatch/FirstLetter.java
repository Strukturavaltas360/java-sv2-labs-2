package introexceptiontrycatch;

import java.util.Arrays;
import java.util.List;

public class FirstLetter {
    public static void main(String[] args) {
        List<String> strings =Arrays.asList(new String[] {"Első", "Második", null, ""});

        try {
            for (String st : strings) {
                System.out.println(st.charAt(0)); //NullPointerException, StringIndexOutOfBoundsException
            }
        }
        catch (NullPointerException exception) {
            System.out.println(exception.getMessage());
        }
    }
}
