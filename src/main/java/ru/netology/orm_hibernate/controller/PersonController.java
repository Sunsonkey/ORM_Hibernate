package ru.netology.orm_hibernate.controller;

import org.springframework.web.bind.annotation.*;
import ru.netology.orm_hibernate.entity.Person;
import ru.netology.orm_hibernate.service.PersonService;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/persons")
public class PersonController {
    private final PersonService service;

    public PersonController(PersonService service) {
        this.service = service;
    }

    @GetMapping("/by-city")
    public List<Person> getPersonsByCity(@RequestParam String city) {
        return service.getPersonsByCity(city);
    }

    @GetMapping("/by-age-less-than")
    public List<Person> getPersonsYoungerThan(@RequestParam int age) {
        return service.getPersonsYoungerThan(age);
    }

    @GetMapping("/by-name-surname")
    public Optional<Person> getPersonByNameAndSurname(
            @RequestParam String name,
            @RequestParam String surname) {
        return service.getPersonByNameAndSurname(name, surname);
    }

    @PostMapping
    public Person savePerson(@RequestBody Person person) {
        return service.savePerson(person);
    }

    @DeleteMapping("/{id}")
    public void deletePerson(@PathVariable Long id) {
        service.deletePerson(id);
    }

    @GetMapping("/{id}")
    public Optional<Person> getPersonById(@PathVariable Long id) {
        return service.getPersonById(id);
    }
}