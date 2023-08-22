package com.example.m3l13_uniform.repository;

import com.example.m3l13_uniform.entity.User;

import java.util.Arrays;
import java.util.List;

public class UserRepository {
    private List<User> users = Arrays.asList(
            new User(1, "Tony Soprano", "qwerty"),
            new User(2, "Dr. Jennifer Melfi", "12345"),
            new User(3, "Corrado \"Junior\" Soprano", "oldButGold"),
            new User(4, "Christopher Moltisanti", "09987654321"),
            new User(5,  "Paulie \"Walnuts\" Gualtieri", "whereIsMy50K"));

    // CRUD -> Create Read Update Delete

    public List<User> getAllUsers() {
        return users;
    }

    public User getUserById(Integer id){
        return users.get(id - 1);
    }

    public User updateUserById(Integer id, String newLogin, String newPassword)
    {
        users.get(id - 1).setLogin(newLogin);
        users.get(id - 1).setPassword(newPassword);

        return users.get(id - 1);
    }


}
