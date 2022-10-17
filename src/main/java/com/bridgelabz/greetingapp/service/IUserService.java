package com.bridgelabz.greetingapp.service;

import com.bridgelabz.greetingapp.dto.UserDto;
import com.bridgelabz.greetingapp.model.User;

import java.util.List;

public interface IUserService {
    User addUser(UserDto userdto);
    User getUserById(int id);
    List<User> getAllUsers();

    User updateUser(UserDto userdto, int id);

    void deleteUserById(int id);
}
