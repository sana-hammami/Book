package com.codewithGAS.livre.controller;

import com.codewithGAS.livre.VO.ResponseTemplateVO2;
import com.codewithGAS.livre.entity.Book;
import com.codewithGAS.livre.entity.Emprunt;
import com.codewithGAS.livre.service.BookService;
import com.codewithGAS.livre.service.EmpruntService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/books")

public class EmpruntController {
    @Autowired
    private EmpruntService empruntService;
    @PostMapping("/emprunt")
    public Emprunt saveEmprunt(@RequestBody Emprunt emprunt) {
        return empruntService.saveEmprunt(emprunt);
    }
    @GetMapping("/emprunt/{id}")
    public ResponseTemplateVO2 getEmpruntWithBookAndStudent(@PathVariable("id") Long empruntId){
        return empruntService.getEmpruntWithBookAndStudent(empruntId);
    }

    @PutMapping("/emprunt/{id}")
    public Emprunt updateEmprunt(@RequestBody Emprunt emprunt,@PathVariable("id") Long empruntId) {
        return empruntService.updateEmprunt(empruntId);
    }
}
