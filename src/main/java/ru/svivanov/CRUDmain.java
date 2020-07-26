package ru.svivanov;

import ru.svivanov.models.Auto;
import ru.svivanov.models.User;
import ru.svivanov.services.UserService;

import java.sql.SQLException;

public class CRUDmain {
    public static void main(String[] args) throws SQLException {

        UserService userService = new UserService();
        User user = new User("Masha",26);
        userService.saveUser(user);
        Auto ferrari = new Auto("Ferrari", "red");
        ferrari.setUser(user);
        user.addAuto(ferrari);
        Auto ford = new Auto("Ford", "black");
        ford.setUser(user);
        user.addAuto(ford);
        userService.updateUser(user);
    }
}
