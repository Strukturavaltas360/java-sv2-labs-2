package stringconcat.nameconcat;

public class Name {
    private String familyName;
    private String middleName;
    private String givenName;
    private Title title;

    public Name(String familyName, String middleName, String givenName, Title title) {
        this.familyName = familyName;
        this.middleName = middleName;
        this.givenName = givenName;
        this.title = title;
    }

    public Name(String familyName, String middleName, String givenName) {
        this.familyName = familyName;
        this.middleName = middleName;
        this.givenName = givenName;
    }

    public String concatNameWesternStyle() {
        String name = "";
        if (title != null) name += title.getDescription() + " ";
        if (givenName != null && givenName.length() > 0) name += givenName + " ";
        if (middleName != null && middleName.length() > 0) name += middleName + " ";
        if (familyName != null && familyName.length() > 0) name += familyName + " ";
        return name.trim();
    }

    public String concatNameHungarianStyle() {
        String name = "";
        if (title != null) {
            name = name.concat(title.getDescription());
            name = name.concat(" ");
        }

        if (familyName != null && familyName.length() > 0) {
            name = name.concat(familyName);
            name = name.concat(" ");
        }

        if (middleName != null && middleName.length() > 0) {
            name = name.concat(middleName);
            name = name.concat(" ");
        }

        if (givenName != null && givenName.length() > 0) {
            name = name.concat(givenName);
            name = name.concat(" ");
        }

        return name.trim();
    }
}
