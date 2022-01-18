package com.codewithGAS.livre.VO;

import com.codewithGAS.livre.entity.Book;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ResponseTemplateVO {
    private Book book;
    private Student student;

}
