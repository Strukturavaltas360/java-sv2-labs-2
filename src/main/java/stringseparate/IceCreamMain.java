package stringseparate;

public class IceCreamMain {
    public static void main(String[] args) {
        IceCream iceCream = new IceCream(new String[] {"csoki", "vanília", "eper", "citrom", "puncs"},
                "Ma kapható: ", ". Gyerekeknek féláron!");
        System.out.println(iceCream);
    }
}
