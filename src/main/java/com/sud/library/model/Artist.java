package com.sud.library.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.time.LocalDate;

@Entity
@Data
public class Artist {

    @Id
    private int primaryKey;
    private String firstName;
    private String lastname;
    private String initials;
    private String titles;
    private Gender gender;
    private LocalDate dateOfBirth;
}

