package com.springtechie.models;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "userdtls")
@Data
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String firstName;
    private String lastName;
    private int age;
}

