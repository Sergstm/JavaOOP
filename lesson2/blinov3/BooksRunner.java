package homework.lesson2.blinov3;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class BooksRunner {
    public static void main(String[] args) throws FileNotFoundException {

        Books booksLibrary = createBooksArray();
//        System.out.println(booksLibrary);

        Books author = booksLibrary.searchByAuthor("Kathy Sierra, Bert Bates");
//        System.out.println(author);

        Books publisher = booksLibrary.searchByPublisher("Pearson Education US");
//        System.out.println(publisher);

        Books year = booksLibrary.searchByYear(2006);
//        System.out.println(year);
    }

    private static Books createBooksArray() throws FileNotFoundException {
        String filePath = "C:\\Program Files\\JetBrains\\" +
                "IdeaProjects\\JavaOOP\\src\\homework\\lesson2\\blinov3\\data.txt";
        Scanner scanner = new Scanner(new File(filePath));

        Books library = new Books();

        Book book = new Book();
        book.setTitle(scanner.nextLine());
        book.setAuthorName(scanner.nextLine());
        book.setPublisher(scanner.nextLine());
        book.setYear(Integer.parseInt(scanner.nextLine()));
        book.setNumPage(Integer.parseInt(scanner.nextLine()));
        book.setPrice(Double.parseDouble(scanner.nextLine()));
        book.setBindingType(scanner.nextLine());
        library.addBook(book);
        scanner.nextLine();

        Book book1 = new Book();
        book1.setTitle(scanner.nextLine());
        book1.setAuthorName(scanner.nextLine());
        book1.setPublisher(scanner.nextLine());
        book1.setYear(Integer.parseInt(scanner.nextLine()));
        book1.setNumPage(Integer.parseInt(scanner.nextLine()));
        book1.setPrice(Double.parseDouble(scanner.nextLine()));
        book1.setBindingType(scanner.nextLine());
        library.addBook(book1);
        scanner.nextLine();

        Book book2 = new Book();
        book2.setTitle(scanner.nextLine());
        book2.setAuthorName(scanner.nextLine());
        book2.setPublisher(scanner.nextLine());
        book2.setYear(Integer.parseInt(scanner.nextLine()));
        book2.setNumPage(Integer.parseInt(scanner.nextLine()));
        book2.setPrice(Double.parseDouble(scanner.nextLine()));
        book2.setBindingType(scanner.nextLine());
        library.addBook(book2);

        return library;
    }
}
