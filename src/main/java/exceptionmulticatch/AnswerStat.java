package exceptionmulticatch;

public class AnswerStat {
    private BinaryStringConverter bsc;

    public AnswerStat(BinaryStringConverter bsc) {
        this.bsc = bsc;
    }

    public boolean[] convert(String data) {
        try {
            return bsc.binaryStringToBooleanArray(data);
        } catch(NullPointerException |IllegalArgumentException e) {
            throw new InvalidBinaryStringException("Invalid data!", e);
        }
    }

    public int answerTruePercent(String answers) {
        int trueCount = 0;
        boolean[] array = convert(answers);
        for (boolean b: array) {
            if (b) {
                trueCount++;
            }
        }
        return (100 * trueCount) / array.length;
    }
}
