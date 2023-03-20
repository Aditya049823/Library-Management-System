package com.Springproject.LibraryManagementSystem.Repository;

import com.Springproject.LibraryManagementSystem.Entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepository extends JpaRepository<Book,Integer> {
}
