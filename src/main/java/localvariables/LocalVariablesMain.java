package localvariables;

public class LocalVariablesMain {
    public static void main(String[] args) {
        /* build failure
        boolean b;
        System.out.print("b: ");
        System.out.println(b);
         */

        boolean b = false;
        System.out.print("b: ");
        System.out.println(b);

        int a = 2;
        System.out.println("a: " + a);

        int i = 3;
        int j = 4;
        int k =  i;
        System.out.println("i: " + i + ", j: " + j + ", k: " + k);

        /* nem deklarált változó hiba
        System.out.println(s);
         */

        String s;
        s = "Hello World";
        System.out.println(s);

        String t;
        t = s;
        System.out.println(t);

        {
            int x = 0;
            System.out.print("x: ");
            System.out.println(x);
            System.out.print("a: ");
            System.out.println(a);
        }

        /* nem deklarált változó hiba
        System.out.print("x: ");
        System.out.println(x);
         */
    }
}
