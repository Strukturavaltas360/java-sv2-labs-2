package introexceptionthrow.patient;

public class SsnValidator {
    public boolean isValidSsn(String ssn) {
        if (ssn == null || ssn.length() != 9) {
            return false;
        }

        for (char ch : ssn.toCharArray()) {
            if (!Character.isDigit(ch)) {
                return false;
            }
        }

        int checkSum = 0;
        for (int i = 0; i < ssn.length() - 1; i ++) {
            try {
                int digit = Integer.parseInt(ssn.substring(i, i + 1));
                checkSum += ((i + 1) % 2 == 0 ? 7 : 3) * digit;
            }
            catch (NumberFormatException exception) {
                return false;
            }
        }
        char lastChar = Integer.toString(checkSum % 10).charAt(0);

        return ssn.charAt(ssn.length() - 1) == lastChar;
    }
}
