package com.example.tecnosserver.user.service;

import com.example.tecnosserver.user.model.User;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public interface UserQuerryService {
    Optional<User> findByEmail(String email);
}
