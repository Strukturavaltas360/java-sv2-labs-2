package lambdacollectors;

public class Honey {
    private HoneyType type;
    private GlassSize size;

    public Honey(HoneyType type, GlassSize size) {
        this.type = type;
        this.size = size;
    }

    @Override
    public String toString() {
        return "Honey{" +
                "type=" + type +
                ", size=" + size +
                '}';
    }

    public HoneyType getType() {
        return type;
    }

    public GlassSize getSize() {
        return size;
    }
}
