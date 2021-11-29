package abstractclass.exercise;

public class MathLesson {
    public static void main(String[] args) {
        MathExercise m1 = new Adder();
        MathExercise m2 = new Substracter();
        MathExercise m3 = new Multiplier();
        MathExercise m4 = new Divisor();

        int a = 20;
        int b = 4;

        System.out.println(String.format("m1.getSolution(%d,%d)=%d", a, b, m1.getSolution(a, b)));
        System.out.println(String.format("m2.getSolution(%d,%d)=%d", a, b, m2.getSolution(a, b)));
        System.out.println(String.format("m3.getSolution(%d,%d)=%d", a, b, m3.getSolution(a, b)));
        System.out.println(String.format("m4.getSolution(%d,%d)=%d", a, b, m4.getSolution(a, b)));
    }
}
