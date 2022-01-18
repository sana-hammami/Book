package com.codewithGAS.livre.VO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class Student {
    private Long studentId ;


    private String firstName;


    private String lastName;


    private int age ;


    private String studyField ;


    private String university ;


    private String phone ;


    private int exist ;
}
