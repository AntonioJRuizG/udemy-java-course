package es.com.javacourse.jdbc;

import es.com.javacourse.jdbc.data.PersonDAO;
import es.com.javacourse.jdbc.data.UserDAO;
import es.com.javacourse.jdbc.domain.Person;
import es.com.javacourse.jdbc.domain.User;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        PersonDAO personDao = new PersonDAO();
        List<Person> persons = personDao.select();
        persons.forEach(person -> System.out.println("person = " + person));

        // Insert new Person object
        // Person person1 = new Person("Carlos", "Fer", "email@prueba", "123123123");
        // personDao.insert(person1);
        // List<Person> persons2 = personDao.select();
        // persons2.forEach(person -> System.out.println("person = " + person));

        // Update existing person object
        Person updatePerson = new Person(4, "Carlos", "Ruiz", "prueba@prueba", "3333333");
        personDao.update(updatePerson);
        List<Person> persons3 = personDao.select();
        persons3.forEach(person -> System.out.println("person = " + person));


        System.out.println("\n");
        // Delete person
        Person personToDelete = new Person(4);
        personDao.delete(personToDelete);
        List<Person> persons4 = personDao.select();
        persons4.forEach(person -> System.out.println("person = " + person));


        System.out.println("\n \n");
        // Users management
        UserDAO userDao = new UserDAO();
        List<User> users = userDao.select();
        /* TEMP System.out.println("\n Show user list.");
        users.forEach(user -> System.out.println("user: " + user));

        System.out.println("\n Insert user: ");
        User user1 = new User("Antonio", "PassWord");
        userDao.insert(user1);
        users = userDao.select();
        users.forEach(user -> System.out.println("user: " + user));

        System.out.println("\n Update user: ");
        User userToUpdate = new User(1, "AntonioUpdated", "password-updated");
        userDao.update(userToUpdate);
        users = userDao.select();
        users.forEach(user -> System.out.println("user: " + user));*/

        System.out.println("\n Delete user: ");
        User userToDelete = new User(5);
        userDao.delete(userToDelete);
        users = userDao.select();
        users.forEach(user -> System.out.println("user: " + user));
    }
}