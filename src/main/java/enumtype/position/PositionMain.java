package enumtype.position;

public class PositionMain {
    public static void main(String[] args) {
        Position position = Position.KÖNYVELŐ;
        System.out.println(position.name() + ": " + position.getSalary() + " + " + position.getBenefit());
        position = Position.RAKTÁROS;
        System.out.println(position.name() + ": " + position.getSalary() + " + " + position.getBenefit());
    }
}
