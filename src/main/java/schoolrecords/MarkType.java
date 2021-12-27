package schoolrecords;

public enum MarkType {
    A(5, "excellent"),
    B(4, "very good"),
    C(3, "improvement needed"),
    D(2, "close fail"),
    F(1, "fail");

    private int mark;
    private String description;

    MarkType(int mark, String description) {
        this.mark = mark;
        this.description = description;
    }

    public int getMark() {
        return mark;
    }

    public String getDescription() {
        return description;
    }
}
