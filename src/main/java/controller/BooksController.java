package controller;


import Commnad.*;
import com.example.splab.interfaces.Command;
import model.Book;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/books")
public class BooksController {

    // GET /books - Returns all books
    @GetMapping
    public Object getAllBooks() {
        Command getAllBooksCommand = new GetAllBooksCommand();
        return getAllBooksCommand.execute();
    }

    // GET /books/{id} - Returns details about the book with specified {id}
    @GetMapping("/{id}")
    public Object getBookById(@PathVariable Long id) {
        Command getBookByIdCommand = new GetBookByIdCommand(id);
        return getBookByIdCommand.execute();
    }

    // POST /books - Creates a new book
    @PostMapping
    public Object createBook(@RequestBody String bookData) {
        Command createBookCommand = new CreateBookCommand(bookData);
        return createBookCommand.execute();
    }

    // PUT /books/{id} - Replaces the representation of the specified book
    @PutMapping("/{id}")
    public Object updateBook(@PathVariable Long id, @RequestBody String bookData) {
        Command updateBookCommand = new UpdateBookCommand(id, bookData);
        return updateBookCommand.execute();
    }

    // DELETE /books/{id} - Deletes the book with specified {id}
    @DeleteMapping("/{id}")
    public Object deleteBook(@PathVariable Long id) {
        Command deleteBookCommand = new DeleteBookCommand(id);
        return deleteBookCommand.execute();
    }
}

