package catalog;

public class SearchCriteria {
    public static SearchCriteria createByTitle(String title) {
        validateTitle(title);
        return new SearchCriteria(title, null);
    }

    public static SearchCriteria createByContributor(String contributor) {
        validateContributor(contributor);
        return new SearchCriteria(null, contributor);
    }

    public static SearchCriteria createByBoth(String title, String contributor) {
        validateTitle(title);
        validateContributor(contributor);
        return new SearchCriteria(title, contributor);
    }

    private static void validateTitle(String title) {
        if (Validators.isBlank(title)) {
            throw new IllegalArgumentException("Empty title");
        }
    }

    private static void validateContributor(String contributor) {
        if (Validators.isBlank(contributor)) {
            throw new IllegalArgumentException("Empty contributor");
        }
    }

    private String title;
    private String contributor;

    private SearchCriteria(String title, String contributor) {
        this.title = title;
        this.contributor = contributor;
    }

    public boolean hasTitle() {
        return !Validators.isBlank(title);
    }

    public boolean hasContributor() {
        return !Validators.isBlank(contributor);
    }

    public String getTitle() {
        return title;
    }

    public String getContributor() {
        return contributor;
    }
}