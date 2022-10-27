import java.util.Scanner;

public class Book {
    static Author authorBook;
    static Content contentBook;
    static Title titleBook;

    public static void main(String[] args) {
        authorBook = new Author();
        contentBook = new Content();
        titleBook = new Title();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введіть назву криги: ");
        titleBook.title = scanner.nextLine();

        System.out.print("Введіть автора криги: ");
        authorBook.author = scanner.nextLine();

        System.out.print("Введіть зміст криги: ");
        contentBook.content = scanner.nextLine();

        titleBook.show();
        authorBook.show();
        contentBook.show();
    }
}
