-- liquibase formatted sql

-- changeset author:id2
INSERT INTO persons (name, surname, age, phone_number, city_of_living)
VALUES
    ('Иван', 'Иванов', 25, '1234567', 'MOSCOW'),
    ('Петр', 'Петров', 30, '7654321', 'MOSCOW'),
    ('Сергей', 'Сергеев', 35, '5555555', 'SPB'),
    ('Анна', 'Аннова', 28, '1111111', 'MOSCOW'),
    ('Мария', 'Марьева', 40, '2222222', 'EKATERINBURG');
-- rollback DELETE FROM persons;