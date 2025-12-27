package ru.buzmakov.springcourse.dao;

import org.springframework.jdbc.core.RowMapper;
import ru.buzmakov.springcourse.models.Person;

import java.sql.ResultSet;
import java.sql.SQLException;

public class PersonMapper implements RowMapper<Person> {
    @Override
    public Person mapRow(ResultSet resultSet, int i) throws SQLException {
        Person person = new Person(
                resultSet.getInt("id"),
                resultSet.getString("name"),
                resultSet.getInt("age"),
                resultSet.getString("email")
        );
        return person;
    }
}
