package com.example.baithimd4.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class Staff {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private int age;
    private double salary;
    @ManyToOne
    private Department department;

}
