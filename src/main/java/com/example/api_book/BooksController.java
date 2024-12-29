package com.example.api_book;

import org.springframework.web.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/books")
public class BooksController
{
    public final List<Book> books=new ArrayList<>();

    @GetMapping
    public List<Book> getBooksList()
    {
        return books;
    }

    @GetMapping({"/id"})
    public Book getBook(@RequestParam String id) {
        for(Book book:books) {
            if(book.getId().equals(id)) {
                return book;
            }
        }
        return null;
    }

    @PostMapping
    public Book createBook(@RequestBody Book book) {
        books.add(book);
        return book;
    }

    @PutMapping({"/id"})
    public Book updateBook(@RequestBody Book book,@RequestParam String id) {
        for(int i=0; i<books.size(); i++) {
            if(books.get(i).getId().equals(id)) {
                books.set(i,book);
            }
        }
        return book;
    }

    @DeleteMapping({"/id"})
    public String deleteBook(@RequestParam String id) {
        for(int i=0; i<books.size(); i++) {
            if (books.get(i).getId().equals(id)) {
                books.remove(i);
            }
        }
        return "Book has been deleted successfully";
    }
}


