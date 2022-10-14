package com.bridgelabz.greetingapp.service;

public interface IGreetingService {
    public String getMessage();
    public String getGreetingMessage(String firstName, String lastName);
    public String postMessage(String firstName, String lastName);
}
