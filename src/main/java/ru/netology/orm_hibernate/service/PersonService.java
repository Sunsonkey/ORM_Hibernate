package ru.netology.orm_hibernate.service;

import org.springframework.stereotype.Service;
import ru.netology.orm_hibernate.entity.Person;
import ru.netology.orm_hibernate.repository.PersonRepository;

import java.util.List;
import java.util.Optional;

@Service
public class PersonService {
    private final PersonRepository repository;

    public PersonService(PersonRepository repository) {
        this.repository = repository;
    }

    public List<Person> getPersonsByCity(String city) {
        return repository.findByCity(city);
    }

    public List<Person> getPersonsYoungerThan(int age) {
        return repository.findPersonsYoungerThan(age);
    }

    public Optional<Person> getPersonByNameAndSurname(String name, String surname) {
        return repository.findPersonByNameAndSurname(name, surname);
    }

    public Person savePerson(Person person) {
        return repository.save(person);
    }

    public void deletePerson(Long id) {
        repository.deleteById(id);
    }

    public Optional<Person> getPersonById(Long id) {
        return repository.findById(id);
    }
}