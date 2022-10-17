package com.bridgelabz.greetingapp.service;

import com.bridgelabz.greetingapp.Exception.UserException;
import com.bridgelabz.greetingapp.dto.UserDto;
import com.bridgelabz.greetingapp.model.User;
import com.bridgelabz.greetingapp.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService implements IUserService{
    @Autowired
    private UserRepository userRepo;

    @Override
    public User addUser(UserDto userdto) {
        User user = new User(userdto);
        return userRepo.save(user);
    }
    @Override
    public User getUserById(int id) {
        return userRepo.findById(id).orElseThrow(() -> new UserException("User with Id " + id
                + " Doesn't Exists...!"));
    }
}
