package ru.netology.orm_hibernate.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import ru.netology.orm_hibernate.entity.Person;
import ru.netology.orm_hibernate.repository.PersonRepository;

import java.util.List;

@RestController
public class PersonController {
    private final PersonRepository personRepository;

    public PersonController(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    @GetMapping("/persons/by-city")
    public List<Person> getPersonsByCity(@RequestParam("city") String city) {
        return personRepository.getPersonsByCity(city);
    }

    @GetMapping("/persons/age-greater-than")
    public List<Person> getPersonsAgeGreaterThan(@RequestParam("age") int age) {
        return personRepository.getPersonsByAgeGreaterThanOrderByAgeDesc(age);
    }
}