package com.codewithGAS.livre.VO;

import com.codewithGAS.livre.entity.Book;
import com.codewithGAS.livre.entity.Emprunt;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ResponseTemplateVO2 {
    private Emprunt emprunt;
    private Book book;
    private Student student;
}
