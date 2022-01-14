package collectionsclass;

import java.util.Objects;

public class ExamResult implements Comparable<ExamResult> {
    private String name;
    private int result;

    public ExamResult(String name, int result) {
        this.name = name;
        this.result = result;
    }

    @Override
    public int compareTo(ExamResult o) {
        return this.result - o.result;
    }

    public String getName() {
        return name;
    }

    public int getResult() {
        return result;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ExamResult that = (ExamResult) o;
        return result == that.result;
    }

    @Override
    public int hashCode() {
        return Objects.hash(result);
    }
}
