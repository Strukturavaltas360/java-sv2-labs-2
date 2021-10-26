package stringconcat.nameconcat;

public class NameMain {
    public static void main(String[] args) {
        Name name = new Name("Takács", "Simon", "Farkas");
        System.out.println(name.concatNameHungarianStyle());
        System.out.println(name.concatNameWesternStyle());
        Name name2 = new Name("Szabó", null, "Tamás", Title.DR);
        System.out.println(name2.concatNameHungarianStyle());
        System.out.println(name2.concatNameWesternStyle());
    }
}
