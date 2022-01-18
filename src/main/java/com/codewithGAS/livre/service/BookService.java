package com.codewithGAS.livre.service;


import com.codewithGAS.livre.VO.ResponseTemplateVO;
import com.codewithGAS.livre.VO.Student;
import com.codewithGAS.livre.entity.Book;
import com.codewithGAS.livre.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.client.RestTemplate;

import java.util.List;
import java.util.Properties;

@Service
public class BookService {

    @Autowired
    private BookRepository bookRepository;
  @Autowired
   private RestTemplate restTemplate;


    public Book saveBook(Book book){
        return  bookRepository.save(book);
    }
    public  Book findBookById(Long bookID) {
        return bookRepository.findByBookId(bookID);
    }
    public List<Book> getAllBook() {
        return bookRepository.findAll();
    }

    public void deleteBook(Long bookId ) {
        Book book=bookRepository.getById(bookId);
         bookRepository.delete(book);
    }


    public Book updateBook(Long bookId) {
        Book bookToUpdate = bookRepository.getById(bookId);
        bookToUpdate.setBookName(bookToUpdate.getBookName());
        bookToUpdate.setBookAuthor(bookToUpdate.getBookAuthor());
        bookToUpdate.setNbCopy(bookToUpdate.getNbCopy());
        bookToUpdate.setDescription(bookToUpdate.getDescription());
        bookToUpdate.setStudentId(bookToUpdate.getStudentId());
        return bookRepository.save(bookToUpdate);


    }
    public List<Book> getAvailableBooks( ) {

        return bookRepository.findByNbCopyGreaterThan(0);

    }

    public ResponseTemplateVO getBookWithStudent(Long bookId) {
        ResponseTemplateVO vo =new ResponseTemplateVO();
        Book book=bookRepository.findByBookId(bookId);


       Student s=restTemplate.getForObject("http://localhost:9091/students/"+book.getStudentId(), Student.class);
       vo.setBook(book);
       vo.setStudent(s);
       return  vo;
   }

}
