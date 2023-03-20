package com.Springproject.LibraryManagementSystem.Repository;

import com.Springproject.LibraryManagementSystem.Entity.Author;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AuthorRepository extends JpaRepository<Author,Integer> {
}
