package com.codewithGAS.livre.repository;

import com.codewithGAS.livre.entity.Book;
import com.codewithGAS.livre.entity.Emprunt;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmpruntRepository  extends JpaRepository<Emprunt, Long> {
    Emprunt findByEmpruntId(Long empruntId);



}
