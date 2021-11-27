package coffee;

public class CoffeeMain {
    public static void main(String[] args) {
        Coffee coffee = new Coffee();
        coffee.setName("Omnia");
        coffee.setPrice(500);
        System.out.println(String.format("name: %s, price: %d", coffee.getName(), coffee.getPrice()));

        Cappuccino cappuccino = new Cappuccino();
        cappuccino.setName("Kapucsínó");
        cappuccino.setPrice(1000);
        System.out.println(String.format("name: %s, price: %d", cappuccino.getName(), cappuccino.getPrice()));
    }
}
