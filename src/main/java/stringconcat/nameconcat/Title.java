package stringconcat.nameconcat;

public enum Title {
    MR("Mr."), MRS("Mrs."), MS("Ms."), DR("Dr.");

    private final String description;

    Title(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
