package compositionlist;

import java.util.Scanner;

public class BooksMain {
    public static void main(String[] args) {
        Books books = new Books();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Hány címet akar megadni (1..5)? ");
        int count = scanner.nextInt();
        scanner.nextLine();
        if (count < 1) count = 1;
        if (count > 5) count = 5;

        for (int i = 1; i <= count; i++) {
            System.out.print(i + ". könyv címe: ");
            books.addBook(scanner.nextLine());
        }

        System.out.println(books.getBooks());
        books.findBookAndSetAuthor("Egri csillagok", "Gárdonyi Géza");
        System.out.println(books.getBooks());
    }
}
