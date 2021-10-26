package enumtype.solarsystem;

public enum SolarSystem {
    MERKÚR(0),
    VÉNUSZ(0),
    FÖLD(1),
    MARS(2),
    JUPITER(12),
    SZATURNUSZ(13),
    URÁNUSZ(6),
    NEPTUNUSZ(9);

    private final int numberOfMoons;

    SolarSystem(int numberOfMoons) {
        this.numberOfMoons = numberOfMoons;
    }

    public int getNumberOfMoons() {
        return numberOfMoons;
    }
}
