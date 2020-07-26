package ru.svivanov.services;


import ru.svivanov.DAO.UserDAOImpl;
import ru.svivanov.models.Auto;
import ru.svivanov.models.User;

import java.util.List;

public class UserService {

    private UserDAOImpl usersDao = new UserDAOImpl();

    public UserService() {
    }

    public User findUser(int id) {
        return usersDao.findById(id);
    }

    public void saveUser(User user) {
        System.out.println(usersDao.contains(user));
            usersDao.save(user);

    }

    public void deleteUser(User user) {
        usersDao.delete(user);
    }

    public void updateUser(User user) {
        usersDao.update(user);
    }

    public boolean containsUser(User user) {return usersDao.contains(user);}

    public List<User> findAllUsers() {
        return usersDao.findAll();
    }

    public Auto findAutoById(int id) {
        return usersDao.findAutoById(id);
    }


}
