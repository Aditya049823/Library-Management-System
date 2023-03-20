package com.Springproject.LibraryManagementSystem.Service;

import com.Springproject.LibraryManagementSystem.Entity.Author;
import com.Springproject.LibraryManagementSystem.Repository.AuthorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AuthorService {
    @Autowired
    AuthorRepository authorRepository;

    public void addAuthor(Author author) {
        authorRepository.save(author);
    }
}
