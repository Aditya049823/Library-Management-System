package com.Springproject.LibraryManagementSystem.Controller;

import com.Springproject.LibraryManagementSystem.Entity.Book;
import com.Springproject.LibraryManagementSystem.Service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/books")
public class BookController {

    @Autowired
    BookService bookService;

    @PostMapping("/add")
    public String addBooks(@RequestBody Book book){

        try {
            bookService.addBooks(book);
        }
        catch(Exception e)
        {
            throw new RuntimeException("Book not added");
        }
        return "Book added Sucessfully";
    }
}
