package com.phrase.assignment.service.impl;

import com.phrase.assignment.backend.PhraseBackendLoginService;
import com.phrase.assignment.backend.model.UserLoginRequest;
import com.phrase.assignment.service.LoginService;
import com.phrase.assignment.service.model.User;
import com.phrase.assignment.service.repository.UserRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class LoginServiceImpl implements LoginService {
    private static final Logger logger = LoggerFactory.getLogger(LoginServiceImpl.class);
    private final UserRepository userRepository;
    private final PhraseBackendLoginService phraseBackendLoginService;

    public LoginServiceImpl(UserRepository userRepository, PhraseBackendLoginService phraseBackendLoginService) {
        this.userRepository = userRepository;
        this.phraseBackendLoginService = phraseBackendLoginService;
    }

    @Override
    public String login(User user) {
        //userRepository.findby
//        Optional<User> resultUser = userRepository.findById(user.getId());
//        if (resultUser.isPresent()) {
//            logger.debug("The user token was found in DB");
//            return resultUser.get().getToken();
//        }
        logger.debug("The user token was not found in DB, trying to get new one");
        // if the token is not present. Get new one

        UserLoginRequest userLoginRequest = new UserLoginRequest(user.getUsername(), user.getPassword());
        Optional<String> token = phraseBackendLoginService.getUserToken(userLoginRequest);
        if (token.isPresent()) {
            user.setToken(token.get());
            userRepository.save(user);
        }
        return token.orElseThrow();
    }
}
