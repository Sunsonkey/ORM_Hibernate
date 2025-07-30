package ru.netology.orm_hibernate.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import ru.netology.orm_hibernate.entity.Person;

import java.util.List;
import java.util.Optional;

@Repository
public interface PersonRepository extends JpaRepository<Person, Long> {

    @Query("SELECT p FROM Person p WHERE p.cityOfLiving = :city")
    List<Person> findByCity(@Param("city") String city);

    @Query("SELECT p FROM Person p WHERE p.age < :age ORDER BY p.age ASC")
    List<Person> findPersonsYoungerThan(@Param("age") int age);

    @Query("SELECT p FROM Person p WHERE p.name = :name AND p.surname = :surname")
    Optional<Person> findPersonByNameAndSurname(
            @Param("name") String name,
            @Param("surname") String surname);
}