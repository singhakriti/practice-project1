package com.vc.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vc.entity.Users;
import com.vc.repository.UsersRepository;

@Service
public class LoginService {

    @Autowired
    private UsersRepository usersRepository;

    public boolean authenticate(String email, String password) {
        Optional<Users> userOptional = usersRepository.findById(email);
        return userOptional.map(user -> user.getPassword().equals(password)).orElse(false);
    }
}



