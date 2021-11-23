package methodoverloading;

public enum Number {
    ONE(1),
    TWO(2),
    THRE(3),
    FOUR(4),
    FIVE(5);

    int value;

    Number(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
