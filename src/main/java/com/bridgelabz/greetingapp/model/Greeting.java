package com.bridgelabz.greetingapp.model;

import com.bridgelabz.greetingapp.dto.UserDto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Greeting {
    @Id
    @GeneratedValue
    private long id;
    private String content;

    public Greeting(long id, String content) {
        this.id = id;
        this.content = content;
    }

    public Greeting() {
    }

    public Greeting(UserDto userdto) {
        this.content = "Hello " + userdto.firstname + " " + userdto.lastname;
    }

    public long getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return "Greeting{" +
                "id=" + id +
                ", content='" + content + '\'' +
                '}';
    }
}
