package com.bridgelabz.greetingapp.model;

import com.bridgelabz.greetingapp.dto.UserDto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class User {
    @Id
    @GeneratedValue
    private int id;
    private String firstname;
    private String lastname;

    public User(UserDto userdto) {
        this.firstname = userdto.firstname;
        this.lastname = userdto.lastname;
    }

    public User() {
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstName) {
        this.firstname = firstName;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    @Override
    public String toString() {
        return firstname + lastname;
    }

    public void updateUser(UserDto userdto) {
        this.firstname = userdto.firstname;
        this.lastname = userdto.lastname;
    }
}
