package classstructureintegrate;

import java.util.Scanner;

public class ProductMain {
    public static void main(String[] args) {
        String name;
        int price;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Kérem adja meg a termék");
        System.out.print("  megnevezését: ");
        name = scanner.nextLine();
        System.out.print("  árát: ");
        price = scanner.nextInt();

        Product product = new Product(name, price);
        System.out.println(product.getName() + " (" + product.getPrice() + ")");
        System.out.println("+2");
        product.increasePrice(2);
        System.out.println(product.getName() + " (" + product.getPrice() + ")");
        System.out.println("-1");
        product.decreasePrice(1);
        System.out.println(product.getName() + " (" + product.getPrice() + ")");
    }
}
