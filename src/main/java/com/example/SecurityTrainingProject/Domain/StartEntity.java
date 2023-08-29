package com.example.SecurityTrainingProject.Domain;

import jakarta.persistence.*;

@Entity
public class StartEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column
    private String memberId;

    @Column
    private String passWd;
}
