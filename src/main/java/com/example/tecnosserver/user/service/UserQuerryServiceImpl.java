package com.example.tecnosserver.user.service;

import com.example.tecnosserver.user.exception.ListEmptyException;
import com.example.tecnosserver.user.model.User;
import com.example.tecnosserver.user.repo.UserRepo;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserQuerryServiceImpl implements UserQuerryService {
    UserRepo userRepo;


    public UserQuerryServiceImpl(UserRepo userRepo) {
        this.userRepo = userRepo;
    }


    @Override
    public Optional<User> findByEmail(String email) {
        Optional<User> user = userRepo.findByEmail(email);
        if (user.isPresent()) {
            return user;
        } else {
            throw new ListEmptyException("User with email " + email + " not found");
        }
    }
}
