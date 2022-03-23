package pl.coderslab.model;

import java.util.List;

public interface BookServiceInterface {
    List<Book> getBooks();
    void add(Book book);
}
