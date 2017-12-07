package homework.lesson2.blinov3;

import java.util.ArrayList;

public class Books {

    private ArrayList<Book> booksArray = new ArrayList<>();

    Books() {
    }

    public void addBook(Book bookExemplar) {
        booksArray.add(bookExemplar);
    }

    public Books searchByAuthor() {
        Books books = null;
        return books;
    }

    public Books searchByPublisher() {
        Books books = null;
        return books;
    }

    public Books searchByYear() {
        Books books = null;
        return books;
    }

    @Override
    public String toString() {
        return booksArray.toString();
    }
}
