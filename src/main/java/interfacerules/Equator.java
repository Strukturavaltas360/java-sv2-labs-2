package interfacerules;

public class Equator implements Name, Length{
    final static private String NAME = "Equtor";
    final static private double LENGTH = 40_075_000;

    @Override
    public String getName() {
        return NAME;
    }

    @Override
    public double getLength() {
        return LENGTH;
    }
}
