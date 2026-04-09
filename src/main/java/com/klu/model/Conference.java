package com.klu.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Conference {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;
    private String location;
    private String date;
}