package ru.netology.orm_hibernate.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PersonId implements Serializable {
    private String name;
    private String surname;
    private int age;
}