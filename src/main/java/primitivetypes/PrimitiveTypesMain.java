package primitivetypes;

public class PrimitiveTypesMain {
    public static void main(String[] args) {
        int a = 2;
        System.out.println(a);

        //autoboxing
        Integer b = 2;
        System.out.println(b);

        Integer c = a;
        System.out.println(c);
        Integer d = b;
        System.out.println(d);
        Integer e = Integer.valueOf(2);
        System.out.println(e);

        //autounboxing
        int f = Integer.valueOf(2);
        System.out.println(f);
        int g = Integer.valueOf(a);
        System.out.println(g);

        //autoboxing+autounboxing
        int h = Integer.valueOf(c);
        System.out.println(h);

        int i = Integer.parseInt("2");
        System.out.println(i);

        //autoboxing
        Integer j = Integer.parseInt("2");
        System.out.println(j);

        boolean k = true;
        System.out.println(k);

        //autoboxing
        Boolean l = true;
        System.out.println(l);

        //autounboxing
        boolean m = Boolean.valueOf(true);
        System.out.println(m);

        Boolean n = Boolean.valueOf(true);
        System.out.println(n);

        boolean o = Boolean.parseBoolean("TrUe");
        System.out.println(o);

        //autoboxing
        Boolean p = Boolean.parseBoolean("TrUe");
        System.out.println(p);

        boolean q = Boolean.parseBoolean("TreU");
        System.out.println(q);

        //autoboxing
        Boolean r = Boolean.parseBoolean("TreU");
        System.out.println(r);
    }
}
