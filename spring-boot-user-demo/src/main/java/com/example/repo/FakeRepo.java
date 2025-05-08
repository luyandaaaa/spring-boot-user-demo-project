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

    @Override
    public String findUserById(long id) {
        for (User user : users) {
            if (user != null && user.getId() == id) {
                return user.getName() + " " + user.getSurname();
            }
        }
        return "User not found";
    }

    @Override
    public String deleteUser(long id) {
        for (int i = 0; i < users.length; i++) {
            if (users[i] != null && users[i].getId() == id) {
                String name = users[i].getName();
                users[i] = null;
                return name + " removed";
            }
        }
        return "User not found";
    }


    

}


