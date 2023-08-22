package com.example.m3l13_uniform.service;

import com.example.m3l13_uniform.entity.User;
import com.example.m3l13_uniform.repository.UserRepository;

import java.util.List;

public class UserService {

    // !!!!!!!!! //
    UserRepository userRepository = new UserRepository();

    public void printAllUsersToConsole(){
        System.out.println(userRepository.getAllUsers());
    }

    public List<User> getAllUsers() {
        return userRepository.getAllUsers();
    }

    public void printUserToConsoleById(Integer id){
        System.out.println(userRepository.getUserById(id));
    }

    public User getUserById(Integer id) {
        return userRepository.getUserById(id);
    }

    public User updateUserById(Integer id, String newLogin, String newPassword){
        userRepository.updateUserById(id, newLogin, newPassword);
        return userRepository.getUserById(id);
    }


}
