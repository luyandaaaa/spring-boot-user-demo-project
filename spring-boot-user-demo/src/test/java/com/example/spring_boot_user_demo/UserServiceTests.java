package com.example.spring_boot_user_demo;

import com.example.repo.FakeRepo;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import com.example.service.UserServiceImpl; // Adjust the package path if necessary
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.ArgumentMatchers.anyLong;
import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.Mockito.*;

class UserServiceTests {

    @Mock
    private FakeRepo fakeRepo;

    @InjectMocks
    private UserServiceImpl userService;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    void testAddUser() {
        when(fakeRepo.insertUser(anyLong(), eq("John"), eq("Doe")))
            .thenReturn("John added"); 
        String result = userService.addUser("John", "Doe");
        assertTrue(result.matches("John added with ID: \\d+"));
        verify(fakeRepo, times(1)).insertUser(anyLong(), eq("John"), eq("Doe"));
    }

    @Test
    void testRemoveUser() {
        when(fakeRepo.deleteUser(1L)).thenReturn("John");
        
        String result = userService.removeUser(1L);
        assertEquals("John removed", result);
        verify(fakeRepo, times(1)).deleteUser(1L);
    }

    @Test
    void testGetUser() {
        when(fakeRepo.findUserById(1L)).thenReturn("John Doe");
        
        String result = userService.getUser(1L);
        assertEquals("Hello John Doe", result);
        verify(fakeRepo, times(1)).findUserById(1L);
    }
}