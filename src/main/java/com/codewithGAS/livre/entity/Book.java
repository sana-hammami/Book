package com.codewithGAS.livre.entity;
import lombok.*;

import javax.persistence.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Setter
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column

    private Long bookId;
    @Column


    @Getter @Setter private String bookName;
    @Column
    @Getter @Setter private String bookAuthor;
    @Column
    @Getter @Setter private int bookEmprunte;
    @Column
    @Getter @Setter private String bookImage;
    @Column
    @Getter @Setter private Long studentId;
}
