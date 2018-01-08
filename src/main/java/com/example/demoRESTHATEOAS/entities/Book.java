package com.example.demoRESTHATEOAS.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.NotBlank;

import javax.persistence.*;
import java.util.Date;

@AllArgsConstructor @NoArgsConstructor @Data
@Entity @Table(name="books")
public class Book {

    @Id @GeneratedValue
    @Column(name="id")
    private Integer id;

    @NotBlank
    @Column(name="title")
    private String title;

    @NotBlank
    @Column(name="summary")
    private String summary;

    @Column(name="created")
    private Date created;

    @PrePersist
    private void setCreated(){
        if(created == null){
            created = new Date();
        }
    }

}
