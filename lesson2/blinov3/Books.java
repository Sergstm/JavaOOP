package homework.lesson2.blinov3;

import java.util.ArrayList;

public class Books {

    private ArrayList<Book> booksArray = new ArrayList<>();

    public void addBook(Book bookExemplar) {
        booksArray.add(bookExemplar);
    }

    public Books searchByAuthor(String authorName) {
        Books results = new Books();
        for (Book elem : booksArray) {
            if (elem.getAuthorName().equals(authorName)) {
                results.addBook(elem);
            }
        }
        return results;
    }

    public Books searchByPublisher(String publisher) {
        Books results = new Books();
        for (Book elem : booksArray) {
            if (elem.getPublisher().equals(publisher)) {
                results.addBook(elem);
            }
        }
        return results;
    }

    public Books searchByYear(int year) {
        Books results = new Books();
        for (Book elem : booksArray) {
            if (elem.getYear() >= year) {
                results.addBook(elem);
            }
        }
        return results;
    }

    @Override
    public String toString() {
        return "Books{" +
                "booksArray=" + booksArray +
                '}';
    }
}
