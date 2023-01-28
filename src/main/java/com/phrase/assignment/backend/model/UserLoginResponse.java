package com.phrase.assignment.backend.model;

import java.util.StringJoiner;

public class UserLoginResponse {
    private User user;
    private String token;

    public UserLoginResponse() {
        // empty on purpose
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", UserLoginResponse.class.getSimpleName() + "[", "]")
                .add("user=" + user)
                .add("token='" + token + "'")
                .toString();
    }

    public static class User {
        private String userName;
        private String firstName;
        private String lastName;
        private String email;

        public User() {
            // empty on purpose
        }

        public String getUserName() {
            return userName;
        }

        public void setUserName(String userName) {
            this.userName = userName;
        }

        public String getFirstName() {
            return firstName;
        }

        public void setFirstName(String firstName) {
            this.firstName = firstName;
        }

        public String getLastName() {
            return lastName;
        }

        public void setLastName(String lastName) {
            this.lastName = lastName;
        }

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", User.class.getSimpleName() + "[", "]")
                    .add("userName='" + userName + "'")
                    .add("firstName='" + firstName + "'")
                    .add("lastName='" + lastName + "'")
                    .add("email='" + email + "'")
                    .toString();
        }
    }
}
