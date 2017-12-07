package homework.lesson2.blinov3;

import java.util.ArrayList;

public class Books {

    private ArrayList<Book> booksArray = new ArrayList<>();

    Books() {
    }

    public void addBook(Book bookExemplar) {
        booksArray.add(bookExemplar);
    }

    @Override
    public String toString() {
        return booksArray.toString();
    }
}
