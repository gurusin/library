package com.sud.library.model;

import lombok.Data;

import javax.persistence.*;
import java.util.Set;

@Entity
@Data
public class Article {

    @Id
    private long id;
    private String title;

    @OneToMany(mappedBy = "article", fetch = FetchType.LAZY,
            cascade = CascadeType.ALL)
    private Set<ArticleArtist> artistSet;

}
