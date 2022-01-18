package com.codewithGAS.livre.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.*;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.Date;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Emprunt {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    @Column
    private Long empruntId;

    @Column
    private Long bookId;

    @Column
    private Long studentId;

    @Column
    @JsonFormat(pattern="yyyy-MM-dd")
    private LocalDate dateEmprunt;

    @Column
    @JsonFormat(pattern="yyyy-MM-dd")
    private LocalDate dateRetour;

    @Column
    @JsonFormat(pattern="yyyy-MM-dd")
    private LocalDate dateEstime;

}
