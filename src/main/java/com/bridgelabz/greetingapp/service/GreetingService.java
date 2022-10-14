package com.bridgelabz.greetingapp.service;

import org.springframework.stereotype.Service;

@Service
public class GreetingService implements IGreetingService {
    @Override
    public String getMessage() {
        return "Hello World!!!";
    }

    @Override
    public String getGreetingMessage(String firstName, String lastName) {
        return "Hello " + firstName + "" + lastName;
    }

    @Override
    public String postMessage(String firstName, String lastName) {
        return "Hello " + firstName + "" + lastName;
    }

}
