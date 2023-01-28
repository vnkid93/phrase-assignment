package com.phrase.assignment.service;

import com.phrase.assignment.service.model.User;

public interface LoginService {

    /**
     * Log in process
     * @param user the log in parameter of user
     * @return String token of the login session
     */
    String login(User user);
}
