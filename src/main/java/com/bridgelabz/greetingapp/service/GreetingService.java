package com.bridgelabz.greetingapp.service;

import com.bridgelabz.greetingapp.dto.UserDto;
import com.bridgelabz.greetingapp.model.Greeting;
import com.bridgelabz.greetingapp.repository.GreetingAppRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GreetingService implements IGreetingService {

    @Autowired
    private GreetingAppRepository greetingRepo;

    @Override
    public String getMessage() {
        return "Hello World!!!";
    }

    @Override
    public Greeting addGreeting(UserDto userdto) {
        Greeting greeting = new Greeting(userdto);
        return greetingRepo.save(greeting);
    }
}