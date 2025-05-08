package com.example.repo;

import com.example.model.User;
import org.springframework.stereotype.Repository;

@Repository
public class FakeRepo implements FakeRepoInterface {
    private User[] users = new User[10];
    private int userCount = 0;

    @Override
    public String insertUser(long id, String name, String surname) {
        if (userCount < users.length) {
            users[userCount++] = new User(id, name, surname);
            return name + " added";
        }
        return "Database full";
    }

    

}


