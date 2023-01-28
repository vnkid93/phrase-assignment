package com.phrase.assignment.backend.model;

import java.util.StringJoiner;

public class UserLoginRequest {
    private String userName;
    private String password;

    public UserLoginRequest() {
        // empty on purpose
    }

    public UserLoginRequest(String userName, String password) {
        this.userName = userName;
        this.password = password;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", UserLoginRequest.class.getSimpleName() + "[", "]")
                .add("userName='" + userName + "'")
                .add("password='" + password + "'")
                .toString();
    }
}
