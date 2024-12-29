package com.example.nimapmt.model;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)  // Or another strategy
    private Long id;

    @Setter
    @Getter
    private String name;


}
