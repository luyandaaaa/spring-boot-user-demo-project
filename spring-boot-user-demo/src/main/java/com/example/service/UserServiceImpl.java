package com.example.service;
import com.example.repo.FakeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    private final FakeRepo fakeRepo;
    private long currentId = 1L;


    @Autowired
    public UserServiceImpl(FakeRepo fakeRepo) {
        this.fakeRepo = fakeRepo;
    }
    @Override
    public String addUser(String name, String surname) {
        fakeRepo.insertUser(currentId, name, surname);
        String result = name + " added with ID: " + currentId;
        currentId++;  // Increment for next user
        return result;
    }

    @Override
    public String removeUser(long id) {
        return fakeRepo.deleteUser(id) + " removed";
    }

    @Override
    public String getUser(long id) {
        return "Hello " + fakeRepo.findUserById(id);
    }
}
