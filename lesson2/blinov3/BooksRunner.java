package homework.lesson2.blinov3;

import java.io.File;
import java.io.FileNotFoundException;
import java.time.Year;
import java.util.Scanner;

public class BooksRunner {
    public static void main(String[] args) throws FileNotFoundException {

        createBooksArray();

    }

    private static void createBooksArray() throws FileNotFoundException {
        String filePath = "C:\\Program Files\\JetBrains\\" +
                "IdeaProjects\\JavaOOP\\src\\homework\\lesson2\\blinov3\\data.txt";
        Scanner scanner = new Scanner(new File(filePath));

        Books books = new Books();

        Book book = new Book();
        book.setTitle(scanner.nextLine());
        book.setAuthorName(scanner.nextLine());
        book.setPublisher(scanner.nextLine());
        book.setYear(Year.parse(scanner.nextLine()));
        book.setNumPage(Integer.parseInt(scanner.nextLine()));
        book.setPrice(Double.parseDouble(scanner.nextLine()));
        book.setBindingType(scanner.nextLine());
        books.addBook(book);
        scanner.nextLine();

        Book book1 = new Book();
        book1.setTitle(scanner.nextLine());
        book1.setAuthorName(scanner.nextLine());
        book1.setPublisher(scanner.nextLine());
        book1.setYear(Year.parse(scanner.nextLine()));
        book1.setNumPage(Integer.parseInt(scanner.nextLine()));
        book1.setPrice(Double.parseDouble(scanner.nextLine()));
        book1.setBindingType(scanner.nextLine());
        books.addBook(book1);
        scanner.nextLine();

        Book book2 = new Book();
        book2.setTitle(scanner.nextLine());
        book2.setAuthorName(scanner.nextLine());
        book2.setPublisher(scanner.nextLine());
        book2.setYear(Year.parse(scanner.nextLine()));
        book2.setNumPage(Integer.parseInt(scanner.nextLine()));
        book2.setPrice(Double.parseDouble(scanner.nextLine()));
        book2.setBindingType(scanner.nextLine());
        books.addBook(book2);

//        System.out.println(books);
    }
}
