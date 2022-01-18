package com.codewithGAS.livre.service;

import com.codewithGAS.livre.VO.ResponseTemplateVO2;
import com.codewithGAS.livre.VO.Student;
import com.codewithGAS.livre.entity.Book;
import com.codewithGAS.livre.entity.Emprunt;
import com.codewithGAS.livre.repository.BookRepository;
import com.codewithGAS.livre.repository.EmpruntRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class EmpruntService {
    @Autowired
    private EmpruntRepository empruntRepository;
    @Autowired
    private BookRepository bookRepository;
    @Autowired
    private RestTemplate restTemplate;

    public Emprunt saveEmprunt(Emprunt emprunt) {
        Book b = bookRepository.getById(emprunt.getBookId());

        b.setNbCopy(b.getNbCopy()-1);
        b.setStudentId(emprunt.getStudentId());
        bookRepository.save(b);
        return empruntRepository.save(emprunt);

    }

    public  Emprunt updateEmprunt(Long empruntId) {
        Emprunt empruntToUpdate = empruntRepository.findByEmpruntId(empruntId);
        empruntToUpdate.setDateRetour(empruntToUpdate.getDateRetour());
        return empruntRepository.save(empruntToUpdate);

    }

    public ResponseTemplateVO2 getEmpruntWithBookAndStudent(Long empruntId) {
        ResponseTemplateVO2 vo2 =new ResponseTemplateVO2();
        Emprunt emprunt=empruntRepository.findByEmpruntId(empruntId);

        Book book=restTemplate.getForObject("http://localhost:9191/books/"+emprunt.getBookId(), Book.class);

        Student s=restTemplate.getForObject("http://localhost:9091/students/"+emprunt.getStudentId(), Student.class);
        vo2.setBook(book);
        vo2.setStudent(s);
        return  vo2;
    }
}
