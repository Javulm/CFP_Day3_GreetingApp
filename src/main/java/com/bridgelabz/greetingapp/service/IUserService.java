package com.bridgelabz.greetingapp.service;

import com.bridgelabz.greetingapp.dto.UserDto;
import com.bridgelabz.greetingapp.model.User;

public interface IUserService {
    User addUser(UserDto userdto);
    User getUserById(int id);
}
