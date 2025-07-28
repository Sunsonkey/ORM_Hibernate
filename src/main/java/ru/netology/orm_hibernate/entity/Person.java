package ru.netology.orm_hibernate.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import jakarta.persistence.*;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "persons")
@IdClass(PersonId.class)
public class Person {
    @Id
    @Column(name = "name", nullable = false, length = 50)
    private String name;

    @Id
    @Column(name = "surname", nullable = false, length = 50)
    private String surname;

    @Id
    @Column(name = "age", nullable = false)
    private int age;

    @Column(name = "phone_number", length = 20)
    private String phoneNumber;

    @Column(name = "city_of_living", length = 50)
    private String cityOfLiving;
}