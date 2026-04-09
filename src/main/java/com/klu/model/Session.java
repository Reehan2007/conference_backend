package com.klu.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Session {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String topic;
    private String speaker;
}