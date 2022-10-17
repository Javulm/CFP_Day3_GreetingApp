package com.bridgelabz.greetingapp.controller;

import com.bridgelabz.greetingapp.dto.UserDto;
import com.bridgelabz.greetingapp.model.Greeting;
import com.bridgelabz.greetingapp.model.User;
import com.bridgelabz.greetingapp.repository.UserRepository;
import com.bridgelabz.greetingapp.service.IGreetingService;
import com.bridgelabz.greetingapp.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
import java.util.concurrent.atomic.AtomicLong;

@RestController
@RequestMapping("/home")
public class GreetingController {
    private static final String template = "Hello %s!";
    private static final AtomicLong counter = new AtomicLong();
    @Autowired
    private UserRepository userRepo;
    @Autowired
    private IUserService userService;
    @Autowired
    private IGreetingService greetingService;

    @GetMapping("/greeting")
    public Greeting greeting(@RequestParam(value = "name", defaultValue = "World") String name) {
        return new Greeting(counter.incrementAndGet(), String.format(template, name));
    }

    @GetMapping("/getgreeting/{name}")
    public Greeting sayHello(@PathVariable String name) {
        return new Greeting(counter.incrementAndGet(), String.format(template, name));
    }

    @GetMapping("/getfullname")
    public Greeting satHello(User user) {
        return new Greeting(counter.incrementAndGet(), String.format(template, user.getFirstname() + " " + user.getLastname()));
    }

    @PostMapping("/postgreeting")
    public Greeting sayHello(@RequestBody Greeting greeting) {
        return new Greeting(counter.incrementAndGet(), String.format(template, greeting.getContent()));
    }

    @PutMapping("/putmapping/{counter}")
    public Greeting sayHello(@PathVariable long counter, @RequestParam(value = "content") String content) {
        return new Greeting(counter, String.format(template, content));
    }

    @GetMapping("/getgreeting")
    public String greeting() {
        return greetingService.getMessage();
    }

    @PostMapping("/add")
    public Greeting addUser(@RequestBody UserDto userdto) {
        userService.addUser(userdto);
        return greetingService.addGreeting(userdto);
    }

    @GetMapping("/getbyid/{id}")
    public User getUserById(@PathVariable int id) {
        return userService.getUserById(id);
    }

    @GetMapping("/getall")
    public List<User> getUser() {
        return userService.getAllUsers();
    }

    @PutMapping("/update")
    public User updateUser(@RequestBody UserDto userdto, @RequestParam int id) {
        return userService.updateUser(userdto, id);
    }

    @DeleteMapping("deletebyid/{id}")
    public void deleteById(@PathVariable int id) {
        userService.deleteUserById(id);
    }
}
