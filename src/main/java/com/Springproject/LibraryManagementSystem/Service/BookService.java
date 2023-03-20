package com.Springproject.LibraryManagementSystem.Service;

import com.Springproject.LibraryManagementSystem.Entity.Author;
import com.Springproject.LibraryManagementSystem.Entity.Book;
import com.Springproject.LibraryManagementSystem.Repository.AuthorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Service
public class BookService {

    @Autowired
    AuthorRepository authorRepository;

    public void addBooks(@RequestBody Book book) throws Exception
    {
        Author author;
        try{
            author=authorRepository.findById(book.getAuthor().getAuthorId()).get();
        }
        catch (Exception e)
        {
            throw new Exception("Author not present");
        }
        List<Book>books=author.getBookList();
        books.add(book);
        authorRepository.save(author);
    }

}
