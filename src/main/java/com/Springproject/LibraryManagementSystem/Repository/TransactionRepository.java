package com.Springproject.LibraryManagementSystem.Repository;

import com.Springproject.LibraryManagementSystem.Entity.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TransactionRepository extends JpaRepository<Transaction,Integer> {
}
