package es.com.javacourse.jdbc.data;

import es.com.javacourse.jdbc.domain.Person;

import java.sql.*;
import java.util.*;

import static es.com.javacourse.jdbc.data.ConnectionServer.*;

public class PersonDAO {
    private static final String SQL_SELECT = "SELECT id_person, name, surname, email, phone FROM person";
    private static final String SQL_INSERT = "INSERT INTO person(name, surname, email, phone) VALUES (?, ?, ?, ?)";
    private static final String SQL_UPDATE = "UPDATE person SET name = ?, surname = ?, email = ?, phone = ? WHERE id_person = ?";
    private static final String SQL_DELETE = "DELETE FROM person WHERE id_person= ?";

    public List<Person> select(){
        Connection conn = null;
        PreparedStatement stm = null;
        ResultSet rs = null;
        Person person;
        List<Person> persons = new ArrayList<>();

        try {
            conn = getConnection();
            stm = conn.prepareStatement(SQL_SELECT);
            rs = stm.executeQuery();

            while(rs.next()){
                int idPersona = rs.getInt("id_person");
                String name = rs.getString("name");
                String surname = rs.getString("surname");
                String email = rs.getString("email");
                String phone = rs.getString("phone");

                person = new Person(idPersona, name, surname,email,phone);

                persons.add(person);
            }
        } catch (SQLException e) {
            e.printStackTrace(System.out);
        } finally {
            try {
                close(rs);
                close(stm);
                close(conn);
            } catch (SQLException e) {
                e.printStackTrace(System.out);
            }

        }

        return persons;
    }

    public int insert(Person person){
        Connection conn = null;
        PreparedStatement stm = null;
        int registers = 0;
        try {
            conn = getConnection();
            stm = conn.prepareStatement(SQL_INSERT);
            stm.setString(1, person.getName());
            stm.setString(2,  person.getSurname());
            stm.setString(3,  person.getEmail());
            stm.setString(4,  person.getPhone());
            registers = stm.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace(System.out);
        } finally {
            try {
                close(stm);
                close(conn);
            } catch (SQLException e) {
                e.printStackTrace(System.out);
            }

        }
        return registers;
    }

    public int update (Person person){
        Connection conn = null;
        PreparedStatement stm = null;
        int updatedRegisters = 0;

        try {
            conn = getConnection();
            stm = conn.prepareStatement(SQL_UPDATE);
            stm.setString(1, person.getName());
            stm.setString(2,  person.getSurname());
            stm.setString(3,  person.getEmail());
            stm.setString(4,  person.getPhone());
            stm.setInt(5, person.getIdPerson());
            updatedRegisters = stm.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace(System.out);
        } finally {
            try {
                close(stm);
                close(conn);
            } catch (SQLException e) {
                e.printStackTrace(System.out);
            }
        }

        return updatedRegisters;
    }

    public int delete(Person person){
        Connection conn = null;
        PreparedStatement stm = null;
        int deletedRegisters = 0;
        try {
            conn = getConnection();
            stm = conn.prepareStatement(SQL_DELETE);
            stm.setInt(1, person.getIdPerson());
            deletedRegisters = stm.executeUpdate(); // return the number of modified registers
        } catch (SQLException e) {
            e.printStackTrace(System.out);
        }

        return deletedRegisters;
    }
}
