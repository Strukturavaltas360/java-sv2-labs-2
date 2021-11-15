package introexceptiontrycatchtrace;

public class Jackpot {
    public static void main(String[] args) {
        Winner winner = new Winner();
        winner.addPerson("Zsombor");
        winner.addPerson("Gotfried");
        winner.addPerson(null);
        winner.addPerson("Tivadar");

        try {
            System.out.println(String.format("Mai nyertes: %s", winner.getWinner()));
        }
        catch (NullPointerException exception) {
            System.out.println(String.format("Kivétel: %s", exception.getMessage()));
        }
    }
}
