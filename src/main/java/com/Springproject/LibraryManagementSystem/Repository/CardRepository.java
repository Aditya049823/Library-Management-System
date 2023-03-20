package com.Springproject.LibraryManagementSystem.Repository;

import com.Springproject.LibraryManagementSystem.Entity.Card;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CardRepository extends JpaRepository<Card,Integer> {
}
