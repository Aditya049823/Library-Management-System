package com.Springproject.LibraryManagementSystem.Controller;

import com.Springproject.LibraryManagementSystem.Entity.Author;
import com.Springproject.LibraryManagementSystem.Service.AuthorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.persistence.Entity;

@RestController
@RequestMapping("author")
public class AuthorController {

    @Autowired
    AuthorService authorService;

    @PostMapping("/addAuthor")
    public String addAuthor(@RequestBody Author author){
        authorService.addAuthor(author);
        return "Author added sucessfully";
    }
}
