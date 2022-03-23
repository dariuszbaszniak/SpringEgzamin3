package pl.coderslab.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;
import pl.coderslab.model.Book;
import pl.coderslab.model.MockBookService;

import java.util.List;

@RestController
@RequestMapping("/books")
public class BookController {

    private MockBookService mockBookService;

    public BookController(MockBookService mockBookService) {
        this.mockBookService = mockBookService;
    }

    @RequestMapping("/helloBook")
    public Book helloBook() {
        return new Book(1L, "9788324631766", "Thinking in Java",
                "Bruce Eckel", "Helion", "programming");
    }

    @GetMapping("")
    @ResponseBody
    public List<Book> getList(){
        return mockBookService.getBooks();
    }

    @PostMapping("")
    @ResponseStatus(HttpStatus.CREATED)
    public void addBook(@RequestBody Book book) {
        mockBookService.add(book);
    }

    @GetMapping("/{id}")
    public Book getBook(@PathVariable Long id){
        return this.mockBookService.get(id).orElseThrow(() -> {
           throw new ResponseStatusException(
                   HttpStatus.NOT_FOUND, "entity not found"
           );
        });
    }

}
