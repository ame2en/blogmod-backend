package com.example.blogmod.service;

import com.example.blogmod.entity.Role;
import com.example.blogmod.entity.User;
import com.example.blogmod.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserService {
    private final UserRepository userRepository;

    public User createTestUser() {
        User user = new User();
        user.setName("Ameen");
        user.setEmail("ameen@test.com");
        user.setPassword("password");
        user.setRole(Role.USER);

        return userRepository.save(user);
    }

}
