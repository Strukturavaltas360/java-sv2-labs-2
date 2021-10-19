package introcontrol;

public class IntroControlMain {
    public static void main(String[] args) {
        IntroControl introControl = new IntroControl();
        int number = 5;
        System.out.println("subtractTenIfGreaterThanTen(" + number + "): " + introControl.subtractTenIfGreaterThanTen(number));
        number = 19;
        System.out.println("subtractTenIfGreaterThanTen(" + number + "): " + introControl.subtractTenIfGreaterThanTen(number));

        System.out.println("describeNumber(" + number + "): " + introControl.describeNumber(number));
        number = 0;
        System.out.println("describeNumber(" + number + "): " + introControl.describeNumber(number));

        String name = "Attila";
        System.out.println("greetingToJoe(" + name + "): " + introControl.greetingToJoe(name));
        name = "Joe";
        System.out.println("greetingToJoe(" + name + "): " + introControl.greetingToJoe(name));

        int sale = 1_200_000;
        System.out.println("calculateBonus(" + sale + "): " + introControl.calculateBonus(sale));
        sale = 800_000;
        System.out.println("calculateBonus(" + sale + "): " + introControl.calculateBonus(sale));

        int prev = 1000;
        int next = 2300;
        System.out.println("calculateConsumption(" + prev + "," + next + "): " + introControl.calculateConsumption(prev, next));
        next = 500;
        System.out.println("calculateConsumption(" + prev + "," + next + "): " + introControl.calculateConsumption(prev, next));

        int max = 8;
        System.out.println("printNumbers(" + max + ")");
        introControl.printNumbers(max);

        int min = 3;
        System.out.println("printNumbersBetween(" + min + "," + max + ")");
        introControl.printNumbersBetween(min,max);

        int a = 2;
        int b = 5;
        System.out.println("printNumbersBetweenAnyDirection(" + a + "," + b + ")");
        introControl.printNumbersBetweenAnyDirection(a,b);

        a = 7;
        b = 5;
        System.out.println("printNumbersBetweenAnyDirection(" + a + "," + b + ")");
        introControl.printNumbersBetweenAnyDirection(a,b);

        max = 9;
        System.out.println("printOddNumbers(" + max + ")");
        introControl.printOddNumbers(max);
    }
}
