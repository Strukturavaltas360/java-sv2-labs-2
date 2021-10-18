package stringtype;

public class StringTypeMain {
    public static void main(String[] args) {
        String prefix = "Hello ";
        String name = "John Doe";
        String message = prefix + name;
        message = message + 444;
        boolean b = message.equals("Hello John Doe");
        boolean c = message.equals("Hello John Doe444");
        System.out.println("prefix: " + prefix);
        System.out.println("name: " + name);
        System.out.println("message: " + message);
        System.out.println("b: " + b);
        System.out.println("c: " + c);

        String empty = "" + "";
        System.out.println("empty: " + empty);
        System.out.println("length of empty: " + empty.length());

        String st = "Abcde";
        System.out.println("length of st: " + st.length());
        System.out.println("1. és 3. karakter: " + st.charAt(0) + "," + st.charAt(2));
        System.out.println("1. és 3. karakter között: " + st.substring(0, 3));
    }
}
