package statements;

public class StatementMain {
    public static void main(String[] args) {
        int x = 5 + 6;
        System.out.print("x: ");
        System.out.println(x);

        int y = 11 - x;
        System.out.print("y: ");
        System.out.println(y);

        int z = 8;
        System.out.print("z: ");
        System.out.println(z);

        boolean b = x > y;
        System.out.print("b: ");
        System.out.println(b);

        boolean c = b || z > 5;
        System.out.print("c: ");
        System.out.println(c);

        z++;
        System.out.print("z: ");
        System.out.println(z);
    }
}
