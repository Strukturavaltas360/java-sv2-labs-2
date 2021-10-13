package classstructureconstructors;

public class BookMain {
    public static void main(String[] args) {
        Book hoember = new Book("Jo Nesbo", "Hóember");
        hoember.register("H001");
        System.out.println(hoember.getAuthor() + ": " + hoember.getTitle()
                + " (" + hoember.getRegNumber() + ")");
    }
}
