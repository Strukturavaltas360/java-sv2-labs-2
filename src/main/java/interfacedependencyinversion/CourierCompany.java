package interfacedependencyinversion;

public class CourierCompany {
    public static void main(String[] args) {
        CourierCompany courierCompany = new CourierCompany();
        Box s = new SmallBox();
        Box m = new MediumBox();
        Box l = new LargeBox();
        Box xl = new ExtraLargeBox();
        courierCompany.print(s);
        courierCompany.print(m);
        courierCompany.print(l);
        courierCompany.print(xl);
    }

    private void print(Box box) {
        System.out.println(String.format("Méret: %s, ár: %d", box.getSize(), box.getPrice()));
    }
}
