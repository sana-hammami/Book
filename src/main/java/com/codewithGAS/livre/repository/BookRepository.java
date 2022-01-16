package com.codewithGAS.livre.repository;

import com.codewithGAS.livre.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BookRepository extends JpaRepository<Book, Long> {
    Book findByBookId(Long bookId);
    List<Book> findAll();
    void delete (Book b);


}
