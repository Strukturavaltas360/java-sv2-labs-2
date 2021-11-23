package methodvarargs.examstats;

public class ExamStats {
    private int maxPoints;

    public ExamStats(int maxPoints) {
        this.maxPoints = maxPoints;
    }

    public int getNumberOfTopGrades(int limitInPercent, int... results) {
        throwExceptionWhenLengthIsZero(results.length);
        int limit = maxPoints * limitInPercent / 100;
        int topGrades = 0;
        for (int result: results) {
            if (result > limit) {
                topGrades++;
            }
        }
        return topGrades;
    }

    public boolean hasAnyFailed(int limitInPercent, int... results) {
        throwExceptionWhenLengthIsZero(results.length);
        int limit = maxPoints * limitInPercent / 100;
        for (int result: results) {
            if (result < limit) {
                return true;
            }
        }
        return false;
    }

    private void throwExceptionWhenLengthIsZero(int length) {
        if (length == 0) {
            throw new IllegalArgumentException("A result paraméter hiányzik!");
        }
    }
}
