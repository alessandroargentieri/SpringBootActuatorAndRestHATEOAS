package com.example.demoRESTHATEOAS.daos;

import com.example.demoRESTHATEOAS.entities.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookDao extends JpaRepository<Book, Integer> {
}
