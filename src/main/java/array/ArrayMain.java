package array;

public class ArrayMain {
    public static void main(String[] args) {
        String[] dayOfWeek = {"hétfő", "kedd", "szerda", "csütörtök", "péntek", "szombat", "vasárnap"};
        System.out.println("dayOfWeek[1]: " + dayOfWeek[1]);
        System.out.println("dayOfWeek.length: " + dayOfWeek.length);

        int[] hatvanyok = new int[5];
        for (int i = 0; i < hatvanyok.length; i++) {
            if (i == 0)
                hatvanyok[i] = 1;
            else
                hatvanyok[i] = hatvanyok[i - 1] * 2;
        }
        System.out.print("hatvanyok[]:");
        for (int elem: hatvanyok) System.out.print(" " + elem);
        System.out.println();

        boolean[] booleanArray = new boolean[6];
        for (int i = 0; i < booleanArray.length; i++) {
            if (i == 0)
                booleanArray[i] = false;
            else
                booleanArray[i] = !booleanArray[i - 1];
        }
        System.out.print("booleanArray[]:");
        for (boolean elem: booleanArray) System.out.print(" " + elem);
        System.out.println();
    }
}
