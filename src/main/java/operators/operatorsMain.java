package operators;

public class operatorsMain {
    public static void main(String[] args) {
        System.out.println("31 binárisan: " + Integer.toBinaryString(31));
        System.out.println("9 páros: " + Operators.isEven(9));
        System.out.println("6 páros: " + Operators.isEven(6));
        System.out.println("getResultOfDivision(35,6): " + Operators.getResultOfDivision(35, 6));
        System.out.println("isNull(null): " + Operators.isNull(null));
        System.out.println("isNull(\"nem\"): " + Operators.isNull("nem"));
        System.out.println("isEmpty(null): " + Operators.isEmpty(null));
        System.out.println("isEmpty(\"null\"): " + Operators.isEmpty("null"));
    }
}
