package enumtype.university;

public enum University {
    BME("Budapesti Múszaki Egyetem"),
    ELTE("Eötvös Loránd Tudományegyetem"),
    SZTE("Szegedi Tudományegyetem"),
    PTE("Pécsi Tudományegyetem");

    private final String name;

    University(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
