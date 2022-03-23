package pl.coderslab.model;

import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;
import org.springframework.web.context.WebApplicationContext;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Component
//@Scope(value = WebApplicationContext.SCOPE_SESSION, proxyMode = ScopedProxyMode.TARGET_CLASS)
public class MockBookService implements BookServiceInterface {

    private List<Book> books = new ArrayList<>();

//    public MockBookService() {
//        books = new ArrayList<>();
//        books.add(new Book(1L, "9788324631766", "Thiniking	in	Java", "Bruce	Eckel", "Helion", "programming"));
//        books.add(new Book(2L, "9788324627738", "Rusz	glowa	Java.", "Sierra	Kathy,	Bates	Bert", "Helion",
//                "programming"));
//        books.add(new Book(3L, "9780130819338", "Java	2.	Podstawy", "Cay	Horstmann,	Gary	Cornell", "Helion",
//                "programming"));
//    }

    @Override
    public List<Book> getBooks() {
        return books;
    }

    @Override
    public void add(Book book) {
        books.add(book);
    }


    public Optional<Book> get(Long id){
        return books.stream()
                    .filter(item -> item.getId().equals(id))
                    .findFirst();
    }
}
