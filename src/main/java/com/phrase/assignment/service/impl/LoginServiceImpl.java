package com.phrase.assignment.service.impl;

import com.phrase.assignment.service.LoginService;
import com.phrase.assignment.service.model.User;
import com.phrase.assignment.backend.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class LoginServiceImpl implements LoginService {
    private final UserRepository userRepository;

    public LoginServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public String login(User user) {
        Optional<User> resultUser = userRepository.findById(user.getId());
        return resultUser.orElseThrow().getToken();
    }
}
